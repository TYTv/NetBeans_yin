/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class FileScanReadStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        String id = null;
        String n = null;
        int w = 0;
        int h = 0;

        try {

            File f = new File("activity.txt");
            Scanner sc = new Scanner(f);

//            sc.useDelimiter(",");
            sc.useDelimiter("[,\\s]+");     // 正規表達式(regex) [字元範圍 ,字元 \\s空白TAB換行等字元 ] +出現一次以上

            while (sc.hasNext()) {

                id = sc.next();
                System.out.println(id);
                switch (id) {       // Get name
                    case "R.id.viewgroup":
                    case "R.id.view":
                        break;
                    case "R.id.imageview":
                    case "R.id.textview":
                    case "R.id.button":
                        n = sc.next();
                        System.out.println(n);
                        break;
                    default:
                        id = null;
                        break;
                }
                if (id == null) {
                    System.out.println("^^^^^^^^^^^^^^^ No this class!");
                    break;
                }

                w = sc.nextInt();
                System.out.println(w);
                h = sc.nextInt();
                System.out.println(h);
                System.out.println("-----------------------------");

            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (InputMismatchException e) {
            System.err.println(e);
        }

    }

}
