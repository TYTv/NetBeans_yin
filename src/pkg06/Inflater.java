/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import pkg03.View;
import pkg03.ImageView;
import pkg03.TextView;
import pkg03.Button;
import pkg04.ViewGroup;

/**
 *
 * @author student
 */
public class Inflater {     // 填充

    public /*static*/ ViewGroup File2Viewgroup(String filename) {

        String c = null;
        String n = null;
        int w = 0;
        int h = 0;

        int id = 0;
        ViewGroup vg = new ViewGroup(id, 0, 0);     // 透過建構子創建空的ArrayList

        File f = new File(filename);
        try (Scanner sc = new Scanner(f);) {    // 新版本自動關檔案寫法，免用finally

            sc.useDelimiter("[,\\s]+");     // 正規表達式(regex) [字元範圍 ,字元 \\s空白TAB換行等字元 ] +出現一次以上

            while (sc.hasNext()) {

                c = sc.next();
                switch (c) {       // Get name
//                    case "R.id.viewgroup":
                    case "R.id.view":
                        break;
                    case "R.id.imageview":
                    case "R.id.textview":
                    case "R.id.button":
                        n = sc.next();
                        break;
                    default:
                        System.out.print(c);
                        c = null;
                        break;
                }
                if (c == null) {
                    System.out.println( " <-- No found class!");
                    break;
                }

                w = sc.nextInt();
                h = sc.nextInt();

                switch (c) {       // Creat View class and add to ViewGroup
                    case "R.id.view":
                        vg.addView(new View(id++, w, h));
                        break;
                    case "R.id.imageview":
                        vg.addView(new ImageView(id++, n, w, h));
                        break;
                    case "R.id.textview":
                        vg.addView(new TextView(id++, n, w, h));
                        break;
                    case "R.id.button":
                        vg.addView(new Button(id++, n, w, h));
                        break;
                    default:
                        break;
                }

            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (InputMismatchException e) {
            System.err.println(e);
        }

        return vg;

    }

}
