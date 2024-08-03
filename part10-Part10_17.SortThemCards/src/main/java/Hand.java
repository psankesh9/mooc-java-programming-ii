import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand other) {
        return this.cards.stream().mapToInt(Card::getValue).sum() - 
               other.cards.stream().mapToInt(Card::getValue).sum();
    }

    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

    public static void main(String[] args) {
        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();
        hand.print();
    }
}

    

