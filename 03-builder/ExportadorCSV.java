// Paso 03 (SRP/DIP): solo exporta; la configuración llega por constructor.
public class ExportadorCSV implements Exportador {
    private final ConfiguracionSalud configuracion;

    public ExportadorCSV(ConfiguracionSalud configuracion) {
        this.configuracion = configuracion;
    }

    @Override
    public String exportarLinea(Empleado empleado) {
        double sueldo = empleado.calcularSalario();
        double salud = sueldo * configuracion.obtenerPorcentajeSalud();
        return empleado.obtenerNombre() + ";" + String.format("%.0f", sueldo) + ";" + String.format("%.0f", salud);
    }
}
