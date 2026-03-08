package servicio;

import descuento.EstrategiaDescuento;
import modelo.Pedido;
import pago.EstrategiaPago;

public class PedidoServicio {

    private final EstrategiaDescuento estrategiaDescuento;
    private final EstrategiaPago estrategiaPago;

    public PedidoServicio(EstrategiaDescuento estrategiaDescuento,
                          EstrategiaPago estrategiaPago) {
        this.estrategiaDescuento = estrategiaDescuento;
        this.estrategiaPago      = estrategiaPago;
    }

    public void procesar(Pedido pedido) {
        double totalBruto        = pedido.calcularTotalBruto();
        double totalConDescuento = estrategiaDescuento.aplicar(totalBruto);

        mostrarResumen(pedido, totalBruto, totalConDescuento);
        estrategiaPago.pagar(totalConDescuento);
    }

    private void mostrarResumen(Pedido pedido, double totalBruto, double totalFinal) {
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Total bruto: " + totalBruto);
        System.out.println("Total con descuento: " + totalFinal);
    }
}