package Caja;

import Caja.events.CajaCreada;
import Caja.events.EmpleadoAsociado;
import Caja.events.EstadoCambiado;
import Caja.events.TotalCambiado;
import co.com.sofka.domain.generic.EventChange;

public class CajaChange extends EventChange {

    public CajaChange(Caja caja) {

        apply((CajaCreada event) -> {
            caja.estado = event.getEstado();
            caja.total = event.getTotal();
        });
        apply((EmpleadoAsociado event) -> {
//            caja. = event.getCajaId();
            caja.empleadoId = event.getEmpleadoId();
        });

        apply((EstadoCambiado event) -> {
            caja.estado = event.getEstado();
        });

        apply((TotalCambiado event) -> {
            caja.total = event.getTotal();
        });
    }
}
