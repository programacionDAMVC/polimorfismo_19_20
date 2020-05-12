package ejercicios.ejercio3;


public interface DatosDeTrabajador {

  /*  double SUELDO_MENSUAL_DIRECTIVO = 4_000;
    double SUELDO_MENSUAL_ADMINISTRACION = 2_000;
    double SUELDO_MENSUAL_OBRERO =  1_500;*/

    double obtenerSueldoCompleto();
    String obtenerDatosTrabajador();

    default void mostrarDatosTrabajador() {
        System.out.printf("SUELDO BASE: %.2f, OTROS DATOS: %s", obtenerSueldoCompleto(), obtenerDatosTrabajador());
    }

    static double obtenerSueldoTrabajador (TipoTrabajador tipoTrabajador) {
        return tipoTrabajador.getSueldoBase();
    }

}
