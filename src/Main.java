public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Iniciando simulador de caja fuerte");
        CajaFuerte caja = new CajaFuerte("000202601", "SecureBox A1", 1234, 50000.0);

        caja.abrir(1234);
        caja.depositar(1500);
        caja.retirar(500);
        caja.mostrarEstado();
        caja.cerrar();

        // Intento de depósito con la caja cerrada
        caja.depositar(100);
    }
}