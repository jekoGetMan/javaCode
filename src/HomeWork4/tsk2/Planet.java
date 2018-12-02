package HomeWork4.tsk2;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private String name;

    // Создали Listu через соответсвующих классах(Ocean/Continent/Island) через объект ArrayList
    private List<Ocean> oceanList = new ArrayList<>();
    private List<Continent> continentList = new ArrayList<>();
    private List<Island> islandList = new ArrayList<>();

    public Planet(String name) {
        this.name = name;
    }

    public void addOcean(Ocean ocean) {
        oceanList.add(ocean);
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public void addIsland(Island island) {
        islandList.add(island);
    }

    public String getName() {
        return name;
    }

    public List<Ocean> getOceanList() {
        return oceanList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public List<Island> getIslandList() {
        return islandList;
    }
}

