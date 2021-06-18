package Inventario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cantidad implements ValueObject<Integer> {
    private final Integer value;

    public Cantidad(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0){
            throw new IllegalArgumentException("La valor no puede menor que 0");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cantidad that = (Cantidad) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
