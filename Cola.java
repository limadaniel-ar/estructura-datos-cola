// Nombre: Lima, Daniel Alejandro
// Legajo: VINF013698

/**
 * La clase Cola es una implementación de una estructura de datos de cola con métodos para encolar, desencolar, verificar si está vacío, obtener el primer elemento y mostrar su contenido.
 */
public class Cola {

    class Nodo {
        Pedido dato;
        Nodo siguiente;
    }

    private Nodo cabecera;
    private Nodo cola;
    private int longitud;

    public Cola() {
        cabecera = null;
        cola = null;
        longitud = 0;
    }

/**
 * Esta función agrega un nuevo nodo con datos dados al final de una estructura de datos de cola.
 * 
 * @param dato El parámetro "dato" es de tipo "Pedido" y representa los datos que se agregarán a la cola.
 * @author Daniel Lima
 */
    public void encolar(Pedido dato) {
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (esVacia()) {
            cabecera = nuevo;
        } else {
            cola.siguiente = nuevo;
        }
        cola = nuevo;
        longitud++;
    }

/**
 * Esta función elimina y devuelve el primer elemento de una estructura de datos de cola en Java.
 * 
 * @return El método devuelve un objeto Pedido, que es el primer elemento de la cola. Si la cola está vacía, devuelve nulo.
 * @author Daniel Lima
 */
    public Pedido desencolar() {
        if (esVacia())
            return null;
        Pedido dato = cabecera.dato;
        cabecera = cabecera.siguiente;
        if (cabecera == null) {
            cola = null;
        }
        longitud--;
        return dato;
    }

/**
 * La función comprueba si una estructura de datos está vacía o no.
 * 
 * @return El método específicamente, devuelve "verdadero" si la longitud es cero (lo que indica que está vacío) y "falso" en caso contrario.
 * @author Daniel Lima
 */
    public boolean esVacia() {
        return longitud == 0;
    }

/**
 * La función "vaciar" establece el encabezado, la cola y la longitud de una estructura de datos en nulo y 0, respectivamente.
 * 
 * @author Daniel Lima
 */
    public void vaciar() {
        cabecera = null;
        cola = null;
        longitud = 0;
    }

/**
 * La función "primerElemento" devuelve el primer elemento de una lista enlazada.
 * 
 * @return El método devuelve el primer elemento de una lista enlazada representada por el nodo cabecera. Si la lista enlazada está vacía, devuelve null.
 * @author Daniel Lima
 */
    public Pedido primerElemento() {
        if (esVacia())
            return null;
        return cabecera.dato;
    }

/**
 * La función "mostrar" imprime los elementos de una cola si no está vacía, e imprime un mensaje indicando que la cola está vacía en caso contrario.
 * 
 * @author Daniel Lima
 */
    public void mostrar() {
        if (esVacia()) {
            System.out.println("La cola está vacía");
        } else {
            Nodo aux = cabecera;
            while (aux != null) {
                System.out.println(aux.dato.toString());
                aux = aux.siguiente;
            }
        }
    }

/**
 * La función devuelve la longitud de una estructura de datos cola.
 * 
 * @return El método devuelve un valor entero, que es el valor de la variable longitud.
 * @author Daniel Lima
 */
    public int longitud() {
        return longitud;
    }
}