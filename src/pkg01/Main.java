/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01;

import pkg02.Bmi;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String cmString = JOptionPane.showInputDialog("請輸入身高(cm)");
        String kgString = JOptionPane.showInputDialog("請輸入體重(kg)");

        
        String bmiString = Bmi.cal(cmString, kgString);
        bmiString = "BMI = " + bmiString + " < " + Bmi.eva(bmiString) + " > ";

        JOptionPane.showMessageDialog(null, bmiString);

    }

}
