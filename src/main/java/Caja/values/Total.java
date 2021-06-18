package Caja.values;

import Inventario.values.Cantidad;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Total implements ValueObject<Double> {
    private final Double value;

    public Total(Double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value < 0){
            throw new IllegalArgumentException("El total no puede menor que 0");
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
        Total that = (Total) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
