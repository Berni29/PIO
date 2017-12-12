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
public class Cypher {
    
    private int key = 1;
    private Alphabet alphabet;
    
    public Cypher(Alphabet alphabet){
        this.alphabet = alphabet;
    }
    
    public String encrypt(String in){
        if(!alphabet.isTextValid(in))
            throw new IllegalArgumentException("Tekst zawiera znaki spoza alfabetu");
        StringBuilder out = new StringBuilder();
        for(int i=0; i<in.length(); i++)
        {
            int ch = in.charAt(i);
            int idx = alphabet.indexOf(ch);
            idx = (idx + key)%alphabet.length();
            ch = alphabet.charAt(idx);
            out.append((char)ch);
        }
        return out.toString();
    }
    public void setKey(int key){
        this.key = key;
    }
    
    public void setAlphabet(String alphabet){
        this.alphabet = new Alphabet(alphabet);
    }
    
    
}
