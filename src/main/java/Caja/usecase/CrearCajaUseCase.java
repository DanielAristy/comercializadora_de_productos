package Caja.usecase;

import Caja.Caja;
import Caja.commands.CrearCaja;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearCajaUseCase extends UseCase<RequestCommand<CrearCaja>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCaja> crearCajaRequestCommand) {
        //
        var command = crearCajaRequestCommand.getCommand();
        var caja = new Caja(command.getId(), command.getActivo(), command.getTotal());
        emit().onResponse(new ResponseEvents((caja.getUncommittedChanges())));
    }
}
