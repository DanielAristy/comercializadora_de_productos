package Inventario;

import Inventario.values.Descripcion;
import Inventario.values.InventarioId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Inventario extends AggregateEvent<InventarioId> {
    protected PedidoId pedidoId;
    protected Set<TipoProducto> tipoProductos;
    protected Set<Producto> productos;
    protected Descripcion descripcion;
    public Inventario(InventarioId entityId,Set<TipoProducto> tipoProductos, Set<Producto> productos,Descripcion descripcion) {
        super(entityId);
    }
}
