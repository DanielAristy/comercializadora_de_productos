package Inventario.commands;

import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.values.Descripcion;
import Inventario.values.InventarioId;
import Inventario.values.TipoInventario;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CrearInventario implements Command {
    private final InventarioId id;
    private final List<TipoProducto> tipoProductos;
    private final List<Producto> productos;
    private final Descripcion descripcion;
    private final TipoInventario tipo;

    public CrearInventario(InventarioId id, List<TipoProducto> tipoProductos, List<Producto> productos, Descripcion descripcion, TipoInventario tipo) {
        this.id = id;
        this.tipoProductos = tipoProductos;
        this.productos = productos;
        this.descripcion = descripcion;
        this.tipo = tipo;
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

    public TipoInventario getTipo() {
        return tipo;
    }
}
