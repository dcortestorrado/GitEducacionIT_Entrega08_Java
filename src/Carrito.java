import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {
    private List<ProductoDeAlmacen> carritoDeCompras = new ArrayList<>();

    //Constructores

    public Carrito(){}

    //Getter

    public List<ProductoDeAlmacen> getCarritoDeCompras() {
        return carritoDeCompras;
    }

    //Métodos

    public void agregarAlCarrito(ProductoDeAlmacen productoNuevo){
        this.carritoDeCompras.add(productoNuevo);
    }

    public void verProductosCarrito(){
        int count = 0;

        for(ProductoDeAlmacen producto: this.carritoDeCompras){
            System.out.println(producto.toString());
            count++;
        }
        System.out.println("---------");
        System.out.println("La cantidad de elementos en tu carrito es: " + count);
    }

    public void importeTotal() throws CarritoVacioException {
        Iterator<ProductoDeAlmacen> iteradorProductos = this.carritoDeCompras.iterator();
        double total = 0;

        if(!iteradorProductos.hasNext()){
            throw new CarritoVacioException("El carrito esta vacio. Agrega productos para saber el valor total");
        }

        while(iteradorProductos.hasNext()){
            total += iteradorProductos.next().getPrecio();
        }

        //IVA
        total = total * IIva.IVA + total;

        System.out.println("El importe total de tus productos es de " + total + " pesos.");
    }

    public String comprar() throws CarritoVacioException {
        Iterator<ProductoDeAlmacen> iteradorProductos = this.carritoDeCompras.iterator();

        if(!iteradorProductos.hasNext()){
            throw new CarritoVacioException("No puedes realizar la compra porque aun no tienes productos en el carrito");
        }

        while(iteradorProductos.hasNext()){
            this.carritoDeCompras.clear();
        }

        return "Gracias por comprar en tu tienda - La Mejor";
    }

}
