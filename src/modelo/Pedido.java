package modelo;

import java.util.ArrayList;

public class Pedido {
    private final Cliente cliente;
    private final ArrayList<Producto> productos = new ArrayList<>();

    public Pedido(Cliente cliente) {
        if (cliente == null){
            throw new IllegalArgumentException("El cliente no puede ser nulo.");
    }
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        if (producto == null){
            throw new IllegalArgumentException("El producto no puede ser nulo.");
    }
        productos.add(producto);
    }

    public double calcularTotalBruto() {
        double total = 0;
        for (Producto p : getProductos()) {
            total += p.calcularSubtotal();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
}