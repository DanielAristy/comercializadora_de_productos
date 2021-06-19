package Caja;

import Caja.events.*;
import co.com.sofka.domain.generic.EventChange;

public class CajaChange extends EventChange {

    public CajaChange(Caja caja) {

        apply((CajaCreada event) -> {
            caja.estado = event.getEstado();
            caja.total = event.getTotal();
            caja.fecha = event.getFecha();
        });
        apply((EmpleadoAsociado event) -> {
//            caja. = event.getCajaId();
            caja.empleadoId = event.getEmpleadoId();
        });

        apply((EstadoCambiado event) -> {
            caja.estado = event.getEstado();
        });

        apply((FechaCambiada event) -> {
            caja.fecha = event.getFecha();
        });

        apply((TotalCambiado event) -> {
            caja.total = event.getTotal();
        });
    }
}
