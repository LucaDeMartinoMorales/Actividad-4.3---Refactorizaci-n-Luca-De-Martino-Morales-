package pago;

public class PagoPaypal implements EstrategiaPago{

    @Override
    public void pagar(double importe) {
        System.out.printf("Pago con PayPal procesado: %.2f €%n", importe);
    }
}
