package alc;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Alc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el total de vehiculos que vamos a almacenar
        System.out.print("Ingrese la cantidad de vehiculos a almacenar: ");
        int N = scanner.nextInt();

        // Creamos el array de vehiculos
        Vehiculo[] vehiculos = new Vehiculo[N];

        // Cargamos los datos de cada vehiculo en el array
        for (int i = 0; i < N; i++) {
            vehiculos[i] = new Vehiculo();
            System.out.println("Ingrese los datos del vehiculo " + (i+1));
            System.out.print("Marca: ");
            vehiculos[i].setMarca(scanner.next());
            System.out.print("Modelo: ");
            vehiculos[i].setModelo(scanner.next());
            System.out.print("Año: ");
            vehiculos[i].setAño(scanner.nextInt());
            System.out.print("Precio: ");
            vehiculos[i].setPrecio(scanner.nextInt());
            System.out.print("Cantidad: ");
            vehiculos[i].setCantidad(scanner.nextInt());
        }

        // Imprimimos los datos de cada vehiculo
        System.out.println("Los datos de los " + N + " vehiculos son:");
        for (int i = 0; i < N; i++) {
            System.out.println("Vehiculo " + (i+1) + ":");
            System.out.println("Marca: " + vehiculos[i].getMarca());
            System.out.println("Modelo: " + vehiculos[i].getModelo());
            System.out.println("Año: " + vehiculos[i].getAño());
            System.out.println("Precio: " + vehiculos[i].getPrecio());
            System.out.println("Cantidad: " + vehiculos[i].getCantidad());
            System.out.println();
        }

    }
}
