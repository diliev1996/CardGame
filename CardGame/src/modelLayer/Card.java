/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

/**
 *
 * @author viva
 */
public class Card {
    private SUIT suit;
    private int value;
    
    public Card(SUIT suit,int value){
        this.suit = suit;
        this.value = value;
    }
    
    public Card(){
    }

    public SUIT getSuit() {
        return suit;
    }
    
    public int getSuitStrength(){
        return suit.getStrength();
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    public static SUIT[] getSUITs(){
       return SUIT.values();
    }

    @Override
    public String toString() {
        return  "" + suit +""+ value;
    }
    
public enum SUIT{
    CLUBS(1),SPADES(4),HEARTS(3),DIAMONDS(2);
    SUIT(int strength){
        this.strength = strength;
    }
    private final int strength;
    
    int getStrength(){
        return strength;
    }
}

}