package Caja.commands;

import Caja.values.CajaId;
import Caja.values.Estado;
import co.com.sofka.domain.generic.Command;

public class CambiarEstado implements Command {
    private final CajaId cajaId;
    private final Estado estado;

    public CambiarEstado(CajaId cajaId, Estado estado) {
        this.cajaId = cajaId;
        this.estado = estado;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
