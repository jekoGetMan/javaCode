package Bird;

public class Penguin extends Bird{
    //Если у нас основной метод(в данном случае Bird) содержит модификатор доступа public, то его наследники должны объявлены быть с таким
    //модификатором доступа не уже чем родитель. Т.е. не package (по умолчанию), но тоже паблик.
    @Override
    public void move(){
        System.out.println("I can run and fly");
    }
}
