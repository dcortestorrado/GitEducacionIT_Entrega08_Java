public class ProductoDeAlmacen extends Producto {
    private String categoriaProducto;

    //Constructores
    public ProductoDeAlmacen(){}

    public ProductoDeAlmacen(double precio, String nombre, String ubicacionEnTienda){
        super(precio, nombre);
        this.categoriaProducto = ubicacionEnTienda;
    }

    //Getter
    public String getCategoriaProducto(){
        return categoriaProducto;
    }

    //Setter
    public void setCategoriaProducto(String categoriaProducto){
        this.categoriaProducto = categoriaProducto;
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + " ProductoDeAlmacen{" +
                "categoriaProducto='" + categoriaProducto + '\'' +
                "} ";
    }
}
