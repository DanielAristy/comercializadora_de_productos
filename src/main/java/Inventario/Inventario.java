package Inventario;

import Caja.values.Nombre;
import Caja.values.Total;
import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.events.DescripcionInventarioCambiado;
import Inventario.events.InventarioCreado;
import Inventario.events.ProductoAgregado;
import Inventario.events.TipoProductoAgregado;
import Inventario.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import java.util.List;
import java.util.Optional;

public class Inventario extends AggregateEvent<InventarioId> {
    protected IngresoProductoId ingresoProductoId;
    protected List<TipoProducto> tipoProductos;
    protected List<Producto> productos;
    protected Descripcion descripcion;


    public Inventario(InventarioId id, List<TipoProducto> tipoProductos,
                      List<Producto> productos, Descripcion descripcion) {
        super(id);
        appendChange(new InventarioCreado(id,tipoProductos,productos, descripcion)).apply();
    }

    private Inventario(InventarioId id){
        super(id);
        subscribe(new InventarioChange(this));
    }

    public void cambiarDescripcion(Descripcion descripcion){
        appendChange(new DescripcionInventarioCambiado(descripcion)).apply();
    }

    public void agregarProducto(ProductoId id, Nombre nombre,
                                Cantidad cantidad, Valor valor){
        appendChange(new ProductoAgregado(id,nombre,cantidad, valor)).apply();
    }

    public void agregarTipoProducto(TipoProductoId id, Nombre nombre, Cantidad cantidad, Valor valor){
        appendChange(new TipoProductoAgregado(id,nombre,cantidad,valor)).apply();
    }

    public Optional<Producto> getProductoId(ProductoId productoId){
        return productos.stream().filter(id -> id.equals(productoId)).findFirst();
    }

    public Optional<TipoProducto> getProductoId(TipoProductoId tipoProductoId){
        return tipoProductos.stream().filter(id -> id.equals(tipoProductoId)).findFirst();
    }
}
