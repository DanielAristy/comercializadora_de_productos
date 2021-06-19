package Caja.events;

import Caja.values.Fecha;
import co.com.sofka.domain.generic.DomainEvent;

public class FechaCambiada extends DomainEvent {
    private final Fecha fecha;
    public FechaCambiada(Fecha fecha) {
        super("comercializadora.caja.fechacambiada");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
