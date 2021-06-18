package Inventario.events;

import Caja.values.Nombre;
import Inventario.values.Cantidad;
import Inventario.values.TipoProductoId;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoProductoAgregado extends DomainEvent {
    private final TipoProductoId tipoProductoId;
    private final Nombre nombre;
    private final Cantidad cantidad;
    public TipoProductoAgregado(TipoProductoId tipoProductoId, Nombre nombre, Cantidad cantidad) {
        super("comercializadora.inventario.tipoproductoagregado");
        this.tipoProductoId = tipoProductoId;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
}
