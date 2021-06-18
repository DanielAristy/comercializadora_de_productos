package Caja.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La direccion no puede ser vacia");
        }

        if (this.value.length() <= 5){
            throw new IllegalArgumentException("la direccion debe ser mas específica");
        }

        if (this.value.length() >= 100){
            throw new IllegalArgumentException("la direccion no debe ser muy larga");
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
        Direccion that = (Direccion) obj;
        return Objects.equals(value,that);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
