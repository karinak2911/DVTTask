/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

/**
 *
 * @author Karinak
 */
public class LearnerArrayUI {
    public static void main(String[] args) {
        LearnerArray math = new LearnerArray();
    
        System.out.println(math.getBestmark()); 
        math.sort();
        System.out.println( math.toString()); 
        System.out.println(math.search("Ryan")); 
    }
    
}
