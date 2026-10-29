public class Main {
    public static void main(String[] args) {
        ConfiguracionNomina.getInstancia().setPorcentajeSalud(0.05);
        System.out.println("Salud: " + ConfiguracionNomina.getInstancia().obtenerPorcentajeSalud());

        GestorNomina gestor = new GestorNomina();
        Exportador exportador = new ExportadorCSV(ConfiguracionNomina.getInstancia());

        String[] lineas = {
            "FIJO;Ana Ruiz;3500000",
            "HORAS;Luis Gómez;120;18000",
            "CONTRATISTA;Marta Díaz;4200000"
        };
        gestor.cargar(lineas);
        for (Empleado e : gestor.obtenerEmpleados()) {
            System.out.println(exportador.exportarLinea(e));
        }

        Empleado ana = new EmpleadoFijo("Ana Ruiz", 3500000);
        Empleado luis = new EmpleadoPorHoras("Luis Gómez", 120, 18000);
        ReciboNomina r1 = new ReciboNomina.Builder(ana).bonificacion(250000).build();
        ReciboNomina r2 = new ReciboNomina.Builder(luis).horasExtra(180000).descuentoLibranza(120000).build();
        System.out.println("Recibo " + r1.obtenerNombreEmpleado() + ": " + r1.pagarTotal());
        System.out.println("Recibo " + r2.obtenerNombreEmpleado() + ": " + r2.pagarTotal());
    }
}
