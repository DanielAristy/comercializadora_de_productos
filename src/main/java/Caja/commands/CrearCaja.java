package Caja.commands;

import Caja.values.CajaId;
import Caja.values.Saldo;
import Caja.values.Turno;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Turno turno;
    private final Saldo saldo;

    public CrearCaja(CajaId id, Turno turno, Saldo saldo) {
        this.id = id;
        this.turno = turno;
        this.saldo = saldo;
    }

    public CajaId getId() {
        return id;
    }

    public Turno getTurno() {
        return turno;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
