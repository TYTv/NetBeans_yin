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
public class ImageView extends View {
String name;

    public ImageView(String imString, int w, int h) {
        super(w, h);
        this.name = imString;
        
        
    }

    @Override
    public void onDraw() {
        System.out.println(name);
        super.onDraw(); //To change body of generated methods, choose Tools | Templates.
    }

}
