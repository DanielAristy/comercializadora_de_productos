package Inventario.entity;

import Inventario.values.Descuento;
import Inventario.values.NombreTipoProducto;
import Inventario.values.TipoProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class TipoProducto extends Entity<TipoProductoId> {
    private NombreTipoProducto nombreTipoProducto;
    private Descuento descuento;
    public TipoProducto(TipoProductoId entityId, NombreTipoProducto nombreTipoProducto, Descuento descuento) {
        super(entityId);
        this.nombreTipoProducto = nombreTipoProducto;
        this.descuento = descuento;
    }
    //Comportamientos
    public void actualizarNombreTipoProducto(NombreTipoProducto nombreTipoProducto){
        this.nombreTipoProducto = Objects.requireNonNull(nombreTipoProducto);
    }

    public void actualizarDescuento(Descuento descuento){
        this.descuento = Objects.requireNonNull(descuento);
    }

    public NombreTipoProducto nombreTipoProducto() {
        return nombreTipoProducto;
    }

    public Descuento descuento() {
        return descuento;
    }
}
