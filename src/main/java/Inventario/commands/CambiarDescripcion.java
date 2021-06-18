package Inventario.commands;

import Inventario.values.Descripcion;
import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Command;

public class CambiarDescripcion implements Command {
    private final InventarioId inventarioId;
    private final Descripcion descripcion;

    public CambiarDescripcion(InventarioId inventarioId, Descripcion descripcion) {
        this.inventarioId = inventarioId;
        this.descripcion = descripcion;
    }

    public InventarioId getInventarioId() {
        return inventarioId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
