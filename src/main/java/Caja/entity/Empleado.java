package Caja.entity;

import Caja.values.CajaId;
import Caja.values.EmpleadoId;
import Caja.values.Estado;
import Caja.values.NombreEmpleado;
import co.com.sofka.domain.generic.Entity;

public class Empleado extends Entity<EmpleadoId> {
    private CajaId cajaId;
    private NombreEmpleado nombreEmpleado;
    private Estado estado;
    public Empleado(EmpleadoId entityId, CajaId cajaId, NombreEmpleado nombreEmpleado, Estado estado) {
        super(entityId);
    }
}
