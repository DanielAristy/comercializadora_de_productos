package Caja.commands;

import Caja.values.Activo;
import Caja.values.CajaId;
import Caja.values.Estado;
import Caja.values.Total;
import co.com.sofka.domain.generic.Command;

public class CrearCaja implements Command {
    private final CajaId id;
    private final Estado estado;
    private final Total total;

    public CrearCaja(CajaId id, Estado estado, Total total) {
        this.id = id;
        this.estado = estado;
        this.total = total;
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
}
