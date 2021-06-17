package Inventario.entity;

import Inventario.values.Fecha;
import Inventario.values.PedidoId;
import Inventario.values.TotalPedido;
import co.com.sofka.domain.generic.Entity;

public class Pedido extends Entity<PedidoId> {
    private Fecha fecha;
    private TotalPedido totalPedido;

    public Pedido(PedidoId entityId) {
        super(entityId);
    }
}
