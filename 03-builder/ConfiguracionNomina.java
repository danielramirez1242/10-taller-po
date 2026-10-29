// Paso 03: Singleton que implementa la abstracción ConfiguracionSalud.
public class ConfiguracionNomina implements ConfiguracionSalud {
    private static final ConfiguracionNomina INSTANCIA = new ConfiguracionNomina();
    private double porcentajeSalud = 0.04;

    private ConfiguracionNomina() {
    }

    public static ConfiguracionNomina getInstancia() {
        return INSTANCIA;
    }

    @Override
    public double obtenerPorcentajeSalud() {
        return porcentajeSalud;
    }

    public void setPorcentajeSalud(double porcentajeSalud) {
        this.porcentajeSalud = porcentajeSalud;
    }
}
