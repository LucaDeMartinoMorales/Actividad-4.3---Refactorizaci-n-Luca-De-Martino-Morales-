package descuento;

public class DescuentoEstandar implements EstrategiaDescuento{
    private static final double umbralAlto = 500.0;
    private static final double umbralMedio = 200.0;
    private static final double descuentoAlto = 0.20;
    private static final double descuentoMedio = 0.10;

    @Override
    public double aplicar(double totalBruto) {
        if (totalBruto > umbralAlto)  return totalBruto * (1 - descuentoAlto);
        if (totalBruto > umbralMedio) return totalBruto * (1 - descuentoMedio);
        return totalBruto;
    }
}
