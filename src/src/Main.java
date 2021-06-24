import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // *****constructores*****
        credenciales cred = new credenciales();
        Menu menu = new Menu();
        load load = new load();

        // *****cargar informacion en archivos*****
        load.loadDoctores();
        load.loadPacientes();
        load.loadCitas();
        cred.loadCreds();
        // *****confirmar credenciales*****
        cred.validate();
        // *****mostrar menu*****
        menu.desplegar();

    }

}
