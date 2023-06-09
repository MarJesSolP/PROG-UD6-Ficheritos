package actividades.dos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

            FileReader lector = new FileReader("src/ficheros/actividaddos.text");
            int caracter;
            while((caracter = lector.read())!= -1){
                System.out.print((char)caracter + "_" + caracter + ", ");
            }




    }
}