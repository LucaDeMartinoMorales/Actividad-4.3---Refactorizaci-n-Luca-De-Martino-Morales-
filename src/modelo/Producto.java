package modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    private String tipo;

    public Producto(String nombre, double precio, int cantidad, String tipo) {
        this.setNombre(nombre);
        this.setPrecio(precio);
        this.setCantidad(cantidad);
        this.setTipo(tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0){
            throw new IllegalArgumentException("El precio no puede ser negativo.");
    }
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
    }
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcularSubtotal() {
        return getPrecio() * getCantidad();
    }
}