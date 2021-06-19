package Caja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Date value() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fecha that = (Fecha) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
