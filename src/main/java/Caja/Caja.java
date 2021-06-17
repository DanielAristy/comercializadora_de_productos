package Caja;

import Caja.values.CajaId;
import Caja.values.Saldo;
import Caja.values.Turno;
import co.com.sofka.domain.generic.AggregateEvent;

public class Caja extends AggregateEvent<CajaId> {
    protected Turno turno;
    protected Saldo saldo;
    public Caja(CajaId entityId) {
        super(entityId);
    }
}
