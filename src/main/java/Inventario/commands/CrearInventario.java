package Inventario.commands;

import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.values.Descripcion;
import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CrearInventario implements Command {
    private final InventarioId id;
    private final List<TipoProducto> tipoProductos;
    private final List<Producto> productos;
    private final Descripcion descripcion;

    public CrearInventario(InventarioId id, List<TipoProducto> tipoProductos, List<Producto> productos, Descripcion descripcion) {
        this.id = id;
        this.tipoProductos = tipoProductos;
        this.productos = productos;
        this.descripcion = descripcion;
    }

    public InventarioId getId() {
        return id;
    }

    public List<TipoProducto> getTipoProductos() {
        return tipoProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
