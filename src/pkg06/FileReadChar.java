/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author student
 */
public class FileReadChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        FileReader r = null;
        try {

            String f = "activity.txt";
            r = new FileReader(f);
            System.out.println("Open file " + f);

            char c = (char) r.read();
            System.out.println("READ CHAR : " + c);

        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (IOException e) {
            System.err.println("I/O exception!");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (r != null) {
                try {
                    r.close();
                } catch (IOException e) {
                    System.err.println(e);
                }
            }
        }

    }

}
