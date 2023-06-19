// Nombre: Lima, Daniel Alejandro
// Legajo: VINF013698

/**
 * La clase "Pedido" representa un pedido de un cliente con un código, nombre y cantidad de ladrillos.
 */
public class Pedido {
    int codigo;
    String nombre;
    int cantLadrillos;

    public Pedido(int codigo, String nombre, int cantLadrillos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantLadrillos = cantLadrillos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantLadrillos() {
        return cantLadrillos;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + "\tNombre: " + nombre + "\tCantidad de Ladrillos: " + cantLadrillos;
    }
}