package Inventario.events;

import Caja.values.Nombre;
import Inventario.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class ProductoAgregado extends DomainEvent {
    private final ProductoId productoId;
    private final Nombre nombre;
    private final Cantidad cantidad;
    private final Valor valor;
    public ProductoAgregado(ProductoId productoId, Nombre nombre, Cantidad cantidad, Valor valor) {
        super("comercializadora.inventario.productoagregado");
        this.productoId = productoId;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }

    public Valor getValor() {
        return valor;
    }

    public Valor getValorProducto() {
        return valor;
    }
}
