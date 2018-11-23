package Inharitance3;

public class BaseClass {
    public String tst1 = "BaseClass.tst1";
    private String tst2 = "BaseClass.tst2";
    protected String tst3 = "BaseClass.tst3";

    // Метод. Т.к. private доступен только в пределах класса, то мы и вывели его в пределах классах, а потом обратились из Main.
    // Т.е. через публичный метод можно достучаться к приватном полю
    public void show(){
        System.out.println(tst2);
    }
}
