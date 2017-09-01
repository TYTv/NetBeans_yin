/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07;

import pkg05.R;

class pp implements Button.ifPush {   // 介面實作

    public void goClick() {     // 抽象方法實作
        System.out.println("Hello !!!!!");
    }
}

class gg implements Button.ifPush {   // 介面實作

    public void goClick() {     // 抽象方法實作
        System.out.println("GG say hello !!!!!");
    }
}

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

        Button b = new Button(R.id.button, "OK", 3, 4);
        Button.ifPush p = new pp();
        b.onClick(p);
        b.onClick(new gg());
    }

}
