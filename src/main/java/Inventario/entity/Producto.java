package Inventario.entity;

import Inventario.values.DescripcionProducto;
import Inventario.values.NombreProducto;
import Inventario.values.ProductoId;
import co.com.sofka.domain.generic.Entity;

public class Producto extends Entity<ProductoId> {
    private NombreProducto nombreProducto;
    private DescripcionProducto descripcionProducto;
    public Producto(ProductoId entityId, NombreProducto nombreProducto, DescripcionProducto descripcionProducto) {
        super(entityId);
    }
}
