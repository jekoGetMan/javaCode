package test;
// Порядок выполнения программы при наследовании
public class Main {
    Main(){ // 4
        System.out.println("Main");
    }

    public static void main(String[] args) {
        Cc c = new Cc(); // При создании объекта нам нужно вначале вызвать конструктор Cc. Потом произошол вызов всех конструкторов по цепочке.
// Потом Выводим на экран сначала "Main", потом "Aa" и т.д.
    }
}

class Aa extends Main{
    Aa(){ // 3
        System.out.println("Aa");
    }
}

class Bb extends Aa{
    Bb(){ //2
        System.out.println("Bb");
    }
}

class Cc extends Bb{
    Cc(){ //1
        System.out.println("Cc");
    }
}