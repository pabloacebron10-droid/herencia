package a01_a02_a03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HoraExacta hora1 = new HoraExacta(0, 0, 0);
        HoraExacta hora2 = new HoraExacta(0, 0, 0);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear hora 1");
            System.out.println("2. Incrementar 1 segundo");
            System.out.println("3. Cambiar hora");
            System.out.println("4. Cambiar minutos");
            System.out.println("5. Cambiar segundos");
            System.out.println("6. Mostrar hora");
            System.out.println("7. Comparar con otra hora");
            System.out.println("0. Salir");
            System.out.print("Elige opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce hora: ");
                    int h = sc.nextInt();
                    System.out.print("Introduce minutos: ");
                    int m = sc.nextInt();
                    System.out.print("Introduce segundos: ");
                    int s = sc.nextInt();

                    hora1 = new HoraExacta(h, m, s);
                    break;

                case 2:
                    hora1.inc();
                    System.out.println("Hora incrementada.");
                    break;

                case 3:
                    System.out.print("Nueva hora: ");
                    int nuevaHora = sc.nextInt();

                    if (hora1.setHora(nuevaHora)) {
                        System.out.println("Hora cambiada.");
                    } else {
                        System.out.println("Hora no válida.");
                    }
                    break;

                case 4:
                    System.out.print("Nuevos minutos: ");
                    int nuevosMin = sc.nextInt();

                    if (hora1.setMinutos(nuevosMin)) {
                        System.out.println("Minutos cambiados.");
                    } else {
                        System.out.println("Minutos no válidos.");
                    }
                    break;

                case 5:
                    System.out.print("Nuevos segundos: ");
                    int nuevosSeg = sc.nextInt();

                    if (hora1.setSegundo(nuevosSeg)) {
                        System.out.println("Segundos cambiados.");
                    } else {
                        System.out.println("Segundos no válidos.");
                    }
                    break;

                case 6:
                    System.out.println(hora1);
                    break;

                case 7:
                    System.out.println("Introduce otra hora para comparar:");

                    System.out.print("Hora: ");
                    int h2 = sc.nextInt();
                    System.out.print("Minutos: ");
                    int m2 = sc.nextInt();
                    System.out.print("Segundos: ");
                    int s2 = sc.nextInt();

                    hora2 = new HoraExacta(h2, m2, s2);

                    if (hora1.equals(hora2)) {
                        System.out.println("Las horas son iguales.");
                    } else {
                        System.out.println("Las horas son distintas.");
                    }
                    break;

            }

        } while (opcion != 0);

    }
}