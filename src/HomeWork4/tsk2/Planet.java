package HomeWork4.tsk2;

//Импортим, чтобы использовать наши списки
import java.util.ArrayList;
import java.util.List;

public class Planet {
    private String name;

    // Создали Listы через соответсвующие классах(Ocean/Continent/Island) через объект ArrayList
    private ArrayList<Ocean> linkListOcean = new ArrayList<>();
    private ArrayList<Continent> linkListContinent = new ArrayList<>();
    private ArrayList<Island> linkListIsland = new ArrayList<>();


    public Planet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    //add values - new values
    public void newOcean(Ocean ocean) {
        linkListOcean.add(ocean);
    }

    public void newContinent(Continent continent) {
        linkListContinent.add(continent);
    }

    public void newIsland(Island island) {
        linkListIsland.add(island);
    }



    //getLists
    public List<Ocean> getOceanList() {
        return linkListOcean;
    }

    public List<Continent> getContinentList() {
        return linkListContinent;
    }

    public List<Island> getIslandList() {
        return linkListIsland;
    }
}

