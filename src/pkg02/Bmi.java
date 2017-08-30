/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class Bmi {

    public static float cal(float cm, float kg) {
        return kg / ((cm / 100) * (cm / 100));
    }

    public static String cal(String cm, String kg) {
        float cmFloat = Float.parseFloat(cm);
        float kgFloat = Float.parseFloat(kg);

        return String.valueOf(cal(cmFloat, kgFloat));
    }

    public static String eva(float bmi) {
        if (bmi < 18.75) {
            return "體重過輕";
        } else if (bmi < 24) {
            return "正常範圍";
        } else if (bmi < 27) {
            return "輕度肥胖";
        } else if (bmi < 35) {
            return "中度肥胖";
        } else {
            return "重度肥胖";
        }
    }

    public static String eva(String bmi) {
        return eva(Float.parseFloat(bmi));
    }
}
