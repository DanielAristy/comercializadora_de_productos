package Caja.entity;

import Caja.values.EmpleadoId;
import Caja.values.Activo;
import Caja.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoId> {
    private Nombre nombre;
    private Activo activo;
    public Empleado(EmpleadoId id, Nombre nombre, Activo activo) {
        super(id);
        this.nombre = nombre;
        this.activo = activo;
    }
    //Comportamientos
    public void actualizarNombreEmpleado(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarActivo(Activo activo){
        this.activo = Objects.requireNonNull(activo);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Activo estado() {
        return activo;
    }
}
