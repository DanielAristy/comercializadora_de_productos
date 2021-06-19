package Inventario.usecase;

import Caja.events.CajaCreada;
import Caja.values.Nombre;
import Inventario.Inventario;
import Inventario.commands.CrearInventario;
import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.events.InventarioCreado;
import Inventario.values.*;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearInventarioUseCaseTest {

    private CrearInventarioUseCase crearInventarioUseCase;
    private List<Producto> productos;
    private List<TipoProducto> tipoProductos;

    @BeforeEach
    public void setup(){
        crearInventarioUseCase = new CrearInventarioUseCase();
        productos = new ArrayList<>();
        productos.add(new Producto(new ProductoId("1"),new Nombre("Leche Colanta"),new Cantidad(2),new Valor(2000.0)));
        productos.add(new Producto(new ProductoId("2"),new Nombre("Quesito Ranchero"),new Cantidad(2),new Valor(2000.0)));
        tipoProductos = new ArrayList<>();
        tipoProductos.add(new TipoProducto(new TipoProductoId("1"),new Nombre("Lacteos"),new Cantidad(2)));
    }

    @Test
    public void CrearInventarioHappyPath(){
        //Arrange
        var command = new CrearInventario(
                InventarioId.of("lmnop"),
                tipoProductos,
                productos,
                new Descripcion("Productos de la canasta familiar"),
                new TipoInventario("Virtual")
        );

        //act
        var response = UseCaseHandler.getInstance().syncExecutor(
                crearInventarioUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var events = response.getDomainEvents();

        //asserts
        InventarioCreado inventarioCreado = (InventarioCreado)events.get(0);
        Assertions.assertEquals(tipoProductos, inventarioCreado.getTipoProductos());
        Assertions.assertEquals(productos, inventarioCreado.getProductos());
        Assertions.assertEquals("Productos de la canasta familiar", inventarioCreado.getDescripcionInventario().value());

    }
}