package ejercicios.ejercio3;

public class Obrero extends Trabajador {
    private LugarTrabajo lugarTrabajo;
    private double complementoObrero;

    public Obrero(String nombreTrabajador, String dni, LugarTrabajo lugarTrabajo, double complementoObrero) {
        super(nombreTrabajador, dni);
        this.lugarTrabajo = lugarTrabajo;
        this.complementoObrero = complementoObrero;
    }

    @Override
    public double obtenerSueldoCompleto() {
        return DatosDeTrabajador.obtenerSueldoTrabajador(TipoTrabajador.OBRERO);
    }

    @Override
    public String obtenerDatosTrabajador() {
        return String.format("TRABAJADOR: %s, DNI: %s, SUELDO: %.2f, LUGAR DE TRABAJO: %s%n",
                nombreTrabajador, dni, obtenerSueldoConComplementos(), lugarTrabajo);
    }

    @Override
    public double obtenerSueldoConComplementos() {
        return complementoObrero + obtenerSueldoCompleto();
    }
}
