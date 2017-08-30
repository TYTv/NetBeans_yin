/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04;

import java.util.ArrayList;
import pkg03.View;

/**
 *
 * @author student
 */
public class ViewGroup extends View {

    private ArrayList<View> v;

    public ViewGroup(int w, int h) {
        super(w, h);

        v = new ArrayList<>();
    }

    public void addView(View vg) {
        v.add(vg);
    }

    public void drawAll(){
        for (View i : v) {
            i.onDraw();
        }
    }

    public View getView(int i) {
        return this.v.get(i);
    }

    
}
