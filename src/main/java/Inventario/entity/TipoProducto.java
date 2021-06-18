package Inventario.entity;

import Caja.values.Nombre;
import Inventario.values.Cantidad;
import Inventario.values.TipoProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class TipoProducto extends Entity<TipoProductoId> {
    private Nombre nombre;
    private Cantidad cantidad;
    public TipoProducto(TipoProductoId entityId, Nombre nombre, Cantidad cantidad) {
        super(entityId);
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    //Comportamientos
    public void actualizarNombreTipoProducto(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
