public class ProductoNoPerecedero extends Producto {

    public ProductoNoPerecedero(String nombre, String descripcion, int precio) {
        super(nombre, descripcion, precio);
    }

    public void calcularDescuento() {
        double descuento = precio * 0.2;
        double precioDescuento = precio - descuento;

        System.out.println("el descuento aplicado sera de " + descuento);
        System.out.println("el precio final despues de aplicar el descuento sera de " + precioDescuento);

    }

    public void imprimir() {
        System.out.println(nombre);
        System.out.println(descripcion);
        System.out.println(precio);

    }
}
