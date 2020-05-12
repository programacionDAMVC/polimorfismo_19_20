package ejercicios.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Trabajador> listaTrabajadores = new ArrayList<>();
        Trabajador directivo1 = new Directivo("Ángel Ganivet", "1", 1_000);
        Trabajador directivo2 = new Directivo("Luisa Ganivet", "2", 2_000);
        Trabajador obrero1 = new Obrero("Felipe Hermoso", "3", LugarTrabajo.ALMACEN, 100);
        Trabajador obrero2 = new Obrero("Carmen Hermoso", "4", LugarTrabajo.FABRICA, 200);
        Trabajador obrero3 = new Obrero("Esperanza García", "5", LugarTrabajo.TRANSPORTE, 250);
        Trabajador administrativo1 = new Administrativo("Mamen García", "6",
                Departamento.COMPRAS, 256.23);
        Trabajador administrativo2 = new Administrativo("Rosa Zaldúa", "7",
                Departamento.COMPRAS, 256.23);
        Trabajador administrativo3 = new Administrativo("Esther García", "8",
                Departamento.COMPRAS, 256.23);
        Trabajador administrativo4 = new Administrativo( "Salud García", "9",
                Departamento.COMPRAS, 256.23);
        listaTrabajadores.add(directivo1);
        listaTrabajadores.add(directivo2);
        listaTrabajadores.add(obrero1);
        listaTrabajadores.add(obrero2);
        listaTrabajadores.add(obrero3);
        listaTrabajadores.add(administrativo1);
        listaTrabajadores.add(administrativo2);
        listaTrabajadores.add(administrativo3);
        listaTrabajadores.add(administrativo4);
        mostrarDatosEmpresa(listaTrabajadores);

    }

    private static void mostrarDatosEmpresa(List<Trabajador> listaTrabajadores) {
        for (Trabajador trabajador: listaTrabajadores) {
            System.out.println(trabajador.obtenerSueldoCompleto());
            System.out.println(trabajador.obtenerSueldoConComplementos());
            System.out.println(trabajador.obtenerDatosTrabajador());
        }
    }
}
