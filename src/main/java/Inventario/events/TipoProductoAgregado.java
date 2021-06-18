package Inventario.events;

import Caja.values.Nombre;
import Inventario.values.Cantidad;
import Inventario.values.TipoProductoId;
import Inventario.values.Valor;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoProductoAgregado extends DomainEvent {
    private final TipoProductoId tipoProductoId;
    private final Nombre nombre;
    private final Cantidad cantidad;
    private final Valor valor;
    public TipoProductoAgregado(TipoProductoId tipoProductoId, Nombre nombre, Cantidad cantidad, Valor valor) {
        super("comercializadora.inventario.tipoproductoagregado");
        this.tipoProductoId = tipoProductoId;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public TipoProductoId getTipoProductoId() {
        return tipoProductoId;
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
