import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate fechaCaducidad = LocalDate.of(2024, 5, 15);

        ProductoPerecedero productopPerecedero = new ProductoPerecedero("Leche", "Leche descremada", 5000,
                fechaCaducidad);

        productopPerecedero.imprimir();
        productopPerecedero.calcularDescuento();

        ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero("jabon de baño", "olor a rosas", 10000);
        productoNoPerecedero.imprimir();
        productoNoPerecedero.calcularDescuento();

    }
}