import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class load {

    //cargar archivos
    String docInFilename = "D:\\Evidencia\\src\\src\\doctores.csv";
    String pacInFilename = "D:\\Evidencia\\src\\src\\pacientes.csv";
    String citasInFilename = "D:\\Evidencia\\src\\src\\citas.csv";

    //constructores con la informacion recibida de los otros metodos
    public static ArrayList<String> arrDoctores = new ArrayList<>();
    public static ArrayList<String> arrPacientes = new ArrayList<>();
    public static ArrayList<Object> arrCitas = new ArrayList<>();

    public ArrayList<String> loadDoctores() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(docInFilename));

        // line leerá el contenigo del archivo, linea por linea
        String line;

        while((line = in.readLine()) !=null) {

            String str[] = line.split(", "); // para encontrar los pedazos de texto que estan separados por una coma
            for(int i=0;i< str.length;i++){

                arrDoctores.add(str[i]); // y agregarlos al array para manipularlos
            }

        }

        return arrDoctores;

    }

    public ArrayList<String> loadPacientes() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(pacInFilename));

        String line;

        while((line = in.readLine()) !=null) {

            String str[] = line.split(", ");
            for(int i=0;i< str.length;i++){

                arrPacientes.add(str[i]);
            }

        }

        return arrPacientes;

    }

    public ArrayList<Object> loadCitas() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(citasInFilename));

        String line;

        while((line = in.readLine()) !=null) {

            String str[] = line.split(", ");
            for(int i=0;i< str.length;i++){

                arrCitas.add(str[i]);
            }

        }

        return arrCitas;

    }

}
