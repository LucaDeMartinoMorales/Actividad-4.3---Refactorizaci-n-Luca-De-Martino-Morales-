package app;

import descuento.DescuentoEstandar;
import descuento.DescuentoVip;
import descuento.EstrategiaDescuento;
import modelo.Cliente;
import modelo.Pedido;
import modelo.Producto;
import pago.EstrategiaPago;
import pago.SeleccionPago;
import servicio.PedidoServicio;

public class AppMain {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", "ana@gmail", "123", 70);
        cliente.setVip(true);
        cliente.setSaldo(2000);

        Producto camisa = new Producto("Camisa", 50, 3, "ROPA");
        Producto television = new Producto("TV", 600, 1, "ELECTRO");

        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(camisa);
        pedido.agregarProducto(television);

        EstrategiaDescuento descuento = cliente.isVip()
                ? new DescuentoVip()
                : new DescuentoEstandar();

        EstrategiaPago pago = SeleccionPago.obtener("TARJETA");

        PedidoServicio servicio = new PedidoServicio(descuento, pago);
        servicio.procesar(pedido);
    }
}