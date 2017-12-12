/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szyfrowanie;

/**
 *
 * @author User
 */
public class Szyfrowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String in = "ABC";
        Alphabet alphabet = new Alphabet(Alphabet.ALPHA_UP_SPACE);
        Cypher cypher = new Cypher(alphabet);
        
        System.out.println(cypher.encrypt(in));
            
    }
    
    
}
