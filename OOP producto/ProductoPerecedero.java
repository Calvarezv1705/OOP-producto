import java.time.LocalDate;

public class ProductoPerecedero extends Producto {

    protected LocalDate fecha;

    public ProductoPerecedero(String nombre, String descripcion, int precio, LocalDate fecha) {
        super(nombre, descripcion, precio);
        this.fecha = fecha;
    }

    public void calcularDescuento() {
        LocalDate fechaActual = LocalDate.now();

        if (fecha.isAfter(fechaActual)) {
            double descuento = precio * 0.2;
            double precioDescuento = precio - descuento;

            System.out.println("el descuento aplicado sera de " + descuento);
            System.out.println("el precio final despues de aplicar el descuento sera de " + precioDescuento);

        } else {
            System.out.println("la fechad e caducidad ha pasado no se aplicara ningun descuento");
        }
    }

    public void imprimir() {
        System.out.println(nombre);
        System.out.println(descripcion);
        System.out.println(precio);
        System.out.println(fecha);

    }

    public LocalDate getFecha() {
        return fecha;
    }
}
