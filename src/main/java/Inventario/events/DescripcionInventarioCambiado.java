package Inventario.events;

import Inventario.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionInventarioCambiado extends DomainEvent {
    private Descripcion descripcion;
    public DescripcionInventarioCambiado(Descripcion descripcion) {
        super("comercializadora.inventario.descripcioninventariocambiado");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
