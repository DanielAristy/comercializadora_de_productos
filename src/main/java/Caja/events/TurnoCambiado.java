package Caja.events;

import Caja.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;

public class TurnoCambiado extends DomainEvent {
    private Turno turno;
    public TurnoCambiado(Turno turno) {
        super("comercializadora.caja.turnocambiado");
        this.turno = turno;
    }
}
