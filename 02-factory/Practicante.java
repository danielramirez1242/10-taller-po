public class Practicante extends Empleado {
    private final double apoyoSostenimiento;

    public Practicante(String nombre, double apoyoSostenimiento) {
        super(nombre);
        this.apoyoSostenimiento = apoyoSostenimiento;
    }

    @Override
    public double calcularSalario() {
        return apoyoSostenimiento;
    }
}
