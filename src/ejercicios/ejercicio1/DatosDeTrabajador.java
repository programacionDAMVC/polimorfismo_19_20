package ejercicios.ejercicio1;

public interface DatosDeTrabajador {

    double SUELDO_MENSUAL_DIRECTIVO = 4_000;
    double SUELDO_MENSUAL_ADMINISTRACION = 2_000;
    double SUELDO_MENSUAL_OBRERO =  1_500;

    double obtenerSueldoCompleto();
    String obtenerDatosTrabajador();

}
