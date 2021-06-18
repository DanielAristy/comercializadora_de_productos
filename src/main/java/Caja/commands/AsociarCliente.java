package Caja.commands;

import Caja.values.CajaId;
import Caja.values.ClienteId;
import Caja.values.EmpleadoId;
import co.com.sofka.domain.generic.Command;

public class AsociarCliente implements Command {
    private final CajaId cajaId;
    private final EmpleadoId empleadoId;
    private final ClienteId clienteId;

    public AsociarCliente(CajaId cajaId, EmpleadoId empleadoId, ClienteId clienteId) {
        this.cajaId = cajaId;
        this.empleadoId = empleadoId;
        this.clienteId = clienteId;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
