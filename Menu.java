import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("================================");
            System.out.println(" CALCULADORA METABÓLICA BASAL ");
            System.out.println("================================");
            System.out.println("1. Calcular TMB Hombre");
            System.out.println("2. Calcular TMB Mujer");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    calcularHombre(sc);
                    break;

                case 2:
                    calcularMujer(sc);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);

        sc.close();
    }

    // ===== MENÚ HOMBRE =====
    public static void calcularHombre(Scanner sc) {
        System.out.print("Ingrese su peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura (cm): ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        double tmb = 10 * peso + 6.25 * altura - 5 * edad + 5;

        System.out.println("Su TMB es: " + tmb + " kcal/día");
    }

    // ===== MENÚ MUJER =====
    public static void calcularMujer(Scanner sc) {
        System.out.print("Ingrese su peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Ingrese su altura (cm): ");
        double altura = sc.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        double tmb = 10 * peso + 6.25 * altura - 5 * edad - 161;

        System.out.println("Su TMB es: " + tmb + " kcal/día");
    }
}
