package a07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        double importe;

        do {
            System.out.println("\n--- MENU PAGOS ---");
            System.out.println("1. Pago con Bizum");
            System.out.println("2. Pago con Tarjeta");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Introduce el importe: ");
                    importe = sc.nextDouble();

                    PagoBizum bizum = new PagoBizum();
                    System.out.println("\nHas elegido Bizum");

                    Pagar.procesarPago(importe);
                    Pagar.generarFactura(importe);
                }

                case 2 -> {
                    System.out.print("Introduce el importe: ");
                    importe = sc.nextDouble();

                    PagoTarjeta tarjeta = new PagoTarjeta();
                    System.out.println("\nHas elegido Tarjeta");

                    Pagar.procesarPago(importe);
                    Pagar.generarFactura(importe);
                }

                case 0 -> System.out.println("Saliendo del programa...");

                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 0);
    }
}
