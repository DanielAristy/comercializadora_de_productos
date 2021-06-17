package Inventario.entity;

import Inventario.values.CantidadAIngresar;
import Inventario.values.IngresoProductoId;
import Inventario.values.ProductoId;
import Inventario.values.Proveedor;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;

public class IngresoProducto extends Entity<IngresoProductoId> {
    private ProductoId productoId;
    private CantidadAIngresar cantidadAIngresar;
    private Proveedor proveedor;

    public IngresoProducto(IngresoProductoId entityId, ProductoId productoId, CantidadAIngresar cantidadAIngresar, Proveedor proveedor) {
        super(entityId);
        this.productoId = productoId;
        this.cantidadAIngresar = cantidadAIngresar;
        this.proveedor = proveedor;
    }

    //Comportamientos
    public void actualizarCantidadAIngresar(CantidadAIngresar cantidadAIngresar){
        this.cantidadAIngresar = Objects.requireNonNull(cantidadAIngresar);
    }

    public void actualizarProveedor(Proveedor proveedor){
        this.proveedor = Objects.requireNonNull(proveedor);
    }

    public ProductoId productoId() {
        return productoId;
    }

    public CantidadAIngresar cantidadAIngresar() {
        return cantidadAIngresar;
    }

    public Proveedor proveedor() {
        return proveedor;
    }
}
