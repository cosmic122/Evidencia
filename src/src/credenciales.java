import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class credenciales {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    String inputFilename = "D:\\Evidencia\\src\\src\\credenciales.txt";

    public static HashMap<String, String> credMap = new HashMap<>();

    public HashMap<String, String> loadCreds() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(inputFilename));

        String line;

        while((line = in.readLine()) !=null) {

            String str[] = line.split(", ");
            for(int i=0;i< str.length;i++){
                String arr[] = str[i].split(" : ");
                credMap.put(arr[0], arr[1]);
            }

        }

        return credMap;

    }

    public void validate() throws IOException{

        System.out.println("Introduzca su ID de usuario: ");
        String idInput;

        while (true) {

        idInput = entrada.readLine();

            if(credMap.containsKey(idInput)) {
                break;
                }
                else {
                    System.out.println("ID Inválido, intente de nuevo.");
                    validate();
                }

            }



        while(true)
        {
            System.out.println("Introduzca su contrasena: ");
        String pwInput = entrada.readLine();

            String pass = credMap.get(idInput);

                if (pwInput.equals(pass)) {
                    System.out.println("Validación exitosa.");
                    break;
                }
                else {
                    System.out.println("ID Inválido, intente de nuevo.");
                }

            }

        }

    }


