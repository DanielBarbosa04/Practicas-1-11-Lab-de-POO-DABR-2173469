import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GestorArchivosBarbosa3469 gestor = new GestorArchivosBarbosa3469();
        Scanner sc = new Scanner(System.in);

        List<PersonaDSerializable> personas = new ArrayList<>();
        personas.add(new PersonaDSerializable("Daniel Barbosa", "9643712", 21));
        personas.add(new PersonaDSerializable("Alejandro Ramirez", "1234567", 19));

        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- Gestor de Archivos Barbosa3469 ---");
            System.out.println("1. Guardar texto");
            System.out.println("2. Leer texto");
            System.out.println("3. Guardar objeto serializado");
            System.out.println("4. Cargar objeto serializado");
            System.out.println("5. Guardar CSV");
            System.out.println("6. Hacer backup");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> gestor.guardarTexto("datos_3469.txt", "Informacion de prueba para practica");
                case 2 -> System.out.println(gestor.leerTexto("datos_3469.txt"));
                case 3 -> gestor.guardarObjeto(personas.get(0), "personaD.ser");
                case 4 -> {
                    PersonaDSerializable p = gestor.cargarObjeto("personaD.ser");
                    System.out.println("Objeto cargado: " + p);
                }
                case 5 -> gestor.guardarCSV(personas, "log_Barbosa.csv");
                case 6 -> gestor.backup("datos_3469.txt");
                case 0 -> salir = true;
                default -> System.out.println("Opción invalida");
            }
        }
        sc.close();
    }
}