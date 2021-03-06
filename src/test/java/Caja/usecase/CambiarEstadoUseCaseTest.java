package Caja.usecase;

import Caja.commands.CambiarEstado;
import Caja.events.CajaCreada;
import Caja.events.EstadoCambiado;
import Caja.values.CajaId;
import Caja.values.Estado;
import Caja.values.Fecha;
import Caja.values.Total;
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

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class CambiarEstadoUseCaseTest {

    private CambiarEstadoUseCase cambiarEstadoUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        cambiarEstadoUseCase = new CambiarEstadoUseCase();
        repository = mock(DomainEventRepository.class);
        cambiarEstadoUseCase.addRepository(repository);
    }

    @Test
    void cambiarActivoHappyPath(){
        //Arrange
        var command = new CambiarEstado(
                CajaId.of("1"),
                new Estado(false)
        );
        when(repository.getEventsBy("1")).thenReturn(events());
        //Act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("1")
                .syncExecutor(
                cambiarEstadoUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var eventos = response.getDomainEvents();
        //Assert
        //Evento
        EstadoCambiado estadoCambiado = (EstadoCambiado)eventos.get(0);
        Assertions.assertEquals("comercializadora.caja.estadocambiado", estadoCambiado.type);
    }

    private List<DomainEvent> events(){
        return List.of(new CajaCreada(//Evento
                new Estado(true),
                new Total(2000.0),
                new Fecha(new Date())
        ));
    }
}