package Caja.events;

import Caja.values.Activo;
import co.com.sofka.domain.generic.DomainEvent;

public class TurnoCambiado extends DomainEvent {
    private Activo activo;
    public TurnoCambiado(Activo activo) {
        super("comercializadora.caja.turnocambiado");
        this.activo = activo;
    }

    public Activo getActivo() {
        return activo;
    }
}
