package Caja.entity;

import Caja.values.ClienteId;
import Caja.values.Direccion;
import Caja.values.NombreCliente;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<ClienteId> {
    private NombreCliente nombreCliente;
    private Direccion direccion;
    public Cliente(ClienteId entityId, NombreCliente nombreCliente, Direccion direccion) {
        super(entityId);
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
    }
    //Comportamientos de clase

    public void actualizarNombreCliente(NombreCliente nombreCliente){
        this.nombreCliente = Objects.requireNonNull(nombreCliente);
    }

    public void actualizarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

    public NombreCliente nombreCliente() {
        return nombreCliente;
    }

    public Direccion direccion() {
        return direccion;
    }
}
