public class ItemCarrito {
    private Producto producto;
    private int cantidad;

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        if (producto == null) {
            return 0.0;
        }
        return producto.getPrecio() * cantidad;
    }

    public String mostrarInformacion() {
        return producto.getNombre() + " | Cant: " + cantidad + " | P. Unit: $" + producto.getPrecio()
                + " | Subtotal: $" + calcularSubtotal();
    }
}