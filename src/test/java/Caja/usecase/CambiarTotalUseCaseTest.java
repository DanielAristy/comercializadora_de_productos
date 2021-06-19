package Caja.usecase;

import Caja.commands.CambiarTotal;
import Caja.events.CajaCreada;
import Caja.events.TotalCambiado;
import Caja.values.CajaId;
import Caja.values.Estado;
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

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class CambiarTotalUseCaseTest {

    private CambiarTotalUseCase cambiarTotalUseCase;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        cambiarTotalUseCase = new CambiarTotalUseCase();
        repository = mock(DomainEventRepository.class);
        cambiarTotalUseCase.addRepository(repository);
    }

    @Test
    void cambiarTotalHappyPath(){
        //Arrange
        var command = new CambiarTotal(
                CajaId.of("xxx"),
                new Total(0.0)
        );

        when(repository.getEventsBy("xxx")).thenReturn(events());

        //Act

        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("xxx")
                .syncExecutor(
                        cambiarTotalUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var events = response.getDomainEvents();

        //Assert

        TotalCambiado totalCambiado = (TotalCambiado)events.get(0);
        Assertions.assertEquals("comercializadora.caja.valorcambiado",totalCambiado.type);

    }

    private List<DomainEvent> events(){
        return List.of(new CajaCreada(//Evento
                new Estado(true),
                new Total(2000.0)
        ));
    }


}