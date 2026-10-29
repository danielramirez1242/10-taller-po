// Paso 01: Singleton. Una sola instancia para todo el sistema.
public class ConfiguracionNomina {
    private static final ConfiguracionNomina INSTANCIA = new ConfiguracionNomina();
    private double porcentajeSalud = 0.04;

    private ConfiguracionNomina() {
    }

    public static ConfiguracionNomina getInstancia() {
        return INSTANCIA;
    }

    public double obtenerPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
