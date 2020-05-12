package ejercicios.ejercio3;

public class Auxiliar {
    public static  boolean comprobarDNI(String dni) {
        return dni.toLowerCase().matches("[0-9]{8}[a-z]");
    }
    public static boolean comprobarNombre(String nombre) {
        return nombre.toLowerCase().matches("[a-záéíóúüñ]{2,}[a-záéíóúüñ ]{2,}");
    }
    public static boolean comprobarSueldo(String sueldo) {
        return sueldo.matches("[1-4][0-9]{3}");
    }

    public static void main(String[] args) {
        System.out.println(comprobarNombre("Luis Angel Medina"));
        System.out.println(comprobarSueldo("2000"));
        System.out.println(comprobarDNI("12345678a"));
    }
}
