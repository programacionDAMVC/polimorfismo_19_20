package ejercicios.ejercio3;

public class Directivo extends Trabajador {
    private double complementoDirectivo;

    public Directivo(String nombreTrabajador, String dni, double complementoDirectivo) {
        super(nombreTrabajador, dni);
        this.complementoDirectivo = complementoDirectivo;
    }



    @Override
    public double obtenerSueldoCompleto() {
        return DatosDeTrabajador.obtenerSueldoTrabajador(TipoTrabajador.DIRECTIVO);
    }

    @Override
    public String obtenerDatosTrabajador() {
        return String.format("TRABAJADOR: %s, DNI: %s, SUELDO: %.2f%n", nombreTrabajador, dni, obtenerSueldoConComplementos());
    }
    @Override
    public double obtenerSueldoConComplementos() {
        return obtenerSueldoCompleto() + complementoDirectivo;
    }
}
