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
public class Alphabet {
    String charset;
    
    public static final String ALPHA_UP_SPACE = "ABCDEFGHIJKLMNOPRSTUWXYZ ";
    public static final String DIGITS = "123456789";
    public static final String ALPHANUMERIC_UP_SPACE = ALPHA_UP_SPACE + DIGITS;
    
    public Alphabet(String charset){
        this.charset = charset;
    }
    public boolean isTextValid(String text){
        return text.matches("^[" + charset + "]+$");
    }
    public String getCharset(){
        return charset;
    }
    public int indexOf(int ch){
        return charset.indexOf(ch);
    }
    public int length(){
        return charset.length();
    }
    public char charAt(int i){
        return charset.charAt(i);
    }
}
