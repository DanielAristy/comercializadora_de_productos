package Inventario.entity;

import Inventario.values.Fecha;
import Inventario.values.PedidoId;
import Inventario.values.ProductoId;
import Inventario.values.TotalPedido;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;

public class Pedido extends Entity<PedidoId> {
    private Fecha fecha;
    private List<ProductoId> productos;
    private TotalPedido totalPedido;

    public Pedido(PedidoId entityId, Fecha fecha, List<ProductoId> productos, TotalPedido totalPedido) {
        super(entityId);
        this.fecha = fecha;
        this.productos = productos;
        this.totalPedido = totalPedido;
    }

    //Comportamientos
    public void actualizarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha);
    }

    public void actualizarTotal(TotalPedido totalPedido){
        this.totalPedido = Objects.requireNonNull(totalPedido);
    }

    public List<ProductoId> productos() {
        return productos;
    }

    public Fecha fecha() {
        return fecha;
    }

    public TotalPedido totalPedido() {
        return totalPedido;
    }
}
