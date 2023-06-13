package actividades.cuatro;

import java.io.*;
import java.util.ArrayList;

public class OtraClase  implements Serializable {
    public static void guardarMesa(ArrayList<Mesa> mesas) throws IOException {
        FileOutputStream fileOutput = new FileOutputStream("src/ficheros/actividadcuatro.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
        ObjectOutputStream actividadCuatro = new ObjectOutputStream(bufferedOutput);
        for (int i = 0; i < mesas.size(); i++) {
            actividadCuatro.writeObject(mesas.get(i).toString());
        }
        actividadCuatro.close();
    }
    public static void obtenerMesa() throws IOException, ClassNotFoundException {
        FileInputStream fileInput = new FileInputStream("src/ficheros/actividadcuatro.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
        ObjectInputStream actividadCuatro = new ObjectInputStream(bufferedInput);

        try {
            String mesaInfo = (String) actividadCuatro.readObject();
            while (true) {
                System.out.println(mesaInfo);
                mesaInfo = (String) actividadCuatro.readObject();

            }
        } catch (EOFException ex){
            System.out.println("No hay más mesas");

        }
        actividadCuatro.close();


    }
}
