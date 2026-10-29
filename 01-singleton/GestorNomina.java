import java.util.ArrayList;
import java.util.List;

public class GestorNomina {
    private final List<Empleado> empleados = new ArrayList<>();

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            String[] d = linea.split(";");
            if (d[0].equals("FIJO")) {
                empleados.add(new EmpleadoFijo(d[1], Double.parseDouble(d[2])));
            } else if (d[0].equals("HORAS")) {
                empleados.add(new EmpleadoPorHoras(d[1], Double.parseDouble(d[2]), Double.parseDouble(d[3])));
            } else if (d[0].equals("COMISIÓN")) {
                empleados.add(new EmpleadoPorComision(d[1], Double.parseDouble(d[2]), Double.parseDouble(d[3])));
            }
        }
    }
}
