package Inventario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoInventario implements ValueObject<String> {
    private final String value;

    public TipoInventario(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El tipo de inventario no puede ser vacia");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TipoInventario that = (TipoInventario) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
