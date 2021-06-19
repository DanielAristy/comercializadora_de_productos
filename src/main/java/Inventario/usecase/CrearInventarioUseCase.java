package Inventario.usecase;

import Inventario.Inventario;
import Inventario.commands.CrearInventario;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearInventarioUseCase extends UseCase<RequestCommand<CrearInventario>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearInventario> crearInventarioRequestCommand) {
        var command = crearInventarioRequestCommand.getCommand();
        var inventario = new Inventario(command.getId(), command.getTipoProductos()
                ,command.getProductos(), command.getDescripcion(),command.getTipo());
        emit().onResponse(new ResponseEvents((inventario.getUncommittedChanges())));
    }
}
