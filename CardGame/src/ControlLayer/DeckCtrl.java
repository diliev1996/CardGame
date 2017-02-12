package ControlLayer;

import java.util.ArrayList;
import modelLayer.Card;
import modelLayer.Deck;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viva
 */
public class DeckCtrl {
    private Deck deck;
    
    public DeckCtrl(){
        deck = new Deck();
        deck.shuffle();
    }
    
    public String compare(){
       return deck.takeTopCard().toString();
    }
       
    
    public boolean compareSuit(Card card){
        if(deck.takeTopCard().getSuitStrength() < card.getSuitStrength()){
            return true;
        }else{
            return false;
        }
    }
}
