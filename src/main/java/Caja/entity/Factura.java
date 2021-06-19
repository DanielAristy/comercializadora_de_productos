package Caja.entity;

import Caja.values.CajaId;
import Caja.values.ClienteId;
import Caja.values.FacturaId;
import Caja.values.Total;
import Inventario.values.ProductoId;
import co.com.sofka.domain.generic.Entity;
import java.util.List;
import java.util.Objects;

public class Factura extends Entity<FacturaId> {
    private List<ProductoId> productos;
    private Total total;
    public Factura(FacturaId entityId, List<ProductoId> productos,Total total) {
        super(entityId);
        this.productos = productos;
        this.total = total;
    }

    //Comportamientos
    public void actualizarTotalFactura(Total total){
        this.total = Objects.requireNonNull(total);
    }

    public List<ProductoId> productos() {
        return productos;
    }

    public Total getTotal() {
        return total;
    }
}
