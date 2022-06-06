package br.com.unis;

import javax.swing.*;

public class Calcula_IMC {
    public static void main(String[] args) {

        float peso,altura;
        String a,b;

        a = JOptionPane.showInputDialog("Informe o peso em Quilogramas:");
        b = JOptionPane.showInputDialog("informe a altura em Metros:");
        peso = Float.parseFloat(a);
        altura = Float.parseFloat(b);
        float imc = (peso / (altura * altura));

        JOptionPane.showMessageDialog(null, "O valor do imc e: "+ imc);

        if (imc <= 17){
            JOptionPane.showMessageDialog(null,"MUITO ABAIXO DO PESO!");
        } else if ((imc >17 )&&(imc <=18.49)) {
            JOptionPane.showMessageDialog(null,"ABAIXO DO PESO!");
        } else if ((imc >18.49)&&(imc <=24.99)) {
            JOptionPane.showMessageDialog(null,"PESO NORMAL!");
        } else if ((imc >24.99)&&(imc <=29.99)) {
            JOptionPane.showMessageDialog(null,"ACIMA DO PESO!");
        } else if ((imc >29.99)&&(imc <=34.99)) {
            JOptionPane.showMessageDialog(null,"OBESIDADE!");
        } else if ((imc >34.99)&&(imc <=39.99)) {
            JOptionPane.showMessageDialog(null,"OBESIDADE SEVERA!");
        }else if (imc >39.99){
            JOptionPane.showMessageDialog(null,"OBESIDADE MORBIDA!");
        }
    }
}
