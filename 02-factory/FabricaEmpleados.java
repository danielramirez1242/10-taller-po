// Paso 02: Factory. Decide qué clase crear a partir de la línea de texto.
public class FabricaEmpleados {
    public Empleado crear(String linea) {
        String[] d = linea.split(";");
        String tipo = d[0];
        String nombre = d[1];
        switch (tipo) {
            case "FIJO":
                return new EmpleadoFijo(nombre, Double.parseDouble(d[2]));
            case "HORAS":
                return new EmpleadoPorHoras(nombre, Double.parseDouble(d[2]), Double.parseDouble(d[3]));
            case "COMISIÓN":
                return new EmpleadoPorComision(nombre, Double.parseDouble(d[2]), Double.parseDouble(d[3]));
            case "CONTRATISTA":
                return new Contratista(nombre, Double.parseDouble(d[2]));
            case "PRACTICANTE":
                return new Practicante(nombre, Double.parseDouble(d[2]));
            default:
                throw new IllegalArgumentException("Tipo de empleado desconocido: " + tipo);
        }
    }
}
