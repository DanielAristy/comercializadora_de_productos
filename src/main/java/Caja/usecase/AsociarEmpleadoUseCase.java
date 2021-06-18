package Caja.usecase;

import Caja.Caja;
import Caja.commands.AsociarEmpleado;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class AsociarEmpleadoUseCase extends UseCase<RequestCommand<AsociarEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AsociarEmpleado> asociarEmpleadoRequestCommand) {
        var command = asociarEmpleadoRequestCommand.getCommand();
        var caja = Caja.from(command.getCajaId(), retrieveEvents(command.getCajaId().value()));
//        caja.asociarEmpleado(command.getEmpleadoId());
    }
}
