package Inventario.values;

import co.com.sofka.domain.generic.Identity;

public class TipoProductoId extends Identity {
    public TipoProductoId(){

    }

    public TipoProductoId(String id){
        super(id);
    }

    public static TipoProductoId of(String id){
        return new TipoProductoId(id);
    }
}
