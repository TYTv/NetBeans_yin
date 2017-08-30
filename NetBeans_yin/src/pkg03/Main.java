/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03;

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
/*
        View v1 = new View(5,10);
        View v2 = new View(12,6);
        v1.onDraw();
        v2.onDraw();
         */
 /*
        ImageView im = new ImageView("SuperMan", 4, 8);
        im.onDraw();
*/
        
        TextView tv = new TextView("Andy", 10, 5);
        tv.onDraw();
        
        Button bt = new Button("Jason", 19, 2);
        bt.onDraw();
        System.out.println("");
        bt.onClick();
 
 
 
 
    }

}
