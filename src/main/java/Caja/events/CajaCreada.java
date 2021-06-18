package Caja.events;

import Caja.values.Activo;
import Caja.values.Estado;
import Caja.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class CajaCreada extends DomainEvent {
    private final Total total;
    private final Estado estado;
    public CajaCreada(Estado estado, Total total) {
        super("comercializadora.caja.cajacreada");
        this.estado = estado;
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public Total getTotal() {
        return total;
    }
}
