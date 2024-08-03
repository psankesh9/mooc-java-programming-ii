public class Card implements Comparable<Card> {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card other) {
        if (this.value != other.value) {
            return this.value - other.value;
        } else {
            return this.suit.ordinal() - other.suit.ordinal();
        }
    }

    @Override
    public String toString() {
        return this.suit + " " + this.value;
    }

    public static void main(String[] args) {
        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}