package Caja.usecase;

import Caja.Caja;
import Caja.commands.CambiarFecha;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarFechaUseCase extends UseCase<RequestCommand<CambiarFecha>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarFecha> cambiarFechaRequestCommand) {
        var command = cambiarFechaRequestCommand.getCommand();
        var caja = Caja.from(command.getCajaId(), retrieveEvents(command.getCajaId().value()));
        caja.cambiarFecha(caja.getFecha());
        emit().onResponse(new ResponseEvents(caja.getUncommittedChanges()));
    }
}
