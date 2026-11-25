public class MainCarrito {
    public static void main(String[] args) {
        // 1. Crear productos independientes
        Producto p1 = new Producto("P01", "Mouse Inalámbrico", 25.50);
        Producto p2 = new Producto("P02", "Teclado Mecánico", 40.00);
        Producto p3 = new Producto("P03", "Audífonos Bluetooth", 35.00);

        // 2. Prueba mínima: Carrito vacío
        Carrito carrito = new Carrito();
        System.out.println("=== 1. CARRITO INICIAL (VACÍO) ===");
        System.out.println("Cantidad de ítems: " + carrito.obtenerCantidadItems());
        System.out.println(carrito.mostrarResumen());

        // 3. Prueba mínima: Agregar dos productos (uno con cantidad 2) y probar validación <= 0
        carrito.agregarProducto(p1, 2);
        carrito.agregarProducto(p2, 1);
        carrito.agregarProducto(p3, 0); // No debe agregarse por el desafío adicional

        System.out.println("\n=== 2. CARRITO CON PRODUCTOS AGREGADOS ===");
        System.out.println("Cantidad de ítems: " + carrito.obtenerCantidadItems());
        System.out.println("Total calculado: $" + carrito.calcularTotal());
        System.out.println(carrito.mostrarResumen());

        // 4. Desafío adicional: Ítem con mayor subtotal
        ItemCarrito mayor = carrito.obtenerItemMayorSubtotal();
        System.out.println("\n=== 3. DESAFÍO: ÍTEM DE MAYOR SUBTOTAL ===");
        if (mayor != null) {
            System.out.println(mayor.mostrarInformacion());
        }

        // 5. Prueba mínima: Eliminar posición válida (índice 0)
        System.out.println("\n=== 4. ELIMINAR POSICIÓN VÁLIDA (0) ===");
        boolean eliminadoValido = carrito.eliminarItem(0);
        System.out.println("¿Se eliminó?: " + eliminadoValido);
        System.out.println(carrito.mostrarResumen());

        // 6. Prueba mínima: Intentar eliminar posición inválida (índice 5)
        System.out.println("\n=== 5. ELIMINAR POSICIÓN INVÁLIDA (5) ===");
        boolean eliminadoInvalido = carrito.eliminarItem(5);
        System.out.println("¿Se eliminó?: " + eliminadoInvalido);
    }
}
