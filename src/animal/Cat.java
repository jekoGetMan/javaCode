package animal;

public class Cat extends Animal{
    int age;
    String name;

    public Cat(int weight, String brade, int age, String name){
        super(weight, brade);
        this.age = age;
        this.name = name;
    }
}
