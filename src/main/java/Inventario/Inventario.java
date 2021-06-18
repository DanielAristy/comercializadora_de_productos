package Inventario;

import Caja.values.Nombre;
import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.events.DescripcionInventarioCambiado;
import Inventario.events.InventarioCreado;
import Inventario.events.ProductoAgregado;
import Inventario.events.TipoProductoAgregado;
import Inventario.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import java.util.List;
import java.util.Objects;

public class Inventario extends AggregateEvent<InventarioId> {
    protected IngresoProductoId ingresoProductoId;
    protected List<TipoProductoId> tipoProductos;
    protected List<ProductoId> productos;
    protected Descripcion descripcion;
    public Inventario(InventarioId entityId, List<TipoProducto> tipoProductos,
                      List<Producto> productos, Descripcion descripcion) {
        super(entityId);
        appendChange(new InventarioCreado(tipoProductos,productos, descripcion)).apply();
    }

    public void cambiarDescripcion(Descripcion descripcion){
        appendChange(new DescripcionInventarioCambiado(descripcion)).apply();
    }

    public void agregarProducto(ProductoId id, Nombre nombre,
                                Cantidad cantidad, Valor valor){
        appendChange(new ProductoAgregado(id,nombre,cantidad, valor)).apply();
    }

    public void agregarTipoProducto(TipoProductoId id, Nombre nombre, Cantidad cantidad){
        appendChange(new TipoProductoAgregado(id,nombre, cantidad )).apply();
    }
}
