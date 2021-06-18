package Caja.usecase;

import Caja.Caja;
import Caja.commands.CambiarActivo;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarEstadoUseCase extends UseCase<RequestCommand<CambiarActivo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarActivo> cambiarActivoRequestCommand) {
        var command = cambiarActivoRequestCommand.getCommand();
        var caja = Caja.from(command.getCajaId(), retrieveEvents(command.getCajaId().value()));
        caja.cambiarActivo(caja.getEstado());
        emit().onResponse(new ResponseEvents(caja.getUncommittedChanges()));
    }
}
