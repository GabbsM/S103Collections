package NivelTres;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CSV {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void escrituraUsuarios() throws IOException {

        usuarios.add(new Usuario("Jonh", "Doe", "bar1"));
        usuarios.add(new Usuario("Vito", "Corleone", "bar2"));
        usuarios.add(new Usuario("Tyler", "Durden", "bar3"));

        CSVWriter csvWriter = new CSVWriter(new FileWriter("C:\\Users\\Foo\\developer\\nombres.csv"));

        for (Usuario usuario : usuarios) {
            String[] datos = usuario.toCSV();
            csvWriter.writeNext(datos);
        }

        csvWriter.close();
        System.out.println("usuarios agregados con exito");
    }

    public void leerUsuario() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getNombre))
                .map(Usuario::toCSV)
                .toList();

            csvReader.close();
        }

    public void leerUsuarioreves() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getNombre).reversed())
                .map(Usuario::toCSV)
                .toList();

        csvReader.close();
    }

    public void leerApellido() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getApellido))
                .map(Usuario::toCSV)
                .toList();

        csvReader.close();
    }

    public void leerApellidoReves() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getApellido).reversed())
                .map(Usuario::toCSV)
                .toList();

        csvReader.close();
    }

    public void leerUsuarioDni() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getDni))
                .map(Usuario::toCSV)
                .toList();

        csvReader.close();
    }

    public void leerUsuarioDniReves() throws IOException {
        CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\Foo\\developer\\nombres.csv"));

        List<String[]> listanombre = usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getDni).reversed())
                .map(Usuario::toCSV)
                .toList();

        csvReader.close();
    }

    public void Menu() throws IOException {
         int opcion;
         boolean salir = false;

        Scanner sc = new Scanner(System.in);
        System.out.println();


        while (!salir){
            System.out.println("Introduzca una opcion: ");
            System.out.println();
            System.out.println("1. Agregar usuarios");
            System.out.println("2. Leer por orden de nombre");
            System.out.println("3. Leer por orden de nombre inverso");
            System.out.println("4. Leer por apellido");
            System.out.println("5. Leer por apellido inverso");
            System.out.println("6. Leer por DNI");
            System.out.println("7. Leer por DNI inverso");
            System.out.println("0. Salir");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    escrituraUsuarios();
                    break;
                case 2:
                    System.out.println("Opcion 2:");
                    leerUsuario();
                case 3:
                    leerUsuarioreves();
                case 4:
                    leerApellido();
                case 5:
                    leerApellidoReves();
                case 6:
                    leerUsuarioDni();
                case 7:
                    leerUsuarioDniReves();
                case 0:
                    System.out.println("Hasta pronto");
                    System.exit(0);
            }
        }



    }

}