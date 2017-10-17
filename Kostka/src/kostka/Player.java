/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka;

import java.util.Random;

        
public class Player {

Player(){
    name = "Unknown";
}
    
Player(String name){
this.name = name;
}
Random dice = new Random();
private String name;
    
public int guess(){
    return dice.nextInt(6)+1;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}
}

