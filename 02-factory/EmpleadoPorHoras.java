public class EmpleadoPorHoras extends Empleado {
    private final double horas;
    private final double valorHora;

    public EmpleadoPorHoras(String nombre, double horas, double valorHora) {
        super(nombre);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horas * valorHora;
    }
}
