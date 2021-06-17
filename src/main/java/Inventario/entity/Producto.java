package Inventario.entity;

import Inventario.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    private NombreProducto nombreProducto;
    private CantidadProducto cantidadProductos;
    private DescripcionProducto descripcionProducto;
    private ValorProducto valorProducto;
    public Producto(ProductoId entityId, NombreProducto nombreProducto, CantidadProducto cantidadProductos, ValorProducto valorProducto, DescripcionProducto descripcionProducto) {
        super(entityId);
        this.nombreProducto = nombreProducto;
        this.cantidadProductos = cantidadProductos;
        this.valorProducto = valorProducto;
        this.descripcionProducto = descripcionProducto;
    }

    //comportamientos
    public void actulizarNombreProducto(NombreProducto nombreProducto){
        this.nombreProducto = Objects.requireNonNull(nombreProducto);
    }

    public void actualizarDescripcionProducto(DescripcionProducto descripcionProducto){
        this.descripcionProducto = Objects.requireNonNull(descripcionProducto);
    }

    public void actualizarValorProducto(ValorProducto valorProducto){
        this.valorProducto = Objects.requireNonNull(valorProducto);
    }

    public ValorProducto valorProducto() {
        return valorProducto;
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
