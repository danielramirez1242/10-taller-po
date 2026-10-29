import java.util.ArrayList;
import java.util.List;

// Paso 02: el gestor ya no sabe cómo crear empleados; delega en la fábrica.
public class GestorNomina {
    private final List<Empleado> empleados = new ArrayList<>();
    private final FabricaEmpleados fabrica = new FabricaEmpleados();

    public List<Empleado> obtenerEmpleados() {
        return empleados;
    }

    public void cargar(String[] lineas) {
        for (String linea : lineas) {
            empleados.add(fabrica.crear(linea));
        }
    }
}
