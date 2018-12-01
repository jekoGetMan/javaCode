package Bird;

public class Main {

    public static void main(String[] args) {

        //Сделаем UpCast т.е. создадим объект страуса(экземпляр класса страус)я через родителя
        Bird s = new Strauss(); // Выполнили upCast т.е. расширение типа т.е. страуса к птице.
        Bird p = new Penguin(); // ПОЛИМОРФНАЯ ССЫЛКА (через родителя создаем объект(экземпляр класса)дочернего класса)
        //Создадим массив птиц
        Bird[] arr = {s, p};

        for (Bird tmp : arr) {
            tmp.move();
        }
    }
}
