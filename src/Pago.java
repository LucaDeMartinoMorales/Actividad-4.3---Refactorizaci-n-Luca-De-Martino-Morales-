public class Pago {
    public void pagar(double x, String tipo) {
        if (tipo.equals("TARJETA")) {
            System.out.println("Pagando con tarjeta " + x);
        }
        if (tipo.equals("PAYPAL")) {
            System.out.println("Pagando con paypal " + x);
        }
    }
}