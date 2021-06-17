package Inventario;

import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.values.DescripcionInventario;
import Inventario.values.InventarioId;
import Inventario.values.PedidoId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Inventario extends AggregateEvent<InventarioId> {
    protected PedidoId pedidoId;
    protected Set<TipoProducto> tipoProductos;
    protected Set<Producto> productos;
    protected DescripcionInventario descripcionInventario;
    public Inventario(InventarioId entityId, Set<TipoProducto> tipoProductos, Set<Producto> productos, DescripcionInventario descripcionInventario) {
        super(entityId);
    }
}
