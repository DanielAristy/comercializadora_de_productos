package Inventario.entity;

import Inventario.values.Fecha;
import Inventario.values.PedidoId;
import Inventario.values.ProductoId;
import Inventario.values.ValorTotalPedido;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Pedido extends Entity<PedidoId> {
    private Fecha fecha;
    private List<ProductoId> productos;
    private ValorTotalPedido valorTotalPedido;

    public Pedido(PedidoId entityId, Fecha fecha, List<ProductoId> productos, ValorTotalPedido valorTotalPedido) {
        super(entityId);
        this.fecha = fecha;
        this.productos = productos;
        this.valorTotalPedido = valorTotalPedido;
    }

    //Comportamientos
    public void actualizarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    public void actualizarTotal(ValorTotalPedido valorTotalPedido){
        this.valorTotalPedido = Objects.requireNonNull(valorTotalPedido);
    }

    public Optional<ProductoId> getProductoPorId(ProductoId productoId){
        return productos()
                .stream()
                .filter(id -> id.equals(productoId))
                .findFirst();
    }

    public List<ProductoId> productos() {
        return productos;
    }

    public Fecha fecha() {
        return fecha;
    }

    public ValorTotalPedido totalPedido() {
        return valorTotalPedido;
    }
}
