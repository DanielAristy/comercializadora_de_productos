package Caja.entity;

import Caja.values.CajaId;
import Caja.values.ClienteId;
import Caja.values.FacturaId;
import Caja.values.TotalFactura;
import Inventario.values.ProductoId;
import co.com.sofka.domain.generic.Entity;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Factura extends Entity<FacturaId> {
    private ClienteId clienteId;
    private CajaId cajaId;
    private List<ProductoId> productos;
    private TotalFactura totalFactura;
    public Factura(FacturaId entityId) {
        super(entityId);
    }

    //Comportamientos
    public void actualizarTotalFactura(TotalFactura totalFactura){
        this.totalFactura = Objects.requireNonNull(totalFactura);
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public CajaId cajaId() {
        return cajaId;
    }

    public List<ProductoId> productos() {
        return productos;
    }

    public TotalFactura totalFactura() {
        return totalFactura;
    }
}
