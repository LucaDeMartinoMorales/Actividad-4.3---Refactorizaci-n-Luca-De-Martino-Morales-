package descuento;

public class DescuentoVip implements EstrategiaDescuento{
    private static final double DESCUENTO_VIP = 0.30;

    @Override
    public double aplicar(double totalBruto) {
        return totalBruto * (1 - DESCUENTO_VIP);
    }
}
