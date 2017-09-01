/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06;

import pkg04.ViewGroup;
import pkg05.R;

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

        ViewGroup vg = new Inflater().File2Viewgroup("activity.txt");
        vg.drawAll();

    }
    
}
