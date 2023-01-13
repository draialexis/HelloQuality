/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloquality;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aldrai
 */
public class HelloQuality {

    private final static int HUNDRED_THOU = 100000;   
    private final static int HUNDRED = 100;


    private static List<Object> myList = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            System.out.println("Iteration: " + i);
            exo2();
            i++;
        }
    }

    private static void exo1() {
        List<Object> list = new ArrayList();
        for (int i = 0; i < HUNDRED_THOU; i++) {
            list.add(new Object());
        }
    }

    private static void exo2() {
        for (int i = 0; i < HUNDRED_THOU; i++) {
            myList.add(new Object());
        }
    }

    private static void exo3() {
        for (int i = 0; i < HUNDRED_THOU; i++) {
            myList.add(new Object());
        }
        for (int i = 0; i < HUNDRED; i++) {
            myList.remove(0);
        }
    }

}
