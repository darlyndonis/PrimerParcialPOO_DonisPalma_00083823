import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    Scanner sn = new Scanner(System.in);
    ArrayList<EquiposElectronicos> equipos = new ArrayList();

    public static void main(String[] args) {
        MenuPrincipal();
    }

    public static void MenuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int option = 0;

        do {
            try {
                System.out.println("-----SISTEMA DE INVENTARIO------");
                System.out.println("Elija una opción: ");
                System.out.println("1. Agregar. ");
                System.out.println("2. Modificar.");
                System.out.println("3. Consultar listado de todos los articulos. ");
                System.out.println("2. Modificar.");

                option = sn.nextInt();
                sn.nextLine();

                if (option == 0) {
                    System.out.println("Saliendo del sistema...");
                }

                switch (option) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Ingrese una ópcion válida");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Ingrese una ópcion válida");
            }

        } while (option != 0);
    }




}