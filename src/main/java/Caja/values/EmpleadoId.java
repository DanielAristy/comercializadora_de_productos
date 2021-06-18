package Caja.values;

import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Identity;

public class EmpleadoId extends Identity {
    public EmpleadoId(){

    }

    public EmpleadoId(String id){
        super(id);
    }

    public static EmpleadoId of(String id){
        return new EmpleadoId(id);
    }
}
