package Caja.commands;

import Caja.values.CajaId;
import Caja.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class AsociarEmpleado implements Command {
    private final CajaId cajaId;
    private final EmpleadoId empleadoId;

    public AsociarEmpleado(EmpleadoId empleadoId, CajaId cajaId) {
        this.cajaId = cajaId;
        this.empleadoId = empleadoId;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

}
