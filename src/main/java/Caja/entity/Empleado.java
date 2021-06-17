package Caja.entity;

import Caja.values.CajaId;
import Caja.values.EmpleadoId;
import Caja.values.Estado;
import Caja.values.NombreEmpleado;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {
    private NombreEmpleado nombreEmpleado;
    private Estado estado;
    public Empleado(EmpleadoId entityId, NombreEmpleado nombreEmpleado, Estado estado) {
        super(entityId);
        this.nombreEmpleado = nombreEmpleado;
        this.estado = estado;
    }
    //Comportamientos
    public void actualizarNombreEmpleado(NombreEmpleado nombreEmpleado){
        this.nombreEmpleado = Objects.requireNonNull(nombreEmpleado);
    }

    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }


    public NombreEmpleado nombreEmpleado() {
        return nombreEmpleado;
    }

    public Estado estado() {
        return estado;
    }
}
