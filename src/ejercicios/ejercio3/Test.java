package ejercicios.ejercio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        System.out.println("DIRECTIVOS");
        for (int i = 0; i < 2; i++)
            listaTrabajadores.add(crearDirectivo());
        System.out.println("OBREROS");
        for (int i = 0; i < 3; i++)
            listaTrabajadores.add(crearObrero());
        System.out.println("ADMINISTRATIVOS");
        for (int i = 0; i < 4; i++)
            listaTrabajadores.add(crearAdministrativo());
        mostrarEnConsolaTrabajadores(listaTrabajadores);
        volcarDatosTrabajadoresFichero(listaTrabajadores);
        if (sc != null)
            sc.close();
    }

    private static void volcarDatosTrabajadoresFichero(List<Trabajador> listaTrabajadores) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ficheros/trabajadores.txt")))) {
            for (Trabajador trabajador: listaTrabajadores) {
                out.println(trabajador.obtenerDatosTrabajador());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void mostrarEnConsolaTrabajadores(List<Trabajador> listaTrabajadores) {
        for (Trabajador trabajador: listaTrabajadores) {
            trabajador.mostrarDatosTrabajador();
        }
    }

    private static Directivo crearDirectivo() {
        String[] datosComunesTrabajador = solicitarDatosComunes();
        return new Directivo(datosComunesTrabajador[0], datosComunesTrabajador[1], Double.parseDouble(datosComunesTrabajador[2]));
    }

    private static Obrero crearObrero() {
        String[] datosComunesTrabajador = solicitarDatosComunes();
        LugarTrabajo lugarTrabajo = null;
        while (true) {
            System.out.println("Introduce opción:\n");
            System.out.println("1. Almacen:");
            System.out.println("2. Fábrica");
            System.out.println("3. Transporte\n");
            String sOpcion = sc.nextLine();
            if (!sOpcion.matches("[123]"))
                continue;
            switch (sOpcion) {
                case "1":
                    lugarTrabajo = LugarTrabajo.ALMACEN;
                    break;
                case "2":
                    lugarTrabajo = LugarTrabajo.FABRICA;
                    break;
                case "3":
                    lugarTrabajo = LugarTrabajo.TRANSPORTE;
                    break;
                default:
                    break;
            }
            return new Obrero(datosComunesTrabajador[0], datosComunesTrabajador[1],
                    lugarTrabajo,  Double.parseDouble(datosComunesTrabajador[2]));

        }

    }

    private static Administrativo crearAdministrativo() {
        String[] datosComunesTrabajador = solicitarDatosComunes();
        Departamento departamento = null;
        while (true) {
            System.out.println("Introduce opción:\n");
            System.out.println("1. Nóminas:");
            System.out.println("2. Ventas");
            System.out.println("3. Personal");
            System.out.println("4. Compras\n");
            String sOpcion = sc.nextLine();
            if (!sOpcion.matches("[1234]"))
                continue;
            switch (sOpcion) {
                case "1":
                    departamento = Departamento.NOMINAS;
                    break;
                case "2":
                    departamento = Departamento.VENTAS;
                    break;
                case "3":
                    departamento = Departamento.PERSONAL;
                    break;
                case "4":
                    departamento = Departamento.COMPRAS;
                    break;
                default:
                    break;
            }
            return new Administrativo(datosComunesTrabajador[0], datosComunesTrabajador[1],
                    departamento,  Double.parseDouble(datosComunesTrabajador[2]));

        }

    }

    private static String[] solicitarDatosComunes() {

        String nombre;
        while (true){
            System.out.println("Introduce el nombre del trabajador:");
            nombre = sc.nextLine();
            if (Auxiliar.comprobarNombre(nombre))
                break;
        }
        String dni;
        while (true){
            System.out.println("Introduce el dni del trabajador:");
            dni = sc.nextLine();
            if (Auxiliar.comprobarDNI(dni))
                break;
        }
        String complemento;
        while (true){
            System.out.println("Introduce el complemento del trabajador:");
            complemento = sc.nextLine();
            if (Auxiliar.comprobarSueldo(complemento))
                break;
        }
        return new String[] {nombre, dni, complemento};
    }
}
