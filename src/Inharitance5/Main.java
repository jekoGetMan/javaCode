package Inharitance5;

public class Main {
    public static void main(String[] args){
        DerivedClass instance = new DerivedClass();

        instance.field1 = 1;
        instance.field2 = 2;
        instance.field3 = 3;

        instance.field4 = 4;
        instance.field5 = 5;

        //Приведение экземпляра класса DeriveClass к базовому BaseClass.
        BaseClass newInstance = (BaseClass) instance; // UpCast из-за instance, т.к. instance это ссылка на DerivedClass.
    }
}
