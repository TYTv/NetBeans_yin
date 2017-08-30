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
public class TextView extends View {

    private String text;

    public TextView(String text, int w, int h) {
        super(w, h);
        this.text = text;
    }

    @Override
    public void onDraw() {
        System.out.println("text:" + text);
        super.onDraw(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getText() {
        return text;
    }
    
    
    public void setText(String s) {
       this.text = s;
    }
    
}
