public class Prototype {
    public static void main(String[] args) {
        People person1 = new Male("First", 20);
        People person2 = new Female("Sanny", 16);
        People person3 = person1.clone();
        People person4 = person2.clone();

        System.out.println(person1);
        System.out.println(person3);
        System.out.println(person1 == person3);

        System.out.println(person2);
        System.out.println(person4);
        System.out.println(person2 == person4);
    }
}