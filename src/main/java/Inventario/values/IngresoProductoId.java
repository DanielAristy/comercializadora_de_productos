package Inventario.values;

import co.com.sofka.domain.generic.Identity;

public class IngresoProductoId extends Identity {

    public IngresoProductoId(){

    }

    public IngresoProductoId(String id){
        super(id);
    }

    public static IngresoProductoId of(String id){
        return new IngresoProductoId(id);
    }
}
