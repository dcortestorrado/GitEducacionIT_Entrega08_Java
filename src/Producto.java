public abstract class Producto {
    private double precio;
    private String nombre;

    //Constructores
    public Producto(){}

    public Producto(double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
    }

    //Getters

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    //Setters

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //toString

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
