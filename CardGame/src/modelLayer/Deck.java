package modelLayer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    
    private ArrayList<Card> cards;
    private ArrayDeque<Card> ar ;
    
    public Deck(){
      createDeck();
      shuffle();
      ar = new ArrayDeque(cards);
    }
    
    private void createDeck(){
        cards = new ArrayList<>();
        for (Card.SUIT suiT : Card.getSUITs()) {
            for (int value = 2; value <=14; value++) {
                Card card = new Card(suiT, value);
                cards.add(card);
            }
        }
    }
    
    public void shuffle(){
       Collections.shuffle(cards);
    }
    
       public Card takeTopCard(){
           return ar.poll();
    }
    
    
    public int getCardSuitStrength(Card card){
      return card.getSuit().getStrength();
    }
    
    public int getCardStrength(Card card){
        return card.getValue();
    }
    
    public int getDeckSize(){
        return cards.size();
    }
    
    public static void main(String [ ] args){
       Deck d = new Deck();
       d.getDeckSize();
    }
   
}