package Caja.events;

import Caja.values.ValorEnCaja;
import co.com.sofka.domain.generic.DomainEvent;

public class ValorEnCajaCambiado extends DomainEvent {
    private ValorEnCaja valorEnCaja;
    public ValorEnCajaCambiado(ValorEnCaja valorEnCaja) {
        super("comercializadora.caja.valorencajacambiado");
        this.valorEnCaja = valorEnCaja;
    }
}
