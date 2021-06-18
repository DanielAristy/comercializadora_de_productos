package Caja.events;

import Caja.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class ValorEnCajaCambiado extends DomainEvent {
    private Total total;
    public ValorEnCajaCambiado(Total total) {
        super("comercializadora.caja.valorencajacambiado");
        this.total = total;
    }

    public Total getTotal() {
        return total;
    }
}
