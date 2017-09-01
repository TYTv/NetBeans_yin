/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07;

import pkg03.TextView;

/**
 *
 * @author student
 */
public class Button extends TextView {

    public interface ifPush {   // 介面

        public abstract void goClick();     // 抽象方法
    }

    public Button(int id, String text, int w, int h) {
        super(id, text, w, h);
    }

    public void onClick(ifPush x) {
        System.out.println("按了 " + getText() + " Button !");
        x.goClick();
    }

}
