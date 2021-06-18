package Caja.commands;

import Caja.values.Activo;
import Caja.values.CajaId;
import Caja.values.Total;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Activo activo;
    private final Total total;

    public CrearCaja(CajaId id, Activo activo, Total total) {
        this.id = id;
        this.activo = activo;
        this.total = total;
    }

    public CajaId getId() {
        return id;
    }

    public Activo getActivo() {
        return activo;
    }

    public Total getTotal() {
        return total;
    }
}
