package Inventario.events;

import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.values.Descripcion;
import Inventario.values.InventarioId;
import Inventario.values.TipoInventario;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class InventarioCreado extends DomainEvent {
    private final InventarioId inventarioId;
    private final List<TipoProducto> tipoProductos;
    private final List<Producto> productos;
    private final Descripcion descripcion;
    private final TipoInventario tipo;


    public InventarioCreado(InventarioId inventarioId, List<TipoProducto> tipoProductos,
                            List<Producto> productos, Descripcion descripcion, TipoInventario tipo) {
        super("comercializadora.inventario.inventariocreado");
        this.inventarioId = inventarioId;
        this.tipoProductos = tipoProductos;
        this.productos = productos;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public List<TipoProducto> getTipoProductos() {
        return tipoProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Descripcion getDescripcionInventario() {
        return descripcion;
    }

    public TipoInventario getTipo() {
        return tipo;
    }
}
