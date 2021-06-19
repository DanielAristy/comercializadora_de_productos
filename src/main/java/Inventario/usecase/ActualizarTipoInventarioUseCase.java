package Inventario.usecase;

import Inventario.Inventario;
import Inventario.commands.ActualizarTipoInventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarTipoInventarioUseCase extends UseCase<RequestCommand<ActualizarTipoInventario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarTipoInventario> actualizarTipoInventarioRequestCommand) {
        var command = actualizarTipoInventarioRequestCommand.getCommand();
        var inventario = Inventario.from(command.getInventarioId(),retrieveEvents(command.getInventarioId().value()));
        inventario.actualizarTipoInventario(inventario.getTipo());
        emit().onResponse(new ResponseEvents(inventario.getUncommittedChanges()));
    }
}
