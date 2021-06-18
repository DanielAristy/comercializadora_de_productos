package Caja;

import Caja.events.CajaCreada;
import Caja.events.ClienteAsociado;
import Caja.events.TurnoCambiado;
import Caja.events.ValorEnCajaCambiado;
import Caja.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

public class Caja extends AggregateEvent<CajaId> {
    protected Activo activo;
    protected Total total;
    protected ClienteId clienteId;
    protected EmpleadoId empleadoId;
    public Caja(CajaId id, Activo activo, Total total) {
        super(id);
        appendChange(new CajaCreada(activo, total)).apply();
    }

    public void asociarCliente(ClienteId clienteId){
        appendChange(new ClienteAsociado(clienteId,empleadoId)).apply();
    }

    public void cambiarTurno(Activo activo){
        appendChange(new TurnoCambiado(activo)).apply();
    }

    public void cambiarValorEnCaja(Total total){
        appendChange(new ValorEnCajaCambiado(total)).apply();
    }

}
