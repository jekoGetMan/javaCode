package HomeWork4.tsk2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Создали объекты для вызова по ссылке
        Island island = new Island("Hawaii");
        Planet planet = new Planet("Venus");

        //Добавили новый остров
        planet.newIsland(new Island("Capri island"));

        //Добавили новые океаны в конструктор класса Ocean
        planet.newOcean(new Ocean("Arctic Ocean"));
        planet.newOcean(new Ocean("Indian Ocean"));

        //Добавили новые континенты в конструктор класса Сontinent
        planet.newContinent(new Continent("Australia"));
        planet.newContinent(new Continent("North America"));


        System.out.println("The planet name is:\t" + planet.getName());
        System.out.println("The continent name is:\t" + displayFirstContinentName(planet.getContinentList()));
        System.out.println("Amount of the continents is:\t" + planet.getContinentList().size());
    }

    public static String displayFirstContinentName(List<Continent> continentList) {
        String continentName = null;
        for (Continent continent: continentList) {
            continentName = continent.getName();
        }

        return continentName;
    }

}

