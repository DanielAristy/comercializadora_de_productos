package Inventario.usecase;

import Caja.Caja;
import Inventario.Inventario;
import Inventario.commands.CambiarDescripcion;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CambiarDescripcionUseCase extends UseCase<RequestCommand<CambiarDescripcion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarDescripcion> cambiarDescripcionRequestCommand) {
        var command = cambiarDescripcionRequestCommand.getCommand();
        var inventario = Inventario.from(command.getInventarioId(), retrieveEvents(command.getInventarioId().value()));
        inventario.cambiarDescripcion(inventario.getDescripcion());
        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));
    }
}
