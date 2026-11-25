import java.util.ArrayList;

public class Carrito {
    private ArrayList<ItemCarrito> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    // Incluye el desafío adicional: evita agregar cantidades menores o iguales a cero
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto != null && cantidad > 0) {
            ItemCarrito nuevoItem = new ItemCarrito(producto, cantidad);
            items.add(nuevoItem);
        }
    }

    public int obtenerCantidadItems() {
        return items.size();
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public boolean eliminarItem(int posicion) {
        if (posicion >= 0 && posicion < items.size()) {
            items.remove(posicion);
            return true;
        }
        return false;
    }

    public String mostrarResumen() {
        if (items.isEmpty()) {
            return "El carrito está vacío.\nTotal: $0.0";
        }
        String resumen = "--- RESUMEN DEL CARRITO ---\n";
        for (int i = 0; i < items.size(); i++) {
            resumen += i + ". " + items.get(i).mostrarInformacion() + "\n";
        }
        resumen += "Total a pagar: $" + calcularTotal();
        return resumen;
    }

    // Desafío adicional: obtener el ítem de mayor subtotal
    public ItemCarrito obtenerItemMayorSubtotal() {
        if (items.isEmpty()) {
            return null;
        }
        ItemCarrito mayor = items.get(0);
        for (ItemCarrito item : items) {
            if (item.calcularSubtotal() > mayor.calcularSubtotal()) {
                mayor = item;
            }
        }
        return mayor;
    }
}