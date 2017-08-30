/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class List3 {

    public List3() {

        ArrayList<Integer> ali = new ArrayList<>();
        for (int i = 1; i < 42; i++) {
            ali.add(i);
        }
        System.out.println(ali);

        for (int i = 0; i < ali.size(); i++) {
            System.out.println("No." + i + " : " + ali.get(i));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Remove No.? ->");
        int i = sc.nextInt();

        System.out.println("Remove No." + i + " finish! (" + ali.remove(i) + ")");
        System.out.println(ali);
        System.out.println("SIZE : " + ali.size());

    }

}
