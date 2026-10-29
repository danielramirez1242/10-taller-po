// Paso 01: usa el Singleton directamente.
public class ExportadorCSV {
    private final ConfiguracionNomina configuracion = ConfiguracionNomina.getInstancia();

    public String exportarLinea(Empleado empleado) {
        double sueldo = empleado.calcularSalario();
        double salud = sueldo * configuracion.obtenerPorcentajeSalud();
        return empleado.obtenerNombre() + ";" + String.format("%.0f", sueldo) + ";" + String.format("%.0f", salud);
    }
}
