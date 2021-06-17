package Caja.entity;

import Caja.values.ClienteId;
import co.com.sofka.domain.generic.Entity;

public class Cliente extends Entity<ClienteId> {
    public Cliente(ClienteId entityId) {
        super(entityId);
    }
}
