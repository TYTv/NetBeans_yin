/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class List2 {

    public List2() {

        ArrayList al = new ArrayList();
        al.add("Java");
        al.add("C++");
        al.add("Swift");
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.get(0));
        System.out.println(al.contains("Java"));
        System.out.println(al.contains("C++"));
        System.out.println("SIZE:" + al.size());
        al.add("Java");
        System.out.println(al);
        System.out.println("SIZE:" + al.size());

        Object[] o = {100, 3.14, "Java", 90};

        ArrayList<String> als = new ArrayList<>();
        als.add("a");
        System.out.println(als);
        
    }

}
