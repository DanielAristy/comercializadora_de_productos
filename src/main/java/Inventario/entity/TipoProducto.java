package Inventario.entity;

import Inventario.values.Descuento;
import Inventario.values.NombreTipoProducto;
import Inventario.values.TipoProductoId;
import co.com.sofka.domain.generic.Entity;

public class TipoProducto extends Entity<TipoProductoId> {
    private NombreTipoProducto nombreTipoProducto;
    private Descuento descuento;
    public TipoProducto(TipoProductoId entityId) {
        super(entityId);
    }
}
