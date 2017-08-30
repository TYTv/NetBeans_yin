/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03;

import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class ViewFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ViewFactory vf = new ViewFactory();
        int MENU;
        while ((MENU = vf.menu()) != 0) {
            View v = vf.createView(MENU);
            v.onDraw();
            if (v instanceof TextView) {
                System.out.println("GETTEXT:" + ((TextView) v).getText());
            }
            if (v instanceof Button) {
                ((Button) v).onClick();
            }
        }

    }

    public int menu() {
        String str
                = "0.EXIT\n"
                + "  ^^^^\n"
                + "1.View\n"
                + "2.ImageView\n"
                + "3.TextView\n"
                + "4.Button";
        int sel = Integer.parseInt(JOptionPane.showInputDialog(str));
        if (sel < 0 || sel > 4) {
            throw new RuntimeException("請輸入 0 ~ 4 !!");
        }
        return sel;
    }

    public View createView(int sel) {

        int w = Integer.parseInt(JOptionPane.showInputDialog("請輸入寬"));
        int h = Integer.parseInt(JOptionPane.showInputDialog("請輸入高"));

        String s;
        switch (sel) {
            default:
                break;
            case 1:
                return (new View(w, h));
            case 2:
                s = JOptionPane.showInputDialog("請輸入Image名稱");
                return (new ImageView(s, w, h));
            case 3:
                s = JOptionPane.showInputDialog("請輸入Text名稱");
                return (new TextView(s, w, h));
            case 4:
                s = JOptionPane.showInputDialog("請輸入Button名稱");
                return (new Button(s, w, h));
        }
        return (null);

    }
}
