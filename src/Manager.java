public class Manager {
    public void ejecutar() {
        Cliente c = new Cliente("Ana", "ana@gmail", "123", 70);
        c.vip = true;
        c.dinero = 2000;

        Producto p1 = new Producto("Camisa", 50, 3, "ROPA");
        Producto p2 = new Producto("TV", 600, 1, "ELECTRO");

        Pedido pedido = new Pedido();
        pedido.cliente = c;

        pedido.add(p1);
        pedido.add(p2);

        pedido.procesar("TARJETA");
    }
}