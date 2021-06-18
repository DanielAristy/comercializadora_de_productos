package Caja.values;

import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Identity;

public class CajaId extends Identity {
    public CajaId(){

    }

    public CajaId(String id){
        super(id);
    }

    public static CajaId of(String id){
        return new CajaId(id);
    }
}
