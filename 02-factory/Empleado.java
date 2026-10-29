public abstract class Empleado {
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public abstract double calcularSalario();
}
