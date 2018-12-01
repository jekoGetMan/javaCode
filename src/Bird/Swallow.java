package Bird;

public class Swallow extends Bird {
    @Override // переопределение базового класса, метод Override
    public void move(){
        System.out.println("I can fly");
    }
}
