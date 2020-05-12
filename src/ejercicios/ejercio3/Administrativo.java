package ejercicios.ejercio3;

public class Administrativo  extends Trabajador {
    private Departamento departamento;
    private double complementoAdministrativo;

    public Administrativo(String nombreTrabajador, String dni, Departamento departamento, double complementoAdministrativo) {
        super(nombreTrabajador, dni);
        this.departamento = departamento;
        this.complementoAdministrativo = complementoAdministrativo;
    }

    @Override
    public double obtenerSueldoCompleto() {
        return DatosDeTrabajador.obtenerSueldoTrabajador(TipoTrabajador.ADMINISTRATIVO);
    }

    @Override
    public String obtenerDatosTrabajador() {
        return String.format("TRABAJADOR: %s, DNI: %s, SUELDO: %.2f, DEPARTAMENTO: %s%n",
                nombreTrabajador, dni, obtenerSueldoConComplementos(), departamento);
    }

    @Override
    public double obtenerSueldoConComplementos() {
        return obtenerSueldoCompleto() + complementoAdministrativo;
    }
}
