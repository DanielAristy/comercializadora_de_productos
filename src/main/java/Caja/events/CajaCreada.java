package Caja.events;

import Caja.values.ValorEnCaja;
import Caja.values.Turno;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {
    private final Turno turno;
    private final ValorEnCaja valorEnCaja;
    public CajaCreada(Turno turno, ValorEnCaja valorEnCaja) {
        super("comercializadora.caja.cajacreada");
        this.turno = turno;
        this.valorEnCaja = valorEnCaja;
    }

    public Turno getTurno() {
        return turno;
    }

    public ValorEnCaja getSaldo() {
        return valorEnCaja;
    }
}
