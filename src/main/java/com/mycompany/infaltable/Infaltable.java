package com.mycompany.infaltable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Infaltable {

    static Random RNG = new Random();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    static int[] mazo() {
        int[] cartas = new int[15];
        for (int f = 0; f < cartas.length; f++) {
            cartas[f] = RNG.nextInt(99) + 1;
        }
        return cartas;
    }

    @SuppressWarnings("empty-statement")
    static void rondaN() {
        int[] Ncarta = mazo();
        int setsP = 0;
        int setsM = 0;
        String[] cartasU = {"1", "2", "3", "4", "5"};
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---//----//----//----//----//----//----//---");
        System.out.println("             EL LORO TE DESAFIA");
        System.out.println("---//----//----//----//----//----//----//---");

        while (setsP != 3 && setsM != 3) {

            //pantalla de cartas//
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("          Jugas con estas cartas:");
            System.out.println("--------------------------------------------");

            //sistema de cartas usadas
            if (!(cartasU[0]).equals("usada")) {
                System.out.println("1] Leon:     [p= " + Ncarta[0] + "]  [v= " + Ncarta[1] + "]  [h= " + Ncarta[2] + " ]");
            }
            if (!(cartasU[1]).equals("usada")) {
                System.out.println("2] Milanesa: [p= " + Ncarta[3] + "]  [v= " + Ncarta[4] + "]  [h= " + Ncarta[5] + " ]");
            }
            if (!(cartasU[2]).equals("usada")) {
                System.out.println("3] Flash:    [p= " + Ncarta[6] + "]  [v= " + Ncarta[7] + "]  [h= " + Ncarta[8] + " ]");
            }
            if (!(cartasU[3]).equals("usada")) {
                System.out.println("4] Mesa:     [p= " + Ncarta[9] + "]  [v= " + Ncarta[10] + "]  [h= " + Ncarta[11] + " ]");
            }
            if (!(cartasU[4]).equals("usada")) {
                System.out.println("5] Kuriboh:  [p= " + Ncarta[12] + "] [v= " + Ncarta[13] + "]   [h= " + Ncarta[14] + " ]");
            }

            //RNG
            int[] valores = {RNG.nextInt(99) + 1, RNG.nextInt(99) + 1, RNG.nextInt(99) + 1};

            String[] datos = {"PODER DE EL LORO=" + valores[0], "VIDA DE EL LORO=" + valores[1], "HECHIZO DE EL LORO= " + valores[2]};

            //Juego
            System.out.println("--------------------------------------------");
            System.out.println("               Elige tu carta");
            System.out.println("   escribe el numero correspondiente(1-5)");
            System.out.println("--------------------------------------------");
            String Eleccion = scan.nextLine();

            //Sistema de cartas usadas
            if ((Eleccion.equals("1") && cartasU[0].equals("usada"))
                    || (Eleccion.equals("2") && cartasU[1].equals("usada")
                    || (Eleccion.equals("3") && cartasU[2].equals("usada")
                    || (Eleccion.equals("4") && cartasU[3].equals("usada")
                    || (Eleccion.equals("5") && cartasU[4].equals("usada")))))) {

                System.out.println("¡CARTA USADA¡");

                continue;
            }

            //Resolucion
            switch (Eleccion) {
                case "/menu", "/MENU" ->
                    menu();
                case "/reset", "/RESET" ->
                    infaltable();
                case "/close", "/CLOSE" ->
                    System.exit(0);
                case "/all1", "/ALL1" -> {
                    Arrays.fill(Ncarta, 1);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(" Todas las cartas ahora son 1");
                    System.out.println("--------------------------------------------");
                    System.out.println("sabias que la posibilidad de que esto ocurra");
                    System.out.println("aleatoriamente es  1 dividido un 10");
                    System.out.println("seguido de treinta ceros?");
                    System.out.println("si resetearas un millon de veces por segundo");
                    System.out.println("los valores, tardarias  2 millones trecientas");
                    System.out.println("mil veces la edad del universo para que se   ");
                    System.out.println("diera de manera natural                      ");
                    System.out.println("--------------------------------------------");

                }
                case "/all99", "/ALL99" -> {
                    Arrays.fill(Ncarta, 99);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println(" Todas las cartas ahora son 99");
                    System.out.println("--------------------------------------------");
                    System.out.println("sabias que la posibilidad de que esto ocurra");
                    System.out.println("aleatoriamente es  1 dividido un 10");
                    System.out.println("seguido de treinta ceros?");
                    System.out.println("si resetearas un millon de veces por segundo");
                    System.out.println("los valores, tardarias  2 millones trecientas");
                    System.out.println("mil veces la edad del universo para que se   ");
                    System.out.println("diera de manera natural                      ");
                    System.out.println("--------------------------------------------");

                }
                case "1" -> {
                    System.out.println("--------------------------------------------");
                    System.out.println(" Elige tu siguiente jugada { [P] [V] [H] }");
                    System.out.println("--------------------------------------------");
                    String EleccionC = scan.nextLine();
                    switch (EleccionC) {
                        case "/menu":
                        case "/MENU":
                            menu();
                            break;
                        case "/close":
                        case "/CLOSE":
                            System.exit(0);
                        case "P":
                        case "p":
                            if (Ncarta[0] < valores[0]) {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[0] == valores[0]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");

                            }
                            break;
                        case "V":
                        case "v":
                            if (Ncarta[1] < valores[1]) {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[1] == valores[1]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "H":
                        case "h":
                            if (Ncarta[2] < valores[2]) {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("              El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[2] == valores[2]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[0] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                }
                case "2" -> {
                    System.out.println("--------------------------------------------");
                    System.out.println("    Elige tu siguiente jugada([P] [V] [H]");
                    System.out.println("--------------------------------------------");
                    String EleccionC = scan.next();
                    switch (EleccionC) {
                        case "/menu":
                        case "/MENU":
                            menu();
                            break;
                        case "/close":
                        case "/CLOSE":
                            System.exit(0);
                        case "P":
                        case "p":
                            if (Ncarta[3] < valores[0]) {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[3] == valores[0]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "V":
                        case "v":
                            if (Ncarta[4] < valores[1]) {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[4] == valores[1]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                    Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "H":
                        case "h":
                            if (Ncarta[5] < valores[2]) {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("              El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[5] == valores[2]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[1] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                }
                case "3" -> {
                    System.out.println("--------------------------------------------");
                    System.out.println("      Elige Tu siguiente jugada([P] [V] [H]");
                    System.out.println("--------------------------------------------");
                    String EleccionC = scan.next();
                    switch (EleccionC) {
                        case "/menu", "/MENU" ->
                            menu();
                        case "/close", "/CLOSE" ->
                            System.exit(0);
                        case "P", "p" -> {
                            if (Ncarta[6] < valores[0]) {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("              El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[6] == valores[0]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                        }
                        case "V", "v" -> {
                            if (Ncarta[7] < valores[1]) {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("             El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[7] == valores[1]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                        }
                        case "H", "h" -> {
                            if (Ncarta[8] < valores[2]) {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("              El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[8] == valores[2]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[2] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                        }
                        default -> {
                        }
                    }
                }

                case "4" -> {
                    System.out.println("--------------------------------------------");
                    System.out.println("   Elige tu siguiente jugada ([P] [V] [H]");
                    System.out.println("--------------------------------------------");
                    String EleccionC = scan.next();
                    switch (EleccionC) {
                        case "/menu":
                        case "/MENU":
                            menu();
                            break;
                        case "/close":
                        case "/CLOSE":
                            System.exit(0);
                        case "P":
                        case "p":
                            if (Ncarta[9] < valores[0]) {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("              El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[9] == valores[0]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "V":
                        case "v":
                            if (Ncarta[10] < valores[1]) {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[10] == valores[1]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                    Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "H":
                        case "h":
                            if (Ncarta[11] < valores[2]) {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("            El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[11] == valores[2]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                   Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[3] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                }
                case "5" -> {
                    System.out.println("");
                    System.out.println("--------------------------------------------");
                    System.out.println("   Elige tu siguiente jugada ([P] [V] [H]");
                    System.out.println("--------------------------------------------");
                    String EleccionC = scan.next();
                    switch (EleccionC) {
                        case "/menu":
                        case "/MENU":
                            menu();
                            break;
                        case "/close":
                        case "/CLOSE":
                            System.exit(0);
                        case "P":
                        case "p":
                            if (Ncarta[12] < valores[0]) {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("               El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[12] == valores[0]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[0]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");

                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "V":
                        case "v":
                            if (Ncarta[13] < valores[1]) {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");;
                            } else if (Ncarta[13] == valores[1]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                  Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[1]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        case "H":
                        case "h":
                            if (Ncarta[14] < valores[2]) {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("             El Loro gana");
                                System.out.println("--------------------------------------------");
                                setsM++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            } else if (Ncarta[14] == valores[2]) {
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                 Empate");
                                System.out.println("--------------------------------------------");
                            } else {
                                cartasU[4] = "usada";
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("                Tu ganas");
                                System.out.println("--------------------------------------------");
                                setsP++;
                                System.out.println(datos[2]);
                                System.out.println("--------------------------------------------");
                                System.out.println("                PUNTUACION");
                                System.out.println("--------------------------------------------");
                                System.out.println("");
                                System.out.println("--------------------------------------------");
                                System.out.println("  Tu: " + setsP + " // El Loro: " + setsM);
                                System.out.println("--------------------------------------------");
                            }
                            break;
                        default:
                            break;
                    }
                }
                default -> {
                }
            }

        }
        if (setsM == 3) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("          EL LORO TE HA DERROTADO");
            System.out.println("--------------------------------------------");
            System.out.println("         El LORO: TE FALTA PRÁCTICA");
            System.out.println("         QUE LE GANES AL DINOSAURIO");
            System.out.println("      NO SIGNIFICA QUE PUEDAS VENCERME");
            System.out.println("--------------------------------------------");
        } else {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("            HAS SUPERADO AL LORO");
            System.out.println(" EL LORO: NO TENDRÁS TANTA SUERTE LA PROXIMA");
            System.out.println("--------------------------------------------");
        }
    }

    static void enter() {
        System.out.println("        Presiona enter para continuar");
        while (true) {
            scan.nextLine();
            String input = scan.nextLine();
            if (input.isEmpty()) {
                infaltable();
            }
        }
    }

    static void menu() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("============================================");
        System.out.println("   E L   D E S A F I O   D E L   L O R O");
        System.out.println("============================================");
        System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");
        System.out.println("               EL LORO TE RETA");
        System.out.println("==//==//==//==//==//==//==//==//==//==//==//==");
        System.out.println("============================================");
        System.out.println("           [1] Aceptar el reto");
        System.out.println("           [2] Negarse al reto");
        System.out.println("           [3] Ver tutorial");
        System.out.println("           [4] Comandos especiales");
        System.out.println("           [5] Creditos                         ");
        System.out.println("           [6] Cerrar juego");
        System.out.println("============================================");
        int elec2 = scan.nextInt();
        switch (elec2) {
            case 3 ->
                tutorial();
            case 2 -> {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("--------------------------------------------");
                System.out.println("");
                System.out.println("       EL LORO: TAN ASUSTADO ESTAS?");
                System.out.println("           DALE PA' DENTRO PAPI");
                System.out.println("");
                System.out.println("--------------------------------------------");
                enter();
            }
            case 1 -> {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("--------------------------------------------");
                System.out.println("");
                System.out.println("            EL LORO: MALA IDEA");
                System.out.println("");
                System.out.println("--------------------------------------------");
                enter();
            }
            case 4 -> {
                Comandos();
            }
            case 5 -> {
                creditos();
            }
            case 6 -> {
                System.exit(0);
            }
            default -> {
            }
        }
    }

    static void tutorial() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("   Hola, soy el dinosaurio, te voy a preparar");
        System.out.println("          para enfrentar al loro");
        System.out.println("    En primer lugar, debes elegir tu carta");
        System.out.println("         Tras usarse, esta desaparece");
        System.out.println("       asi que debes elegir con cuidado");
        enterT();
    }

    static void infaltable() {

        boolean fin = true;

        do {

            mazo();
            rondaN();

            //Reintentar
            String[] ReintentoS = {"S", "s"};
            String[] ReintentoN = {"N", "n"};
            System.out.println("        Quieres volver a intentarlo?");
            System.out.println("                  [S]/[N]");
            System.out.println("--------------------------------------------");

            String Reintentar = scan.next();

            if (Reintentar.equals(ReintentoS[0]) || Reintentar.equals(ReintentoS[1])) {
                fin = false;
            } else if (Reintentar.equals(ReintentoN[0]) || Reintentar.equals(ReintentoN[1])) {
                fin = true;
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("---//----//----//----//----//----//----//---");
                System.out.println("            GRACIAS POR JUGAR");
                System.out.println("---//----//----//----//----//----//----//---");
            }
        } while (fin != true);
        System.exit(0);

    }

    static void enterT() {
        System.out.println("--------------------------------------------");
        System.out.println("        Presiona enter para continuar");
        System.out.println("--------------------------------------------");
        while (true) {
            scan.nextLine();
            String input = scan.nextLine();
            if (input.isEmpty()) {
                rondaT();
            }
        }
    }

    static void rondaT() {
        int rondaT = 0;
        int puntosPT = 0;

        String cartaT1 = "1] Leon:     [p= 40] [v= 60] [h= 10] ";
        String cartaT2 = "2] Milanesa: [p= 28] [v= 53] [h= 90] ";

        do {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("--------------------------------------------");
            System.out.println("               Elige tu carta");
            System.out.println("   escribe el numero correspondiente(1-2)");
            System.out.println("--------------------------------------------");

            if ((!"usada".equals(cartaT1))) {
                System.out.println(cartaT1);
            }
            if ((!"usada".equals(cartaT2))) {
                System.out.println(cartaT2);
            }
            String Eleccion = scan.next();

            if ((Eleccion.equals("1")) && (cartaT1.equals("usada"))
                    || (Eleccion.equals("2")) && (cartaT2.equals("usada"))) {
                System.out.println("¡CARTA USADA!");
                continue;
            }

            if (Eleccion.equals("1") && !cartaT1.equals("usada")) {
                cartaT1 = "usada";
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                while (rondaT != 1) {

                    System.out.println("      Cada carta tiene 3 estadisticas,");
                    System.out.println("           (Poder, Vida, Hechizo)");
                    System.out.println("          Tu seleccionas cual usar");
                    System.out.println("    ¡RECUERDA QUE SOLO PUEDES USAR UNA");
                    System.out.println("           ESTADISTICA POR CARTA¡");
                    System.out.println("--------------------------------------------");
                    rondaT = 1;
                }
                System.out.println("--------------------------------------------");
                System.out.println("          Elige tu siguiente jugada");
                System.out.println("           escribiendo [P] [V] [H]");
                System.out.println("--------------------------------------------");
                String EleccionC = scan.next();

                switch (EleccionC) {
                    case "P":
                    case "p":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("poder del Dinosaurio: 25");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "h":
                    case "H":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("hechizo del Dinosaurio: 8");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "v":
                    case "V":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("vida del Dinosaurio: 50");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "/close":
                    case "/CLOSE":
                        System.exit(0);
                    case "/menu":
                    case "/MENU":
                        menu();
                        break;
                    default:
                        break;
                }

            } else if (Eleccion.equals("2") && !cartaT2.equals("usada")) {
                cartaT2 = "usada";
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                while (rondaT != 1) {
                    System.out.println("      Cada carta tiene 3 estadisticas,");
                    System.out.println("           (Poder, Vida, Hechizo)");
                    System.out.println("          Tu seleccionas cual usar");
                    System.out.println("    ¡RECUERDA QUE SOLO PUEDES USAR UNA");
                    System.out.println("           ESTADISTICA POR CARTA¡");
                    System.out.println("--------------------------------------------");
                    rondaT = 1;
                }
                System.out.println("--------------------------------------------");
                System.out.println("          Elige tu siguiente jugada");
                System.out.println("           escribiendo [P] [V] [H]");
                System.out.println("--------------------------------------------");
                String EleccionC = scan.next();

                switch (EleccionC) {
                    case "P":
                    case "p":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("Poder del Dinosaurio: 15");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "h":
                    case "H":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("Hechizo del Dinosaurio: 3");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "v":
                    case "V":
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("--------------------------------------------");
                        System.out.println("                 Tu ganas");
                        System.out.println("--------------------------------------------");
                        puntosPT++;
                        System.out.println("Vida del Dinosaurio: 36");
                        System.out.println("--------------------------------------------");
                        System.out.println("                PUNTUACION");
                        System.out.println("--------------------------------------------");
                        System.out.println("  Tu: " + puntosPT + " // El Dinosaurio: 0");
                        System.out.println("--------------------------------------------");
                        break;
                    case "/close":
                    case "/CLOSE":
                        System.exit(0);
                    case "/menu":
                    case "/MENU":
                        menu();
                        break;
                    default:
                        break;
                }

            } else if (Eleccion.equals("/close") || Eleccion.equals("/CLOSE")) {
                System.exit(0);
            } else if (Eleccion.equals("/menu") || Eleccion.equals("/MENU")) {
                menu();
            }

        } while (puntosPT != 2);
        System.out.println("--------------------------------------------");
        System.out.println("Felicidades");
        System.out.println("Has completado el tutorial");
        System.out.println("El Dinosaurio: Ahora ya sabes como funciona");
        System.out.println("Es tu turno de enfrentar al Jefe");
        System.out.println("--------------------------------------------");
        menu();
    }

    static void Comandos() {
        System.out.println("--------------------------------------------");
        System.out.println("   [/MENU ]: Accseso al menu pricipal");
        System.out.println("   [/RESET]: Resetea valores de las cartas");
        System.out.println("   [/CLOSE]: Cierra el juego");
        System.out.println("   [/ALL1] : Setea todos los valores de las");
        System.out.println("  cartas en 1");
        System.out.println("   [/ALL99]: Setea todos los valores de las");
        System.out.println("  cartas en 99");
        System.out.println("--------------------------------------------");
        System.out.println("     Presiona enter para volver al menu");
        System.out.println("--------------------------------------------");
        while (true) {
            scan.nextLine();
            String input = scan.nextLine();
            if (input.isEmpty()) {
                menu();
            }
        }
    }

    static void creditos() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------[CREDITOS]-----------------");
        System.out.println("");
        System.out.println("  INTERPRETACIONES:");
        System.out.println("  ");
        System.out.println("  EL LORO:        Alejandro Sambucetti");
        System.out.println("  EL DINOSAURIO:  Alejandro Sambucetti");
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("  DESARROLLADORES:");
        System.out.println("  ");
        System.out.println("  Alejandro Sambucetti");
        System.out.println("  Benjamin  Lugli");
        System.out.println("  Lautaro   Britos");
        System.out.println("  Victoria  Castro");
        System.out.println("");
        System.out.println("********************************************");
        System.out.println("");
        System.out.println("  AGRADECIMIENTOS ESPECIALES A:");
        System.out.println("");
        System.out.println("  Oliver Lanni: Idea principal de juego");
        System.out.println("  Ceibal:       Equipos para el desarrollo");
        System.out.println("                del juego");
        System.out.println("  ChatGPT;      Correccion de errores");
        System.out.println("--------------------------------------------");
        System.out.println("           Y GRACIAS A TI JUGADOR");
        System.out.println("         POR SER PARTE DEL PROYECTO");
        System.out.println("--------------------------------------------");
        System.out.println("     Presiona enter para volver al menu");
        System.out.println("--------------------------------------------");
        while (true) {
            scan.nextLine();
            String input = scan.nextLine();
            if (input.isEmpty()) {
                menu();
            }
        }
    }

}
