package Inventario.entity;

import Inventario.values.CantidadProducto;
import Inventario.values.DescripcionProducto;
import Inventario.values.NombreProducto;
import Inventario.values.ProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    private NombreProducto nombreProducto;
    private CantidadProducto cantidadProductos;
    private DescripcionProducto descripcionProducto;
    public Producto(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProductos, DescripcionProducto descripcionProducto) {
        super(entityId);
        this.nombreProducto = nombreProducto;
        this.cantidadProductos = cantidadProductos;
        this.descripcionProducto = descripcionProducto;
    }

    //comportamientos
    public void actulizarNombreProducto(NombreProducto nombreProducto){
        this.nombreProducto = Objects.requireNonNull(nombreProducto);
    }

    public void actualizarDescripcionProducto(DescripcionProducto descripcionProducto){
        this.descripcionProducto = Objects.requireNonNull(descripcionProducto);
    }

    public CantidadProducto cantidadProductos() {
        return cantidadProductos;
    }

    public NombreProducto nombreProducto() {
        return nombreProducto;
    }

    public DescripcionProducto descripcionProducto() {
        return descripcionProducto;
    }
}
