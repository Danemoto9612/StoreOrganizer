package main;

import java.util.Scanner;

public class MainMenu {

    // Scanner para leer entrada del usuario
    static Scanner sc = new Scanner(System.in);

    // Variable para almacenar la entrada del usuario
    static String option;

    public static void storeOrganizerMenu() {

        do {

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("                       <<<   M A I N   M E N U   >>>");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Acomodar Caja                          5. Alistar caja para la venta");
            System.out.println("2. Listar Cajas                           6.Poner primero las cajas a vencer");
            System.out.println("3. Proxima caja a vencerse                7. Salir");
            System.out.println("4. Cajas ingresadas en intervalo          8. Easter");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Ingrese opcion: ");
            option = sc.nextLine();

            switch (option) {

                case "1" -> {
                }
                case "2" -> {
                }
                case "3" -> {
                }
                case "4" -> {
                }
                case "5" -> {
                }
                case "6" -> {
                }
                case "7" -> {

                    // Salir y mostrar mensaje de despedida
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                      H A S T A   L A   P R O X I M A");
                    System.out.println("----------------------------------------------------------------------------");
                }
                case "8" -> {

                    // Huevo de pascua muestra el creador del programa
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                        CREADO POR DANIEL MORALES");
                }
                default -> {

                    // Muestra al usuario que ha elegido una opción inválida
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                       O P C I O N   I N V A L I D A");
                }
            }
        } while (!option.equals("7"));
    }
}
