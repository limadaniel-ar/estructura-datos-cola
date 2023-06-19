// Nombre: Lima, Daniel Alejandro
// Legajo: VINF013698

import java.util.Scanner;

/**
 * La clase MainCola contiene un programa que permite a los usuarios agregar,
 * procesar y administrar una cola de pedidos.
 */
public class MainCola {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        boolean cerrarPrograma = false;
        Cola pedidosPendientes = new Cola();
        int cantidadPedidos;
        int numPedido = 0;
        int opcion = 0;
        Pedido formulario, pedidoAux;
        pedidoAux = new Pedido(++numPedido, "Daniel", 26);
        pedidosPendientes.encolar(pedidoAux);
        pedidoAux = new Pedido(++numPedido, "Silvana", 45);
        pedidosPendientes.encolar(pedidoAux);
        pedidoAux = new Pedido(++numPedido, "Mateo", 76);
        pedidosPendientes.encolar(pedidoAux);
        System.out.println("NOTA: SE ENCUENTRAN 3 PEDIDOS CARGADOS PARA PRUEBAS");
        do {
            menuPrincipal();
            try {
                opcion = entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        formulario = crearPedido(++numPedido);
                        pedidosPendientes.encolar(formulario);
                        break;

                    case 2:
                        if (pedidosPendientes.esVacia()) {
                            System.out.println("No hay pendientes para procesar");
                        } else {
                            pedidoAux = pedidosPendientes.desencolar();
                            System.out.println("El pedido:\n" +
                                    pedidoAux.toString() +
                                    "\nSe acaba de procesar, queda fuera de la cola");
                        }
                        break;

                    case 3:
                        System.out.println("Los pedidos a procesar son los siguientes:");
                        pedidosPendientes.mostrar();
                        break;

                    case 4:
                        cantidadPedidos = pedidosPendientes.longitud();
                        System.out.println("Quedan " + cantidadPedidos + " pedidos pendientes");
                        break;

                    case 5:
                        pedidoAux = pedidosPendientes.primerElemento();
                        System.out.println("El próximo pedido a procesar es:\n" + pedidoAux);
                        break;

                    case 6:
                        pedidosPendientes.vaciar();
                        System.out.println("Ya no hay pedidos pendientes");
                        break;

                    case 7:
                        System.out.println("Programa finalizado");
                        cerrarPrograma = true;
                        break;
                    default:
                        System.out.println("Error: Elija una opción correcta");
                        break;
                }
            } catch (Exception e) {
                System.out.println("La opción debe ser un número");
                entrada.nextLine();
            }
        } while (!cerrarPrograma);
    }

    /**
     * Esta función imprime un menú con opciones para gestionar una cola de pedidos.
     * 
     * @author Daniel Lima
     */
    public static void menuPrincipal() {
        System.out.println("Elija una opcion");
        System.out.println("1. Agregar pedido a la cola");
        System.out.println("2. Procesar pedido (Desencolar)");
        System.out.println("3. Mostrar cola de pedidos a procesar");
        System.out.println("4. Mostrar la cantidad de pedidos a procesar");
        System.out.println("5. Averiguar el pedido más próximo a procesar");
        System.out.println("6. Vaciar cola de pedidos");
        System.out.println("7. Salir");
    }

    /**
     * Esta función crea un nuevo pedido solicitando al usuario que ingrese el
     * nombre del cliente y la cantidad de ladrillos comprados, y luego devuelve el
     * pedido como un objeto.
     * 
     * @param id El ID del pedido a crear.
     * @return El método devuelve un objeto de tipo Pedido.
     * @author Daniel Lima
     */
    public static Pedido crearPedido(int id) {
        boolean esEntero = false;
        int cantidadLadrillos = 0;
        Pedido salida;
        String nombre;
        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad de ladrillos comprados");
        do {
            try {
                cantidadLadrillos = entrada.nextInt();
                entrada.nextLine();
                esEntero = true;
            } catch (Exception e) {
                System.out.println("Sólo se pueden agregar números");
                entrada.nextLine();
            }
        } while (!esEntero);
        salida = new Pedido(id, nombre, cantidadLadrillos);
        return salida;
    }
}