/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayOfObjects;

import java.io.FileNotFoundException;

/**
 *
 * @author Karinak
 */
public class FriendArrayUI {
    
    public static void main(String[] args) throws FileNotFoundException {
         FriendArray groupA = new FriendArray();
         groupA.sort();
         System.out.println(groupA.search("Ryan")) ; 
         String output = groupA.toString();
         System.out.println(output);
    
    }
  
}
