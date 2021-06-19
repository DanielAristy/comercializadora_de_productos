package Inventario.events;

import Inventario.values.TipoInventario;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoInventarioActualizado extends DomainEvent {
    private final TipoInventario tipo;
    public TipoInventarioActualizado(TipoInventario tipo) {
        super("comercializadora.inventario.tipodeinvetarioactualizado");
        this.tipo = tipo;
    }

    public TipoInventario getTipo() {
        return tipo;
    }
}
