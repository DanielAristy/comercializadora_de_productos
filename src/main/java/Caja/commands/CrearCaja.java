package Caja.commands;

import Caja.values.CajaId;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Turno turno;
    private final Valor valor;

    public CrearCaja(CajaId id, Turno turno, Valor valor) {
        this.id = id;
        this.turno = turno;
        this.valor = valor;
    }

    public CajaId getId() {
        return id;
    }

    public Turno getTurno() {
        return turno;
    }

    public Valor getSaldo() {
        return valor;
    }
}
