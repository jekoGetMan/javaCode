package animal;

public class Main {
    public static void main(String args){
        Cat c = new Cat(5, "usual", 5, "Marsel" );
        Cat c1 = new Cat(10, "sphynx", 10, "Barsiuk");

        System.out.println("first:\t" + c.getWeight() + c.getBrade() + c.age + c.name);
        System.out.println("second:\t" + c1.getWeight() + c1.getBrade() + c1.age + c1.name);

    }
}
