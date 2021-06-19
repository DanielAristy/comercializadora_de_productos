package Caja;

import Caja.entity.Cliente;
import Caja.events.*;
import Caja.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class Caja extends AggregateEvent<CajaId> {
    protected Estado estado;
    protected Total total;
    protected Fecha fecha;
    protected ClienteId clienteId;
    protected EmpleadoId empleadoId;
    protected List<Cliente> clientes;


    public Caja(CajaId id, Estado estado, Total total, Fecha fecha) {
        super(id);
        appendChange(new CajaCreada(estado, total, fecha)).apply();
    }

    public static Caja from(CajaId cajaId, List<DomainEvent> events){
        var caja = new Caja(cajaId);
        events.forEach(caja::applyEvent);
        return caja;
    }

    private Caja(CajaId id){
        super(id);
        subscribe(new CajaChange(this));
    }


    public void asociarEmpleado(EmpleadoId empleadoId, CajaId cajaId){
        appendChange(new EmpleadoAsociado(empleadoId,cajaId)).apply();
    }

    public void cambiarEstado(Estado estado){
        appendChange(new EstadoCambiado(estado)).apply();
    }

    public void cambiarTotal(Total total){
        appendChange(new TotalCambiado(total)).apply();
    }

    protected Optional<Cliente> getClienteId(ClienteId clienteId){
        return clientes.stream().filter(id -> id.equals(clienteId)).findFirst();
    }

    public void cambiarFecha(Fecha fecha){
        appendChange(new FechaCambiada(fecha)).apply();
    }

    public Estado getEstado() {
        return estado;
    }

    public Total getTotal() {
        return total;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
