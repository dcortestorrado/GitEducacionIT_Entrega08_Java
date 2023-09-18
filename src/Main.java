public class Main {
    public static void main(String[] args) {
        //Productos
        ProductoDeAlmacen papasFritas = new ProductoDeAlmacen(25.5,"Papas Fritas", "Snacks");
        ProductoDeAlmacen desinfectante = new ProductoDeAlmacen(40, "Desinfectante", "Aseo");
        ProductoDeAlmacen tiqueteLoteria = new ProductoDeAlmacen(5.7, "Tiquete Loteria", "Caja Registradora");
        ProductoDeAlmacen filetePollo = new ProductoDeAlmacen(62.7, "Filete de Pollo 500gr", "Carnes");

        Carrito miCarritoDeCompras = new Carrito();

        //miCarritoDeCompras.agregarAlCarrito(papasFritas);
        //miCarritoDeCompras.agregarAlCarrito(desinfectante);
        //miCarritoDeCompras.agregarAlCarrito(tiqueteLoteria);
        //miCarritoDeCompras.agregarAlCarrito(filetePollo);

        miCarritoDeCompras.verProductosCarrito();

        try{
            miCarritoDeCompras.importeTotal();

        } catch(CarritoVacioException e){
            System.out.println("---------");
            System.out.println(e.getMessage());
            System.out.println("---------");
        }

        try {
            miCarritoDeCompras.comprar();

        } catch(CarritoVacioException e){
            System.out.println("---------");
            System.out.println(e.getMessage());
            System.out.println("---------");
        }


    }
}
