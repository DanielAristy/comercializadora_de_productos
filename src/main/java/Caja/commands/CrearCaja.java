package Caja.commands;

import Caja.values.CajaId;
import Caja.values.ValorEnCaja;
import Caja.values.Turno;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Turno turno;
    private final ValorEnCaja valorEnCaja;

    public CrearCaja(CajaId id, Turno turno, ValorEnCaja valorEnCaja) {
        this.id = id;
        this.turno = turno;
        this.valorEnCaja = valorEnCaja;
    }

    public CajaId getId() {
        return id;
    }

    public Turno getTurno() {
        return turno;
    }

    public ValorEnCaja getSaldo() {
        return valorEnCaja;
    }
}
