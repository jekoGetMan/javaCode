package Inharitance6;


public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        //UpCast // Производный класс приводим к базовому классу // Расширение к базовому классу.
        BaseClass instanceUp = instance;
        instanceUp.method();

        //DownCast
        DerivedClass instanceDown = (DerivedClass) instanceUp;
        instanceDown.method();
    }
}
