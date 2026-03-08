package pago;

public class PagoTarjeta implements EstrategiaPago {

    @Override
    public void pagar(double importe) {
        System.out.printf("Pago con tarjeta procesado: %.2f €%n", importe);
    }
}