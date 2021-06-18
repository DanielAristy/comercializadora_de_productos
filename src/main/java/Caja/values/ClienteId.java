package Caja.values;

import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class ClienteId extends Identity {
    public ClienteId(){

    }

    public ClienteId(String id){
        super(id);
    }

    public static ClienteId of(String id){
        return new ClienteId(id);
    }
}
