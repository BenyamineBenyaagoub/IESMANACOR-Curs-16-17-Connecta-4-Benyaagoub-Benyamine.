package ConectaCuatro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConectaCuatro c = new ConectaCuatro();
        c.ponerCeros();
        System.out.println("0 1 2 3 4 5 6");
        System.out.println("_____________");
        c.tablah();
        System.out.println("_____________");
        int turno = 2;
        boolean salir = true;
        while (salir) {
            int i = 0;
            if (turno == 2) {
                turno = 1;
            } else {
                turno = 2;
            }
            System.out.println(":Turno del jugador " + turno);
            int x = sc.nextInt();

            if (x < 7) {

                c.actuar(i, x, turno);
                System.out.println("0 1 2 3 4 5 6");
                System.out.println("_____________");
                c.tablah();
                System.out.println("_____________");
                if(i < 0){
                    System.out.println("elige otra columna");
                }
                } else {
                    System.out.println("introduce un numero entre 0 y 6");
                    if (turno == 1) {
                        turno = 2;
                    } else {
                        turno = 1;
                    }
                }
                if ((c.victoria(turno))) {

                    System.out.println("ha ganado el jugador " + turno);
                    salir = false;
                }

            }

        }
    }
