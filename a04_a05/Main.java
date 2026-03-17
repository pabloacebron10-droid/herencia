package a04_a05;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Nota[] melodiaInicial = {Nota.DO, Nota.RE};
        Piano piano = new Piano("Yamaha", "P45", melodiaInicial);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver melodía");
            System.out.println("2. Añadir notas");
            System.out.println("3. Interpretar");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    System.out.println(Arrays.toString(piano.getMelodia()));
                    break;

                case 2:

                    System.out.println("Cuantas notas quieres añadir?");
                    int cantidad = sc.nextInt();

                    Nota[] nuevas = new Nota[cantidad];

                    for(int i = 0; i < cantidad; i++){
                        System.out.println("Introduce nota (DO RE MI FA SOL LA SI)");
                        String nota = sc.next().toUpperCase();
                        nuevas[i] = Nota.valueOf(nota);
                    }

                    piano.add(nuevas);
                    break;

                case 3:
                    piano.interpretar();
                    break;

            }

        } while(opcion != 0);

        sc.close();
    }
}
