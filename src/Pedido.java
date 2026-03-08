import java.util.ArrayList;

public class Pedido {
    public Cliente cliente;
    public ArrayList<Producto> lista = new ArrayList<>();

    public void add(Producto p) {
        lista.add(p);
    }

    public void procesar(String tipoPago) {
        double total = 0;
        for (Producto p : lista) {
            total += p.precio * p.cantidad;
        }

        if (total > 200) total = total - (total * 0.10);
        if (total > 500) total = total - (total * 0.20);

        System.out.println("Total: " + total);

        Pago pago = new Pago();
        pago.pagar(total, tipoPago);
    }
}