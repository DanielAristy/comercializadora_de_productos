package Caja.usecase;

import Caja.commands.AsociarEmpleado;
import Caja.entity.Empleado;
import Caja.events.CajaCreada;
import Caja.events.EmpleadoAsociado;
import Caja.values.*;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class AsociarEmpleadoUseCaseTest {

    private AsociarEmpleadoUseCase asociarEmpleadoUseCase;
    private Empleado empleado;

    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        empleado = new Empleado(new EmpleadoId("xxx"), new Nombre("Daniel"), new Activo(true));
        asociarEmpleadoUseCase = new AsociarEmpleadoUseCase();
        repository = mock(DomainEventRepository.class);
        asociarEmpleadoUseCase.addRepository(repository);
    }

    @Test
    void AsociarEmpleadoHappyPath(){
        //Arrange
        var command = new AsociarEmpleado(
                EmpleadoId.of("xxx"),
                CajaId.of("www")
        );
        when(repository.getEventsBy("www")).thenReturn(events());
        //Act
        var response = UseCaseHandler.getInstance()
                .setIdentifyExecutor("www")
                .syncExecutor(
                        asociarEmpleadoUseCase, new RequestCommand<>(command)
                ).orElseThrow();

        var events = response.getDomainEvents();
        //Assert
        //Evento
        EmpleadoAsociado empleadoAsociado = (EmpleadoAsociado) events.get(0);
        Assertions.assertEquals("xxx", empleadoAsociado.getEmpleadoId().value());
    }

    private List<DomainEvent> events(){
        return List.of(new CajaCreada(//Evento
                new Estado(true),
                new Total(2000.0),
                new Fecha(new Date())
        ));
    }
}

