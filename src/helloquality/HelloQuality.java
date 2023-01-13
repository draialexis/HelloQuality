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
    
    private final static int NOT_A_MAGIC_NUMBER = 100000;
    
    private static List<Integer> myList = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        while(true) {
            try  {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                
            }
            System.out.println("Iteration: " + i);
            exo2();
            i++;
        }
    }
    
    private static void exo1() {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < NOT_A_MAGIC_NUMBER; i++) {
            list.add(i);            
        }
    }
    
    private static void exo2() {
        for(int i = 0; i < NOT_A_MAGIC_NUMBER; i++) {
            myList.add(i);            
        }
    }
    
}
