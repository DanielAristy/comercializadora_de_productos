package Caja;

import Caja.events.CajaCreada;
import Caja.events.ClienteAsociado;
import Caja.events.TurnoCambiado;
import Caja.events.ValorEnCajaCambiado;
import Caja.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Caja extends AggregateEvent<CajaId> {
    protected Turno turno;
    protected ValorEnCaja valorEnCaja;
    protected ClienteId clienteId;
    protected EmpleadoId empleadoId;
    public Caja(CajaId id, Turno turno, ValorEnCaja valorEnCaja) {
        super(id);
        appendChange(new CajaCreada(turno, valorEnCaja)).apply();
    }

    public void asociarCliente(ClienteId clienteId){
        appendChange(new ClienteAsociado(clienteId,empleadoId)).apply();
    }

    public void cambiarTurno(Turno turno){
        appendChange(new TurnoCambiado(turno)).apply();
    }

    public void cambiarValorEnCaja(ValorEnCaja valorEnCaja){
        appendChange(new ValorEnCajaCambiado(valorEnCaja)).apply();
    }

}
