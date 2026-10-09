public class Main
{
    public static void main(String[] args)
    {
        CajaFuerte caja = new CajaFuerte("20260001L", "SecureBox A1", 1234, 50000.0);

        // Escenario valido
        caja.abrir(1234);
        caja.cerrar();

        // Escenario con tres claves erróneas
        caja.abrir(0000);
        caja.abrir(1111);
        caja.abrir(2222);
    }
}