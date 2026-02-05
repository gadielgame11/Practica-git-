

public class CalcularIndicesCorporales {
    public static double calcular_IMC(double pesoKg, double alturaMetros) {
        return pesoKg / (alturaMetros * alturaMetros);
    }

    public static double calcular_porcentaje_grasa(double imc, int edad, boolean esMasculino) {
        double valorGenero = esMasculino ? 10.8 : 0;
        return (1.2 * imc) + (0.23 * edad) - 5.4 - valorGenero;
    }


    public static double calcular_calorias_en_reposo(double pesoKg, double alturaCm, int edad, boolean esMasculino) {
        double valorGenero = esMasculino ? 5 : -161;
        return (10 * pesoKg) + (6.25 * alturaCm) - (5 * edad) + valorGenero;
    }

    public static double calcular_calorias_en_actividad(double tmb, double valorActividad) {
        return tmb * valorActividad;
    }

    public static double[] consumo_recomendado_para_adelgazar(double tmbActividad) {
        double minimo = tmbActividad * 0.80;
        double maximo = tmbActividad * 0.85;
        return new double[]{minimo, maximo};
    }
} 
