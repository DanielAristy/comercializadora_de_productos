package Caja.commands;

import Caja.values.CajaId;
import Caja.values.Fecha;
import co.com.sofka.domain.generic.Command;

public class CambiarFecha implements Command {
    private final CajaId cajaId;
    private final Fecha fecha;

    public CambiarFecha(CajaId cajaId, Fecha fecha) {
        this.cajaId = cajaId;
        this.fecha = fecha;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
