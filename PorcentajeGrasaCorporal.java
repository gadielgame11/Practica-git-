/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.porcentajegrasacorporal;

import javax.swing.JOptionPane;

/**
 *
 * @author saida
 */
public class PorcentajeGrasaCorporal {

    public static void main(String[] args) {

        // Variables
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        double IMC = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su IMC:"));
        int genero = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu género?\n1. Femenino\n2. Masculino"));
        double valor_genero;
        double IGC;

        // Género
        if (genero == 2) {
            valor_genero = 10.8;
        } else {
            valor_genero = 0;
        }

        // Formula
        IGC = 1.2 * IMC + 0.23 * edad - 5.4 - valor_genero;

        JOptionPane.showMessageDialog(null, "El porcentaje de grasa corporal es: " + IGC + "%");
    }
}
