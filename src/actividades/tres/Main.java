package actividades.tres;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("src/ficheros/actividadTres.txt");
        file.createNewFile();
        FileWriter textoTres = new FileWriter("src/ficheros/actividadTres.txt");
        FileReader textoUno = new FileReader("src/ficheros/actividadUno.txt");
        FileReader textoDos = new FileReader("src/ficheros/actividadDos.txt");
        int caracter;

        textoTres.write("Contenido del fichero uno:  ");
        while((caracter = textoUno.read())!= -1){
            textoTres.write((char)caracter);
        }
        textoTres.write("\n");
        textoTres.write("Contenido  del fichero dos:");
        while((caracter = textoDos.read())!= -1){
            textoTres.write((char)caracter);
        }
        textoTres.close();







    }
}