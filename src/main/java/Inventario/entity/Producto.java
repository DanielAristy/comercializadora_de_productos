package Inventario.entity;

import Caja.values.Nombre;
import Inventario.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    private Nombre nombre;
    private Cantidad cantidad;
    private Valor valor;

    public Producto(ProductoId entityId, Nombre nombre, Cantidad cantidad, Valor valor) {
        super(entityId);
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }


    //comportamientos
    public void actulizarNombreProducto(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarValorProducto(Valor valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    public Valor valorProducto() {
        return valor;
    }

    public Cantidad getCantidad() {
        return cantidad;
    }
}
