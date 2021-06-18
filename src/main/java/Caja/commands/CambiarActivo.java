package Caja.commands;

import Caja.Caja;
import Caja.values.Activo;
import co.com.sofka.domain.generic.Command;

public class CambiarActivo implements Command {
    private final Caja caja;
    private final Activo activo;

    public CambiarActivo(Caja caja, Activo activo) {
        this.caja = caja;
        this.activo = activo;
    }

    public Caja getCaja() {
        return caja;
    }

    public Activo getActivo() {
        return activo;
    }
}
