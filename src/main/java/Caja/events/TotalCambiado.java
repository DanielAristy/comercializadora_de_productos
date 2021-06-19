package Caja.events;

import Caja.values.Total;
import co.com.sofka.domain.generic.DomainEvent;

public class TotalCambiado extends DomainEvent {
    private Total total;
    public TotalCambiado(Total total) {
        super("comercializadora.caja.valorcambiado");
        this.total = total;
    }

    public Total getTotal() {
        return total;
    }
}
