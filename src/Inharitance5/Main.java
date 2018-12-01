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
        BaseClass newInstance = (BaseClass) instance; // UpCast из-за instance, т.к. instance это ссылка на DerivedClass. Расширяем производный класс к базовому классу.

        System.out.println(newInstance.field1);
        System.out.println(newInstance.field2);
        System.out.println(newInstance.field3);

        //Но мы не можем вывести field4 и field5 по новой ссылке newInstance т.к. мы привели DerivedClass к базовому, а field4 и field5 находились в производном.
        //Т.е. мы сокрыли реализацию, ограничили наш класс
//        newInstance.field4
//        newInstance.field5

        //Хэшкод одинаковый, а значит и ссылки одинаковые тоже
        System.out.println("instance Id:  " + instance.hashCode());
        System.out.println("newInstance Id:  " + newInstance.hashCode());
    }
}
