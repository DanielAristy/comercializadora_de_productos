package Caja.events;

import Caja.values.Activo;
import Caja.values.Estado;
import co.com.sofka.domain.generic.DomainEvent;

public class EstadoCambiado extends DomainEvent {
    private Estado estado;
    public EstadoCambiado(Estado estado) {
        super("comercializadora.caja.estadocambiado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
