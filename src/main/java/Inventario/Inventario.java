package Inventario;

import Caja.values.CajaId;
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
import co.com.sofka.domain.generic.DomainEvent;

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


    //Factoria para crear un objeto con instancias y valores guardados
    public static Inventario from(InventarioId inventarioId, List<DomainEvent> events){
        var inventario = new Inventario(inventarioId);
        events.forEach(inventario::applyEvent);
        return inventario;
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

    protected Optional<Producto> getProductoId(ProductoId productoId){
        return productos.stream().filter(id -> id.equals(productoId)).findFirst();
    }

    protected Optional<TipoProducto> getProductoId(TipoProductoId tipoProductoId){
        return tipoProductos.stream().filter(id -> id.equals(tipoProductoId)).findFirst();
    }

    public IngresoProductoId getIngresoProductoId() {
        return ingresoProductoId;
    }

    public List<TipoProducto> getTipoProductos() {
        return tipoProductos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
