package Inventario.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Valor implements ValueObject<Double> {
    private final Double value;

    public Valor(Double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0){
            throw new IllegalArgumentException("La valor no puede menor que 0");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Valor that = (Valor) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
