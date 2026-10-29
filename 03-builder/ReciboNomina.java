// Paso 03: Builder. Adiós al constructor de seis parámetros posicionales.
public class ReciboNomina {
    private final Empleado empleado;
    private final double horasExtra;
    private final double bonificacion;
    private final double auxilioTransporte;
    private final double descuentoLibranza;

    private ReciboNomina(Builder b) {
        this.empleado = b.empleado;
        this.horasExtra = b.horasExtra;
        this.bonificacion = b.bonificacion;
        this.auxilioTransporte = b.auxilioTransporte;
        this.descuentoLibranza = b.descuentoLibranza;
    }

    public double pagarTotal() {
        return empleado.calcularSalario() + horasExtra + bonificacion + auxilioTransporte - descuentoLibranza;
    }

    public String obtenerNombreEmpleado() {
        return empleado.obtenerNombre();
    }

    public static class Builder {
        private final Empleado empleado;
        private double horasExtra;
        private double bonificacion;
        private double auxilioTransporte;
        private double descuentoLibranza;

        public Builder(Empleado empleado) {
            this.empleado = empleado;
        }

        public Builder horasExtra(double valor) {
            this.horasExtra = valor;
            return this;
        }

        public Builder bonificacion(double valor) {
            this.bonificacion = valor;
            return this;
        }

        public Builder auxilioTransporte(double valor) {
            this.auxilioTransporte = valor;
            return this;
        }

        public Builder descuentoLibranza(double valor) {
            this.descuentoLibranza = valor;
            return this;
        }

        public ReciboNomina build() {
            return new ReciboNomina(this);
        }
    }
}
