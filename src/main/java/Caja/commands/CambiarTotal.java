package Caja.commands;

import Caja.values.CajaId;
import Caja.values.Total;
import co.com.sofka.domain.generic.Command;

public class CambiarTotal implements Command {
    private final CajaId cajaId;
    private final Total total;

    public CambiarTotal(CajaId cajaId, Total total) {
        this.cajaId = cajaId;
        this.total = total;
    }

    public CajaId getCajaId() {
        return cajaId;
    }

    public Total getTotal() {
        return total;
    }
}
