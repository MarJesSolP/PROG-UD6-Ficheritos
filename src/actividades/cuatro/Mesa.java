package actividades.cuatro;

import java.io.Serializable;

public class Mesa implements Serializable {
    String color;
    int numeroPatas;

    public Mesa(String color, int numeroPatas) {
        this.color = color;
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Este mesa es de color " +this. color + " y tiene " + this.numeroPatas + " patas. ";
    }
}
