import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {
    // Metodo para leer los archivos
    public static void leerArchivos(String fileName) {
        File file; // Apunta a un archivo fisico en el disco duro
        FileReader reader; // Llave con permisos de solo lectura del archivo
        BufferedReader bufer; // Recuperar info del archivo
        String line; // Solo lee archivos txt

        try {
            // crear un apuntador al archivo fisico
            file = new File("C:\\archivos\\" + fileName + ".txt");
            // Abrir el archivo para lectura
            reader = new FileReader(file);
            // Configurar el buder para leer los datos del archivo
            bufer = new BufferedReader(reader);
            while ((line = bufer.readLine()) != null) {
                System.out.println("Linea leida: " + line);
            }
            // Sis e abre un archivo se tiene que cerrar despues si no se corrompe
            reader.close();
        } catch (Exception e) {
            // Recibe el error del try, si sufre un error en cualquier parte del try
            System.out.println("Error al leer el archivo: " + e.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        System.out.println("Lectura de archivos de texto");
        System.out.println("Escribe el nombre del archivo: ");
        fileName = bufer.readLine();
        leerArchivos(fileName);
    }
}