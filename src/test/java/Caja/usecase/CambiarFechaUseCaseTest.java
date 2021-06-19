package Caja.usecase;

import Caja.commands.CambiarFecha;
import Caja.events.CajaCreada;
import Caja.events.FechaCambiada;
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

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class CambiarFechaUseCaseTest {

    private CambiarFechaUseCase cambiarFechaUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        cambiarFechaUseCase = new CambiarFechaUseCase();
        repository = mock(DomainEventRepository.class);
        cambiarFechaUseCase.addRepository(repository);
    }

    @Test
    void cambiarFechaHappyPath(){
        //Arrange
        var command = new CambiarFecha(
                CajaId.of("xx-xx"),
                new Fecha(new Date())
        );
        when(repository.getEventsBy("xx-xx")).thenReturn(events());

        //Act

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xx-xx")
                .syncExecutor(
                        cambiarFechaUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();

        //Assert

        FechaCambiada fechaCambiada = (FechaCambiada)events.get(0);
        Assertions.assertEquals("comercializadora.caja.fechacambiada",fechaCambiada.type);
    }

    private List<DomainEvent> events(){
        return List.of(new CajaCreada(//Evento
                new Estado(true),
                new Total(2000.0),
                new Fecha(new Date())
        ));
    }

}