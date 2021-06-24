import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Menu {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    //constructores
    Doctores doctores = new Doctores();
    Pacientes pacientes = new Pacientes();
    Citas citas = new Citas();
    Save save = new Save();

    ArrayList<String> arrDoctores = load.arrDoctores;
    ArrayList<String> arrPacientes = load.arrPacientes;
    ArrayList<Object> arrCitas = load.arrCitas;

    public void desplegar() throws IOException {

        //*****headers*****
        ArrayList<String> headDoctores = new ArrayList<>();
        headDoctores.add("ID");
        headDoctores.add("Nombre");
        headDoctores.add("Especialidad");

        String temp = headDoctores.toString();

        String[] tokens = temp.split(", ");
        String header = (tokens[0] + " | " + tokens[1] + " | " + tokens[2]);

        ArrayList<String> headPacientes = new ArrayList<>();
        headPacientes.add("ID");
        headPacientes.add("Nombre");

        String tempP = headPacientes.toString();

        String[] tokensP = tempP.split(", ");
        String headerP = (tokensP[0] + " | " + tokensP[1]);

        ArrayList<String> headCitas = new ArrayList<>();
        headCitas.add("ID");
        headCitas.add("Fecha");
        headCitas.add("Hora");
        headCitas.add("Motivo");

        String tempC = headCitas.toString();

        String[] tokensC = tempC.split(", ");
        String headerC = (tokensC[0] + " | " + tokensC[1] + " | " + tokensC[2] + " | " + tokensC[3]);


        // menu principal
        while (true) {

            // menu
            System.out.println("********************\nBienvenido al sistema\n********************");
            System.out.println("1. Registrar doctor");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Registrar cita");
            System.out.println("4. Ver lista de doctores");
            System.out.println("5. Ver lista de pacientes");
            System.out.println("6. Ver citas");
            System.out.println("7. Salir");

            //input
            System.out.print("\n\n");
            System.out.print("Seleccione una opción: ");


                int comando = Integer.parseInt(entrada.readLine());

                System.out.print("\n\n");

                switch (comando) {

                    case 1:

                        registrarDoctor();
                        continue;

                    case 2:

                        registrarPaciente();
                        continue;

                    case 3:
                        registrarCita();
                        continue;

                    case 4:
                        System.out.println(header);
                        listaDoctores();
                        continue;

                    case 5:
                        System.out.println(headerP);
                        listaPacientes();
                        continue;

                    case 6:
                        System.out.println(headerC);
                        listaCitas();
                        continue;

                    case 7:
                        save.saveDoctores();
                        save.savePacientes();
                        save.saveCitas();
                        break;


                }



            break;

        }

    }

    private ArrayList<String> registrarDoctor() throws IOException {

        ArrayList<String> arrDoctor = new ArrayList<>();

        int id = arrDoctores.size();

        String idStr = String.valueOf(id);

        doctores.setDocID(idStr);

        System.out.print("Introduzca nombre del doctor: ");
        doctores.setDocName(entrada.readLine());

        System.out.print("Introduzca especialidad del doctor: ");
        doctores.setDocSpec(entrada.readLine());

        arrDoctor.add(doctores.getDocID());
        arrDoctor.add(doctores.getDocName());
        arrDoctor.add(doctores.getDocSpec());

        String temp = arrDoctor.toString();

        String[] tokens = temp.split(", ");
        String registro = (tokens[0] + " | " + tokens[1] + " | " + tokens[2]);

        arrDoctores.add(registro);

        arrDoctores.forEach(System.out::println);

        return arrDoctores;

    }

    private ArrayList<String> registrarPaciente() throws IOException {

        ArrayList<String> arrPaciente = new ArrayList<>();

        int id = arrPacientes.size();

        String idStr = String.valueOf(id);

        pacientes.setPacienteID(idStr);

        System.out.print("Introduzca nombre del paciente: ");
        pacientes.setPacienteName(entrada.readLine());

        arrPaciente.add(pacientes.getPacienteID());
        arrPaciente.add(pacientes.getPacienteName());

        String temp = arrPaciente.toString();

        String[] tokens = temp.split(", ");
        String registro = (tokens[0] + " | " + tokens[1]);

        arrPacientes.add(registro);

        arrPacientes.forEach(System.out::println);

        return arrPacientes;

    }

    private ArrayList<Object> registrarCita() throws IOException{

        ArrayList<Object> arrCita = new ArrayList<>();

        int id = arrCitas.size();

        String idStr = String.valueOf(id);

        citas.setApptID(idStr);

        System.out.print("Introduzca la fecha (dd/mm/aaaa): ");
        citas.setApptDate(entrada.readLine());

        System.out.print("Introduzca la hora de la cita: ");
        citas.setApptTime(entrada.readLine());

        System.out.print("Cual es la razón de su cita?");
        citas.setApptRsn(entrada.readLine());

        arrCita.add(citas.getApptID());
        arrCita.add(citas.getApptDate());
        arrCita.add(citas.getApptTime());
        arrCita.add(citas.getApptRsn());

        String temp = arrCita.toString();

        String[] tokens = temp.split(", ");
        String registro = (tokens[0] + " | " + tokens[1] + " | " + tokens[2] + " | " + tokens[3]);

        arrCitas.add(registro);

        arrCitas.forEach(System.out::println);

        return arrCitas;

    }

    private void listaDoctores() {

        arrDoctores.forEach(System.out::println);

    }

    private void listaPacientes() {

        arrPacientes.forEach(System.out::println);

    }

    private void listaCitas() {

        arrCitas.forEach(System.out::println);

    }
}
