package Caja.events;

import Caja.values.Saldo;
import Caja.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {
    private final Turno turno;
    private final Saldo saldo;
    public CajaCreada(Turno turno, Saldo saldo) {
        super("comercializadora.caja.cajacreada");
        this.turno = turno;
        this.saldo = saldo;
    }

    public Turno getTurno() {
        return turno;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
