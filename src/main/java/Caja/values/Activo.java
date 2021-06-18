package Caja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Activo implements ValueObject<Boolean> {
    private final Boolean value;

    public Activo(Boolean value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.equals(false)){
            throw new IllegalArgumentException("No se puede generar inventario.");
        }
    }

    @Override
    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Activo that = (Activo) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
