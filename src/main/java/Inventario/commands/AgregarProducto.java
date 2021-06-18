package Inventario.commands;

import Caja.values.Nombre;
import Inventario.values.Cantidad;
import Inventario.values.ProductoId;
import Inventario.values.Valor;
import co.com.sofka.domain.generic.Command;

public class AgregarProducto implements Command {
    private final ProductoId id;
    private final Nombre nombre;
    private final Cantidad cantidad;
    private final Valor valor;

    public AgregarProducto(ProductoId id, Nombre nombre, Cantidad cantidad, Valor valor) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public ProductoId getId() {
        return id;
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
}
