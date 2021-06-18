package Caja;

import Caja.events.CajaCreada;
import Caja.events.ClienteAsociado;
import Caja.events.TurnoCambiado;
import Caja.events.TotalCambiado;
import co.com.sofka.domain.generic.EventChange;

public class CajaChange extends EventChange {

    public CajaChange(Caja caja) {

        apply((CajaCreada event) -> {
            caja.activo = event.getActivo();
            caja.total = event.getTotal();
        });
        apply((ClienteAsociado event) -> {
            caja.clienteId = event.getClienteId();
            caja.empleadoId = event.getEmpleadoId();
        });

        apply((TurnoCambiado event) -> {
            caja.activo = event.getActivo();
        });

        apply((TotalCambiado event) -> {
            caja.total = event.getTotal();
        });
    }
}
