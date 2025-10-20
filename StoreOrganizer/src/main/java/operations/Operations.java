package operations;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import shelf.ShelfA;
import shelf.ShelfB;

public class Operations {

    static Scanner sc = new Scanner(System.in);

    static ShelfA[] boxesA = new ShelfA[100];
    static int lenBoxesA = 0;
    static ShelfB[] boxesB = new ShelfB[100];
    static int lenBoxesB = 0;
    static String option;
    static int numberPrepare = 0;

    static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");

    // Apilar nueva caja
    public static void arrangeBox() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                         T I P O   D E   C A J A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA < 100) {

                    boxesA[lenBoxesA] = new ShelfA();

                    while (true) {

                        String data;
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.print("Ingrese codigo: ");
                        data = sc.nextLine();

                        if (data.length() > 0) {

                            boxesA[lenBoxesA].code = data;
                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("Codigo agregado");
                            break;
                        }
                    }

                    while (true) {

                        float data;
                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese costo: ");
                            data = sc.nextFloat();
                            sc.nextLine();
                            if (data > 0) {

                                boxesA[lenBoxesA].cost = data;
                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("Costo agregado");
                                break;
                            } else {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("              C O S T O   N O   P U E D E   S E R   C E R O");
                            }
                        } catch (Exception e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                 T I P O   D E   D A T O   I N V A L I D O");
                            sc.nextLine();
                        }
                    }

                    LocalDate date = LocalDate.now();
                    LocalTime time = LocalTime.now();
                    boxesA[lenBoxesA].registrationDate = date.format(dateFormat);
                    boxesA[lenBoxesA].registrationTime = time.format(timeFormat);

                    while (true) {

                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese fecha de vencimiento (dd/mm/yyyy): ");
                            String dateExpire = sc.nextLine();
                            LocalDate.parse(dateExpire, dateFormat);
                            boxesA[lenBoxesA].expirationDate = dateExpire;
                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("Fecha agregada");
                            break;
                        } catch (Exception e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                   F O R M A T O   I N V A L I D O");
                        }
                    }

                    lenBoxesA++;
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("    E S T A N T E R I A   D E   C A J A S   T I P O   - A -   L L E N A");
                }
            }
            case "2" -> {

                if (lenBoxesB < 100) {

                    boxesB[lenBoxesB] = new ShelfB();

                    while (true) {

                        String data;
                        System.out.println("----------------------------------------------------------------------------");
                        System.out.print("Ingrese codigo: ");
                        data = sc.nextLine();

                        if (data.length() > 0) {

                            boxesB[lenBoxesB].code = data;
                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("Codigo agregado");
                            break;
                        }
                    }

                    while (true) {

                        float data;
                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese costo: ");
                            data = sc.nextFloat();
                            sc.nextLine();
                            if (data > 0) {

                                boxesB[lenBoxesB].cost = data;
                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("Costo agregado");
                                break;
                            } else {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("              C O S T O   N O   P U E D E   S E R   C E R O");
                            }
                        } catch (Exception e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                 T I P O   D E   D A T O   I N V A L I D O");
                            sc.nextLine();
                        }
                    }

                    LocalDate date = LocalDate.now();
                    LocalTime time = LocalTime.now();
                    boxesB[lenBoxesB].registrationDate = date.format(dateFormat);
                    boxesB[lenBoxesB].registrationTime = time.format(timeFormat);

                    while (true) {

                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese fecha de vencimiento (dd/mm/yyyy): ");
                            String dateExpire = sc.nextLine();
                            LocalDate.parse(dateExpire, dateFormat);
                            boxesB[lenBoxesB].expirationDate = dateExpire;
                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("Fecha agregada");
                            break;
                        } catch (Exception e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                   F O R M A T O   I N V A L I D O");
                        }
                    }

                    lenBoxesB++;
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("    E S T A N T E R I A   D E   C A J A S   T I P O   - B -   L L E N A");
                }
            }
            default -> {

                // Muestra al usuario que ha elegido una opción inválida
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }

    // Mostrar las cajas apiladas
    public static void listBoxes() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                           E S T A N T E R I A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA > 0) {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                       C A J A S   T I P O   - A -");
                    System.out.println("----------------------------------------------------------------------------");

                    for (int i = lenBoxesA - 1; i > -1; i--) {

                        System.out.println("----------------------------");
                        System.out.println("CAJA: " + boxesA[i].code);
                        System.out.println("COSTO: " + boxesA[i].cost);
                        System.out.println("F. INGRESO: " + boxesA[i].registrationDate);
                        System.out.println("H. INGRESO: " + boxesA[i].registrationTime);
                        System.out.println("F. EXP: " + boxesA[i].expirationDate);
                        System.out.println("----------------------------");
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - A -");
                }
            }
            case "2" -> {

                if (lenBoxesB > 0) {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                       C A J A S   T I P O   - B -");
                    System.out.println("----------------------------------------------------------------------------");

                    for (int i = lenBoxesB - 1; i > -1; i--) {

                        System.out.println("----------------------------");
                        System.out.println("CAJA: " + boxesB[i].code);
                        System.out.println("COSTO: " + boxesB[i].cost);
                        System.out.println("F. INGRESO: " + boxesB[i].registrationDate);
                        System.out.println("H. INGRESO: " + boxesB[i].registrationTime);
                        System.out.println("F. EXP: " + boxesB[i].expirationDate);
                        System.out.println("----------------------------");
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - B -");
                }
            }
            default -> {

                // Muestra al usuario que ha elegido una opción inválida
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }

    // Mostrar caja más próxima a expirar
    public static void boxToExpire() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                           E S T A N T E R I A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA > 0) {

                    ShelfA nearest = boxesA[0];
                    LocalDate nearestDate = LocalDate.parse(nearest.expirationDate, dateFormat);

                    for (int i = 1; i < lenBoxesA; i++) {

                        LocalDate current = LocalDate.parse(boxesA[i].expirationDate, dateFormat);
                        if (current.isBefore(nearestDate)) {

                            nearest = boxesA[i];
                            nearestDate = current;
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("       C A J A   M Á S   P R Ó X I M A   A   V E N C E R   ( TIPO A )");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Código: " + nearest.code);
                    System.out.println("Costo: " + nearest.cost);
                    System.out.println("F. Expiración: " + nearest.expirationDate);
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("     N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - A -");
                }
            }

            case "2" -> {

                if (lenBoxesB > 0) {

                    ShelfB nearest = boxesB[0];
                    LocalDate nearestDate = LocalDate.parse(nearest.expirationDate, dateFormat);

                    for (int i = 1; i < lenBoxesB; i++) {

                        LocalDate current = LocalDate.parse(boxesB[i].expirationDate, dateFormat);
                        if (current.isBefore(nearestDate)) {

                            nearest = boxesB[i];
                            nearestDate = current;
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("       C A J A   M Á S   P R Ó X I M A   A   V E N C E R   ( TIPO B )");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Código: " + nearest.code);
                    System.out.println("Costo: " + nearest.cost);
                    System.out.println("F. Expiración: " + nearest.expirationDate);
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("     N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - B -");
                }
            }

            default -> {

                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }

    // Muestras cuantas cajas se ingresaron en un intervalo de tiempo
    public static void intervalBoxes() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                           E S T A N T E R I A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA > 1) {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.print("Ingrese fecha inicio (dd/MM/yyyy): ");
                    String startDateStr = sc.nextLine();
                    System.out.print("Ingrese fecha fin (dd/MM/yyyy): ");
                    String endDateStr = sc.nextLine();

                    try {

                        LocalDate start = LocalDate.parse(startDateStr, dateFormat);
                        LocalDate end = LocalDate.parse(endDateStr, dateFormat);

                        int countA = 0;

                        for (int i = 0; i < lenBoxesA; i++) {

                            LocalDate reg = LocalDate.parse(boxesA[i].registrationDate, dateFormat);
                            if (!reg.isBefore(start) && !reg.isAfter(end)) {

                                countA++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("Cajas Tipo A registradas en el intervalo: " + countA);
                    } catch (Exception e) {

                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("                   F O R M A T O   D E   F E C H A   I N V Á L I D O");
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - A -");
                }
            }
            case "2" -> {

                if (lenBoxesB > 1) {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.print("Ingrese fecha inicio (dd/MM/yyyy): ");
                    String startDateStr = sc.nextLine();
                    System.out.print("Ingrese fecha fin (dd/MM/yyyy): ");
                    String endDateStr = sc.nextLine();

                    try {

                        LocalDate start = LocalDate.parse(startDateStr, dateFormat);
                        LocalDate end = LocalDate.parse(endDateStr, dateFormat);

                        int countB = 0;

                        for (int i = 0; i < lenBoxesB; i++) {

                            LocalDate reg = LocalDate.parse(boxesB[i].registrationDate, dateFormat);
                            if (!reg.isBefore(start) && !reg.isAfter(end)) {

                                countB++;
                            }
                        }

                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("Cajas Tipo B registradas en el intervalo: " + countB);
                    } catch (Exception e) {

                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("                   F O R M A T O   D E   F E C H A   I N V Á L I D O");
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - B -");
                }
            }
            default -> {

                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }

    // Alistar cajas para salir
    public static void prepareBox() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                           E S T A N T E R I A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA > 0) {

                    while (true) {

                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese cantidad de cajas a alistar: ");
                            String inputStr = sc.nextLine();
                            numberPrepare = Integer.parseInt(inputStr);

                            if (numberPrepare > 0 && numberPrepare <= lenBoxesA) {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("Cajas para alistar: " + numberPrepare);
                                break;
                            } else {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("  I N G R E S E   U N A   C A N T I D A D   D E   C A J A S   V A L I D A");
                            }
                        } catch (NumberFormatException e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                 T I P O   D E   D A T O   I N V A L I D O");
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                     C A J A S   A L I S T A D A S");
                    System.out.println("----------------------------------------------------------------------------");

                    int i = 0;

                    while (i < numberPrepare) {

                        System.out.println("----------------------------");
                        System.out.println("CAJA: " + boxesA[lenBoxesA - 1].code);
                        System.out.println("COSTO: " + boxesA[lenBoxesA - 1].cost);
                        System.out.println("F. INGRESO: " + boxesA[lenBoxesA - 1].registrationDate);
                        System.out.println("H. INGRESO: " + boxesA[lenBoxesA - 1].registrationTime);
                        System.out.println("F. EXP: " + boxesA[lenBoxesA - 1].expirationDate);
                        System.out.println("----------------------------");
                        lenBoxesA--;
                        i++;
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - A -");
                }
            }
            case "2" -> {

                if (lenBoxesB > 0) {

                    while (true) {

                        try {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.print("Ingrese cantidad de cajas a alistar: ");
                            String inputStr = sc.nextLine();
                            numberPrepare = Integer.parseInt(inputStr);

                            if (numberPrepare > 0 && numberPrepare <= lenBoxesB) {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("Cajas para alistar: " + numberPrepare);
                                break;
                            } else {

                                System.out.println("----------------------------------------------------------------------------");
                                System.out.println("  I N G R E S E   U N A   C A N T I D A D   D E   C A J A S   V A L I D A");
                            }
                        } catch (NumberFormatException e) {

                            System.out.println("----------------------------------------------------------------------------");
                            System.out.println("                 T I P O   D E   D A T O   I N V A L I D O");
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("                     C A J A S   A L I S T A D A S");
                    System.out.println("----------------------------------------------------------------------------");

                    int i = 0;

                    while (i < numberPrepare) {

                        System.out.println("----------------------------");
                        System.out.println("CAJA: " + boxesB[lenBoxesB - 1].code);
                        System.out.println("COSTO: " + boxesB[lenBoxesB - 1].cost);
                        System.out.println("F. INGRESO: " + boxesB[lenBoxesB - 1].registrationDate);
                        System.out.println("H. INGRESO: " + boxesB[lenBoxesB - 1].registrationTime);
                        System.out.println("F. EXP: " + boxesB[lenBoxesB - 1].expirationDate);
                        System.out.println("----------------------------");
                        lenBoxesB--;
                        i++;
                    }
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("      N O   H A Y   C A J A S   E N   L A   E S T A N T E R I A   - A -");
                }
            }
            default -> {

                // Muestra al usuario que ha elegido una opción inválida
                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }

    // Poner en la cabeza de la pila las cajas próximas a expirar
    public static void boxesToExpireFirst() {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("                           E S T A N T E R I A");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Tipo A                                                         2. Tipo B ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Ingrese opcion: ");
        option = sc.nextLine();

        switch (option) {

            case "1" -> {

                if (lenBoxesA > 1) {

                    for (int i = 0; i < lenBoxesA - 1; i++) {

                        for (int j = 0; j < lenBoxesA - 1 - i; j++) {

                            LocalDate d1 = LocalDate.parse(boxesA[j].expirationDate, dateFormat);
                            LocalDate d2 = LocalDate.parse(boxesA[j + 1].expirationDate, dateFormat);
                            if (d2.isAfter(d1)) {

                                ShelfA temp = boxesA[j];
                                boxesA[j] = boxesA[j + 1];
                                boxesA[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Las cajas tipo A se han ordenado por fecha de expiración");
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" N O   H A Y   S U F I C I E N T E S   C A J A S   P A R A   O R D E N A R");
                }
            }

            case "2" -> {

                if (lenBoxesB > 1) {

                    for (int i = 0; i < lenBoxesB - 1; i++) {

                        for (int j = 0; j < lenBoxesB - 1 - i; j++) {

                            LocalDate d1 = LocalDate.parse(boxesB[j].expirationDate, dateFormat);
                            LocalDate d2 = LocalDate.parse(boxesB[j + 1].expirationDate, dateFormat);
                            if (d1.isAfter(d2)) {

                                ShelfB temp = boxesB[j];
                                boxesB[j] = boxesB[j + 1];
                                boxesB[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Las cajas tipo B se han ordenado por fecha de expiración");
                } else {

                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" N O   H A Y   S U F I C I E N T E S   C A J A S   P A R A   O R D E N A R");
                }
            }

            default -> {

                System.out.println("----------------------------------------------------------------------------");
                System.out.println("                       O P C I O N   I N V A L I D A");
            }
        }
    }
}
