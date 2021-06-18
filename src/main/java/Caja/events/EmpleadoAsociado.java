package Caja.events;

import Caja.values.CajaId;
import Caja.values.ClienteId;
import Caja.values.EmpleadoId;
import co.com.sofka.domain.generic.DomainEvent;

public class EmpleadoAsociado extends DomainEvent {
    private final EmpleadoId empleadoId;
    private final CajaId cajaId;
    public EmpleadoAsociado(EmpleadoId empleadoId, CajaId cajaId) {
        super("comercializadora.caja.clienteasociado");
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
