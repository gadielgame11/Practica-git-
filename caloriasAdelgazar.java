import javax.swing.JOptionPane;

public class caloriasAdelgazar{

    public static float calcular_IMC(float peso, float altura) {
        return peso / (altura * altura);
    }

    public static float calcular_porcentaje_grasa(float peso, float altura, int edad, float valor_genero) {
        float imc = calcular_IMC(peso, altura);
        return (1.2f * imc) + (0.23f * edad) - (10.8f * valor_genero) - 5.4f;
    }

    public static float calcular_calorias_en_reposo(float peso, float altura, int edad, float valor_genero) {
        float altura_cm = altura * 100f;
        return (10f * peso) + (6.25f * altura_cm) - (5f * edad) + valor_genero;
    }

    public static void main(String[] args) {

        String sPeso = JOptionPane.showInputDialog("Ingrese peso en kg:");
        float peso = Float.parseFloat(sPeso);

        String sAltura = JOptionPane.showInputDialog("Ingrese altura en metros (ej: 1.75):");
        float altura = Float.parseFloat(sAltura);

        String sEdad = JOptionPane.showInputDialog("Ingrese edad:");
        int edad = Integer.parseInt(sEdad);

        String generoTxt = JOptionPane.showInputDialog("Género (H = hombre, M = mujer):");
        char genero = generoTxt.toUpperCase().charAt(0);

        float valorGeneroGrasa;
        float valorGeneroTMB;

  
    }
}