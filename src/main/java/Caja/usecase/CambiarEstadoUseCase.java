package Caja.usecase;

import Caja.Caja;
import Caja.commands.CambiarEstado;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarEstadoUseCase extends UseCase<RequestCommand<CambiarEstado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarEstado> cambiarActivoRequestCommand) {
        var command = cambiarActivoRequestCommand.getCommand();
        var caja = Caja.from(command.getCajaId(), retrieveEvents(command.getCajaId().value()));
        caja.cambiarActivo(caja.getEstado());
        emit().onResponse(new ResponseEvents(caja.getUncommittedChanges()));
    }
}
