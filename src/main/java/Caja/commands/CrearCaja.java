package Caja.commands;

import Caja.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Estado estado;
    private final Total total;
    private final Fecha fecha;

    public CrearCaja(CajaId id, Estado estado, Total total, Fecha fecha) {
        this.id = id;
        this.estado = estado;
        this.total = total;
        this.fecha = fecha;
    }

    public CajaId getId() {
        return id;
    }

    public Estado getEstado() {
        return estado;
    }

    public Total getTotal() {
        return total;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
