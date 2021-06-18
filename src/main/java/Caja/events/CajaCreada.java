package Caja.events;

import Caja.values.Activo;
import Caja.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {
    private final Activo activo;
    private final Total total;
    public CajaCreada(Activo activo, Total total) {
        super("comercializadora.caja.cajacreada");
        this.activo = activo;
        this.total = total;
    }

    public Activo getActivo() {
        return activo;
    }

    public Total getTotal() {
        return total;
    }
}
