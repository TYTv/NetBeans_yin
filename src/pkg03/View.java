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
public class View {

    private final int id;
    private int w;
    private int h;

    public View(int w, int h) {

        if (w < 0 || h < 0) {
            throw new RuntimeException("寬高不能 < 0");
        }

        this.id = -1;
        this.w = w;
        this.h = h;
    }

    public View(int id, int w, int h) {

        if (w < 0 || h < 0) {
            throw new RuntimeException("寬高不能 < 0");
        }
        this.id = id;
        this.w = w;
        this.h = h;
    }

    View() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void onDraw() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public int getId() {
        return id;
    }

}
