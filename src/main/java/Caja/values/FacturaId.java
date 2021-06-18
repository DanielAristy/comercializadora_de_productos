package Caja.values;

import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Identity;

public class FacturaId extends Identity {
    public FacturaId(){

    }

    public FacturaId(String id){
        super(id);
    }

    public static FacturaId of(String id){
        return new FacturaId(id);
    }
}
