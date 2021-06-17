package Caja.entity;

import Caja.values.CajaId;
import Caja.values.EmpleadoId;
import Caja.values.Estado;
import Caja.values.NombreEmpleado;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {
    private CajaId cajaId;
    private NombreEmpleado nombreEmpleado;
    private Estado estado;
    public Empleado(EmpleadoId entityId, CajaId cajaId, NombreEmpleado nombreEmpleado, Estado estado) {
        super(entityId);
        this.cajaId = cajaId;
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

    public CajaId cajaId() {
        return cajaId;
    }

    public NombreEmpleado nombreEmpleado() {
        return nombreEmpleado;
    }

    public Estado estado() {
        return estado;
    }
}
