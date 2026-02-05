
import java.util.Scanner;

public class CalculadoraSalud {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA DE SALUD ===");

        System.out.print("Peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo (1 = Hombre, 0 = Mujer): ");
        int sexo = sc.nextInt();

        System.out.print("Nivel de actividad (1-5):\n");
        System.out.println("1. Sedentario");
        System.out.println("2. Ligero");
        System.out.println("3. Moderado");
        System.out.println("4. Intenso");
        System.out.println("5. Muy intenso");
        int actividad = sc.nextInt();

        double imc = calcularIMC(peso, altura);
        double grasa = calcularGrasaCorporal(imc, edad, sexo);
        double mb = calcularMB(peso, altura, edad, sexo);
        double calorias = calcularCaloriasDiarias(mb, actividad);
        double caloriasAdelgazar = calorias - 500;

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("IMC: %.2f\n", imc);
        System.out.printf("%% Grasa corporal: %.2f%%\n", grasa);
        System.out.printf("Metabolismo Basal: %.2f kcal\n", mb);
        System.out.printf("Calorías de mantenimiento: %.2f kcal\n", calorias);
        System.out.printf("Calorías para adelgazar: %.2f kcal\n", caloriasAdelgazar);

        sc.close();
    }

    