package a06.v2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bombilla bombilla = new Bombilla(false, "Desconectado");
        Televisor televisor = new Televisor(false, "Desconectado");

        int opcion;
        do {
            System.out.println("\n=== MENU DISPOSITIVOS ===");
            System.out.println("1. Encender Bombilla");
            System.out.println("2. Apagar Bombilla");
            System.out.println("3. Conectar Bombilla");
            System.out.println("4. Mostrar info Bombilla");
            System.out.println("5. Encender Televisor");
            System.out.println("6. Apagar Televisor");
            System.out.println("7. Conectar Televisor");
            System.out.println("8. Mostrar info Televisor");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch(opcion) {
                case 1 -> bombilla.encender();
                case 2 -> bombilla.apagar();
                case 3 -> {
                    System.out.print("Introduce nombre de la red: ");
                    String red = sc.nextLine();
                    System.out.print("Introduce contraseña: ");
                    String pass = sc.nextLine();
                    bombilla.conectar(red, pass);
                }
                case 4 -> bombilla.mostrarInformacion();
                case 5 -> televisor.encender();
                case 6 -> televisor.apagar();
                case 7 -> {
                    System.out.print("Introduce nombre de la red: ");
                    String red = sc.nextLine();
                    System.out.print("Introduce contraseña: ");
                    String pass = sc.nextLine();
                    televisor.conectar(red, pass);
                }
                case 8 -> televisor.mostrarInformacion();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida");
            }
        } while(opcion != 0);

        sc.close();
    }
}
