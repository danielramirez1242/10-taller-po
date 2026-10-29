public class ReciboNomina {
    private final Empleado empleado;
    private final double horasExtra;
    private final double bonificacion;
    private final double auxilioTransporte;
    private final double descuentoLibranza;

    public ReciboNomina(Empleado empleado, double horasExtra, double bonificacion,
                        double auxilioTransporte, double descuentoLibranza) {
        this.empleado = empleado;
        this.horasExtra = horasExtra;
        this.bonificacion = bonificacion;
        this.auxilioTransporte = auxilioTransporte;
        this.descuentoLibranza = descuentoLibranza;
    }

    public double pagarTotal() {
        return empleado.calcularSalario() + horasExtra + bonificacion + auxilioTransporte - descuentoLibranza;
    }

    public String obtenerNombreEmpleado() {
        return empleado.obtenerNombre();
    }
}
