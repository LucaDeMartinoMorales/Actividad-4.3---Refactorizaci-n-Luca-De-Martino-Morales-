package modelo;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;
    private int edad;
    private boolean vip;
    private double saldo;

    public Cliente(String nombre, String email, String telefono, int edad) {
        this.setNombre(nombre);
        this.setEmail(email);
        this.setTelefono(telefono);
        this.setEdad(edad);
        this.setVip(false);
        this.setSaldo(0);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")){
            throw new IllegalArgumentException("El email no es válido");
        }
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120){
            throw new IllegalArgumentException("La edad no es válida");
        }
        this.edad = edad;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }
}