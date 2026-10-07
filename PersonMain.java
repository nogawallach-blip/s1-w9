public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person(50);
        Person p1 = new Person(70);


        boolean b = p.equals(p1);
        System.out.println(b);

        System.out.println(p.equals(p1));
    }
}
