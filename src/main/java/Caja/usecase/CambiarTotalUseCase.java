package Caja.usecase;

import Caja.Caja;
import Caja.commands.CambiarTotal;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarTotalUseCase extends UseCase<RequestCommand<CambiarTotal>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarTotal> cambiarTotalRequestCommand) {
        var commmand = cambiarTotalRequestCommand.getCommand();
        var caja = Caja.from(commmand.getCajaId(), retrieveEvents(commmand.getCajaId().value()));
        caja.cambiarTotal(commmand.getTotal());
        emit().onResponse(new ResponseEvents(caja.getUncommittedChanges()));
    }
}
