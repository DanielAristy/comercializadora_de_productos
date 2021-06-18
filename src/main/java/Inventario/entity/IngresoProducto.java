package Inventario.entity;

import Inventario.values.Cantidad;
import Inventario.values.IngresoProductoId;
import Inventario.values.ProductoId;
import Inventario.values.Proveedor;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class IngresoProducto extends Entity<IngresoProductoId> {
    private ProductoId productoId;
    private Cantidad cantidad;
    private Proveedor proveedor;

    public IngresoProducto(IngresoProductoId entityId, ProductoId productoId, Cantidad cantidad, Proveedor proveedor) {
        super(entityId);
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    //Comportamientos
    public void actualizarCantidadAIngresar(Cantidad cantidad){
        this.cantidad = Objects.requireNonNull(cantidad);
    }

    public void actualizarProveedor(Proveedor proveedor){
        this.proveedor = Objects.requireNonNull(proveedor);
    }

    public ProductoId productoId() {
        return productoId;
    }

    public Cantidad cantidadAIngresar() {
        return cantidad;
    }

    public Proveedor proveedor() {
        return proveedor;
    }
}
