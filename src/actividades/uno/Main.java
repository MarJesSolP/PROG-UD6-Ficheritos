package actividades.uno;

import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String text = "";

        while (text.length() < 30){
            System.out.println("Introduzca un texto con AL MENOS treinta caracteres");
            text = console.nextLine();
            if(text.length()<30){
                System.out.println("Te faltan: " + (30 - text.length()) + " para completar el minimo." );
            }
        }

        text = text.toLowerCase(). replace(" ", "_");

        try {
            FileWriter textoUno = new FileWriter("src/ficheros/actividaduno.text");
            for (int i = 0; i < text.length(); i++) {
                textoUno.write(text.charAt(i));
            }
            textoUno.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}