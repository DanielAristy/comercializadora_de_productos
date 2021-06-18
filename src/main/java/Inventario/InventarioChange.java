package Inventario;

import Inventario.entity.Producto;
import Inventario.entity.TipoProducto;
import Inventario.events.DescripcionInventarioCambiado;
import Inventario.events.InventarioCreado;
import Inventario.events.ProductoAgregado;
import Inventario.events.TipoProductoAgregado;
import co.com.sofka.domain.generic.EventChange;

public class InventarioChange extends EventChange {

    public InventarioChange(Inventario inventario){

        apply((DescripcionInventarioCambiado event) -> {
            inventario.descripcion = event.getDescripcion();
        });

        apply((InventarioCreado event) -> {
            inventario.tipoProductos = event.getTipoProductos();
            inventario.productos = event.getProductos();
            inventario.descripcion = event.getDescripcionInventario();
        });

        apply((ProductoAgregado event) -> {
            var numProductos = inventario.productos.size();
            if (numProductos == 10){
                throw new IllegalArgumentException("No se puede agregar mas de 10 Productos");
            }
            inventario.productos.add(new Producto(
                    event.getProductoId(),
                    event.getNombre(),
                    event.getCantidad(),
                    event.getValor()
            ));
        });

        apply((TipoProductoAgregado event) -> {
            var numProductos = inventario.tipoProductos.size();
            if (numProductos == 5){
                throw new IllegalArgumentException("No se puede agregar mas de 10 Tipo de Producto");
            }
            inventario.tipoProductos.add(new TipoProducto(
                    event.getTipoProductoId(),
                    event.getNombre(),
                    event.getCantidad()
            ));
        });
    }
}
