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
public class Button extends TextView {

    public Button(String text, int w, int h) {
        super(text, w, h);
    }

    public void onClick() {
        System.out.println("按了 " + getText() + " Button");
    }

}
