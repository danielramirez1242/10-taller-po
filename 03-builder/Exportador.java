// Paso 03 (ISP/DIP): contrato de exportación. Hoy CSV; mañana otro formato sin tocar a los clientes.
public interface Exportador {
    String exportarLinea(Empleado empleado);
}
