package actividades.cuatro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static actividades.cuatro.OtraClase.guardarMesa;
import static actividades.cuatro.OtraClase.obtenerMesa;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        String color;
        int numPatas;
        ArrayList<Mesa> mesas = new ArrayList<>();


        while (opcion != 3) {
            System.out.println("Introduzca la opción que desee \n" +
                    "1. Introducir una mesa \n" +
                    "2. Mostrar las mesas existentes \n" +
                    "3. Salir");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el color de la mesa");
                    color = teclado.nextLine();
                    System.out.println("Introduzca el numero de patas");
                    numPatas = teclado.nextInt();
                    Mesa mesa = new Mesa(color, numPatas);
                    mesas.add(mesa);
                    guardarMesa(mesas);
                    break;
                case 2:
                    obtenerMesa();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        }

    }
}