public class CardMain{
    public static void main(String[] args) {
        Card c1 = new Card(10, 3);
        Card c2 = new Card(3, 2);
        boolean c1Bigger = c1.outranks(c2);
        System.out.println(c1Bigger);
        
        
    }

}