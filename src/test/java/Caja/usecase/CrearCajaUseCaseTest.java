package Caja.usecase;

import Caja.commands.CrearCaja;
import Caja.events.CajaCreada;
import Caja.values.Activo;
import Caja.values.CajaId;
import Caja.values.Estado;
import Caja.values.Total;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearCajaUseCaseTest {
    private CrearCajaUseCase crearCajaUseCase;

    @BeforeEach
    public void setup(){
        crearCajaUseCase = new CrearCajaUseCase();
    }

    @Test
    void crearCajaHappyPath(){

        //Arrange
        var command = new CrearCaja(
                CajaId.of("adnlg"),
                new Estado(true),
                new Total(0.0)
        );

        //act
        var response = UseCaseHandler.getInstance().syncExecutor(
                crearCajaUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var events = response.getDomainEvents();

        //asserts
        CajaCreada cajaCreada = (CajaCreada) events.get(0);
        Assertions.assertEquals(true, cajaCreada.getEstado().value().booleanValue());
        Assertions.assertEquals(0.0, cajaCreada.getTotal().value().doubleValue());
    }

}