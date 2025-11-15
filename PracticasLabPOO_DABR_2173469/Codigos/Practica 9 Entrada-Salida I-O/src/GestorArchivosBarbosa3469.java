import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorArchivosBarbosa3469 {

    private static final String DIR = "archivos/";

    public GestorArchivosBarbosa3469() {
        //crear directorio si no existe
        File dir = new File(DIR);
        if (!dir.exists()) dir.mkdirs();
    }

    //archivos de texto
    public void guardarTexto(String nombreArchivo, String contenido) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIR + nombreArchivo))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerTexto(String nombreArchivo) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(DIR + nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    // serializacion
    public void guardarObjeto(PersonaDSerializable persona, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DIR + nombreArchivo))) {
            oos.writeObject(persona);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PersonaDSerializable cargarObjeto(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DIR + nombreArchivo))) {
            return (PersonaDSerializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    // CSV
    public void guardarCSV(List<PersonaDSerializable> personas, String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(DIR + nombreArchivo))) {
            bw.write("Nombre,Matricula,Edad\n");
            for (PersonaDSerializable p : personas) {
                bw.write(p.getNombre() + "," + p.getMatricula() + "," + p.getEdad() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // backup automatico
    public void backup(String nombreArchivoOriginal) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String backupName = "backup_" + timestamp + ".dat";
        try {
            Files.copy(Paths.get(DIR + nombreArchivoOriginal), Paths.get(DIR + backupName),
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}