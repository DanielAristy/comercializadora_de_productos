package Caja.events;

import Caja.values.ClienteId;
import Caja.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAsociado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final ClienteId clienteId;
    public ClienteAsociado(ClienteId clienteId, EmpleadoId empleadoId) {
        super("comercializadora.caja.clienteasociado");
        this.clienteId = clienteId;
        this.empleadoId = empleadoId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
