package Caja.entity;

import Caja.values.CajaId;
import Caja.values.ClienteId;
import Caja.values.FacturaId;
import Caja.values.TotalFactura;
import Inventario.entity.Producto;
import co.com.sofka.domain.generic.Entity;

import java.util.Set;

public class Factura extends Entity<FacturaId> {
    private ClienteId clienteId;
    private CajaId cajaId;
    private Set<Producto> productos;
    private TotalFactura totalFactura;
    public Factura(FacturaId entityId) {
        super(entityId);
    }
}
