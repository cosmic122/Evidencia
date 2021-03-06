import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Save {

    public void saveDoctores() throws IOException {

        // crea instancia del array a guardar
        ArrayList<String> arrDoctores = load.arrDoctores;

        // archivo de salida
        String docOutFilename = "D:\\Evidencia\\src\\src\\doctores.csv";

        BufferedWriter bf = new BufferedWriter(new FileWriter(docOutFilename));

        // for loop se repite la misma cantidad de veces que el valor del tamaño del array, osea, all arrays
        for (int i = 0; i < arrDoctores.size(); i++) {

            bf.write(arrDoctores.get(i) + ", "); // lectura

        }

        bf.flush(); // drenar la información al archivo

        System.out.println("Sus datos han sido guardados!");

    }

    public void savePacientes() throws IOException {

        ArrayList<String> arrPacientes = load.arrPacientes;

        String pacOutFilename = "D:\\Evidencia\\src\\src\\pacientes.csv";

        BufferedWriter bf = new BufferedWriter(new FileWriter(pacOutFilename));

        for (int i = 0; i < arrPacientes.size(); i++) {

            bf.write(arrPacientes.get(i) + ", ");

        }

        bf.flush();

        System.out.println("Sus datos han sido guardados!");

    }

    public void saveCitas() throws IOException {

        ArrayList<Object> arrCitas = load.arrCitas;

        String citasOutFilename = "D:\\Evidencia\\src\\src\\citas.csv";

        BufferedWriter bf = new BufferedWriter(new FileWriter(citasOutFilename));

        for (int i = 0; i < arrCitas.size(); i++) {

            bf.write(arrCitas.get(i) + ", ");

        }

        bf.flush();

        System.out.println("Sus datos han sido guardados!");

    }

}
