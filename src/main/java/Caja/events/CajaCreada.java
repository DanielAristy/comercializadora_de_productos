package Caja.events;

import Caja.values.Activo;
import Caja.values.Estado;
import Caja.values.Fecha;
import Caja.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {
    private final Total total;
    private final Estado estado;
    private final Fecha fecha;
    public CajaCreada(Estado estado, Total total, Fecha fecha) {
        super("comercializadora.caja.cajacreada");
        this.estado = estado;
        this.total = total;
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Total getTotal() {
        return total;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
