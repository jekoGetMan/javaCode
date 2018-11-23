package Inharitance2;

    public class Main{
        //Создаем точку доступа
        // Базовый класс - Производный класс; Родительский класс - Дочерний класс; Родитель - потомок;
        public static void main(String[] args){
            DerivedClass instance = new DerivedClass();
            System.out.println(instance.publicField);
            System.out.println(instance.protectedField);// к переменной с модификатором доступа protected можно обратиться в рамках одного класс, а также в классах наследниках.
            //System.out.println(instance.privateField); // Только в пределах одного класса.
        }
    }