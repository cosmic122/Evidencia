import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        credenciales cred = new credenciales();
        Menu menu = new Menu();
        load load = new load();

        load.loadDoctores();
        load.loadPacientes();
        load.loadCitas();
        cred.loadCreds();
        cred.validate();
        menu.desplegar();

    }

}
