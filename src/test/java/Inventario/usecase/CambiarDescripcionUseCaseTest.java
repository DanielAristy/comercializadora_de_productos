package Inventario.usecase;

import Caja.values.Nombre;
import Inventario.Inventario;
import Inventario.commands.CambiarDescripcion;
import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.events.DescripcionInventarioCambiado;
import Inventario.events.InventarioCreado;
import Inventario.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class CambiarDescripcionUseCaseTest {

    private CambiarDescripcionUseCase cambiarDescripcionUseCase;
    private List<Producto> productos;
    private List<TipoProducto> tipoProductos;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        cambiarDescripcionUseCase = new CambiarDescripcionUseCase();
        repository = mock(DomainEventRepository.class);
        cambiarDescripcionUseCase.addRepository(repository);

        productos = new ArrayList<>();
        productos.add(new Producto(new ProductoId("1"),new Nombre("Leche Colanta"),new Cantidad(2),new Valor(2000.0)));
        productos.add(new Producto(new ProductoId("2"),new Nombre("Quesito Ranchero"),new Cantidad(2),new Valor(2000.0)));
        tipoProductos = new ArrayList<>();
        tipoProductos.add(new TipoProducto(new TipoProductoId("1"),new Nombre("Lacteos"),new Cantidad(2)));
    }

    @Test
    void cambiarDescripcionHappyPath(){
        //Arrange
        var command = new CambiarDescripcion(//Commando
                InventarioId.of("adflg"),
                new Descripcion("Productos canasta familia")
        );
        when(repository.getEventsBy("adflg")).thenReturn(events());

        //Act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("adflg")
                .syncExecutor(
                        cambiarDescripcionUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();

        //Assert
        //Evento
        DescripcionInventarioCambiado cambiado = (DescripcionInventarioCambiado)events.get(0);
        Assertions.assertEquals("comercializadora.inventario.descripcioninventariocambiado", cambiado.type);
    }

    private List<DomainEvent> events(){
        return List.of(new InventarioCreado(//Evento
                new InventarioId("adflg"),
                tipoProductos,
                productos,
                new Descripcion("Productos para todos")
        ));
    }

}