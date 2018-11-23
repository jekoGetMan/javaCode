package Inharitance3;

public class Main {
    public static void main(String[] args){

    DerivedClass instance = new DerivedClass();
        System.out.println(instance.tst1);
        System.out.println(instance.tst3);
        instance.show(); // Т.е. через публичный метод можно достучаться к приватному полю.
//        System.out.println(instance.tst2); // Не можем из-за private.
    }
}
