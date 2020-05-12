package ejercicios.ejercicio1;

public abstract class Trabajador  implements DatosDeTrabajador{
    protected String nombreTrabajador;
    protected String  dni;

    public Trabajador(String nombreTrabajador, String dni) {
        this.nombreTrabajador = nombreTrabajador;
        this.dni = dni;
    }
    public abstract double obtenerSueldoConComplementos();
}
