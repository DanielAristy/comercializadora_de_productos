package Inventario.commands;

import Inventario.values.InventarioId;
import Inventario.values.TipoInventario;
import co.com.sofka.domain.generic.Command;

public class ActualizarTipoInventario implements Command {
    private final InventarioId inventarioId;
    private final TipoInventario tipoInventario;

    public ActualizarTipoInventario(InventarioId inventarioId, TipoInventario tipoInventario) {
        this.inventarioId = inventarioId;
        this.tipoInventario = tipoInventario;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public TipoInventario getTipoInventario() {
        return tipoInventario;
    }
}
