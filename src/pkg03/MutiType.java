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
public class MutiType {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        View v = new View(3, 2);
        ImageView iv = new ImageView("鳴人", 10, 5);
        TextView tv = new TextView("Hello", 10, 5);
        Button b = new Button("OK", 10, 5);

        View[] vvvv = {v, iv, tv, b};
        for (View vv : vvvv) {
            vv.onDraw();
            if (vv instanceof Button) {
                ((Button) vv).onClick();
            }
            System.out.println("");
        }

    }

}
