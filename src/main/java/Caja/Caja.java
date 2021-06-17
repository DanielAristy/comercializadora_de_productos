package Caja;

import Caja.events.CajaCreada;
import Caja.events.ClienteAsociado;
import Caja.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Caja extends AggregateEvent<CajaId> {
    protected Turno turno;
    protected Saldo saldo;
    protected ClienteId clienteId;
    protected EmpleadoId empleadoId;
    public Caja(CajaId entityId, Turno turno, Saldo saldo) {
        super(entityId);
        appendChange(new CajaCreada(turno,saldo)).apply();
    }


    public void asociarCliente(ClienteId clienteId){
        appendChange(new ClienteAsociado(clienteId,empleadoId)).apply();
    }

}
