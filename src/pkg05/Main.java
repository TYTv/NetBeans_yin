/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05;

import pkg03.Button;
import pkg03.ImageView;
import pkg03.TextView;
import pkg03.View;
import pkg04.ViewGroup;

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

        ViewGroup vg = new ViewGroup(0, 20, 30);
        vg.addView(new View(R.view, 3, 2));
        vg.addView(new ImageView(R.imageview, "鳴人", 10, 5));
        vg.addView(new TextView(R.textview, "Hello", 10, 5));
        vg.addView(new Button(R.button, "OK", 10, 5));
        vg.drawAll();

        System.out.println("---------------------------");
        TextView tv = (TextView) vg.getView(2);
        tv.setText("Hi");
        tv.onDraw();

        System.out.println("----------Draw All----------");
        vg.drawAll();

        System.out.println("-------find view by id------");
        Button b = (Button) vg.findViewById(R.button);
        b.setText("Okay");
        vg.drawAll();

    }

}
