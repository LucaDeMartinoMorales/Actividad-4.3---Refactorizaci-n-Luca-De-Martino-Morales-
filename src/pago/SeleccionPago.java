package pago;

public class SeleccionPago {
    public static EstrategiaPago obtener(String tipoPago){
        return switch (tipoPago.toLowerCase()) {
            case "tarjeta"  -> new PagoTarjeta();
            case "paypal"   -> new PagoPaypal();
            default -> throw new IllegalArgumentException("Tipo de pago no soportado: " + tipoPago);
        };
    }
}
