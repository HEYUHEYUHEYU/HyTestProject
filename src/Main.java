import Animal.Cat;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        Cat cat = new Cat();
        cat.setName("CafeCat");
        cat.setAge(2);
        cat.setColor("brown");
        System.out.println(cat.toString());
    }
}
