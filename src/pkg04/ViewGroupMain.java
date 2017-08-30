/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04;

import pkg03.ImageView;
import pkg03.View;
import pkg03.TextView;
import pkg03.ImageView;
import pkg03.Button;

/**
 *
 * @author student
 */
public class ViewGroupMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ViewGroup vg = new ViewGroup(20, 30);

        vg.addView(new View(3, 2));
        vg.addView(new ImageView("鳴人", 10, 5));
        vg.addView(new TextView("Hello", 10, 5));
        vg.addView(new Button("OK", 10, 5));
        vg.drawAll();

        System.out.println("---------------------------");

        TextView tv = (TextView) vg.getView(2);
        tv.setText("Hi");
        tv.onDraw();
        
        System.out.println("----------Draw All----------");
        vg.drawAll();

    }

}
