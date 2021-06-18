package Caja.entity;

import Caja.values.ClienteId;
import Caja.values.Direccion;
import Caja.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {
    private Nombre nombre;
    private Direccion direccion;
    public Cliente(ClienteId entityId, Nombre nombre, Direccion direccion) {
        super(entityId);
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //Comportamientos de clase
    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public Nombre nombreCliente() {
        return nombre;
    }

    public Direccion direccion() {
        return direccion;
    }
}
