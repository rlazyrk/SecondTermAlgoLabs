package ua.lviv.iot.algo.part1.lab2;

import javax.swing.event.MenuDragMouseListener;
import java.util.LinkedList;
import java.util.List;

public class GardenManager {
    private final List<Garden> gardens = new LinkedList<>();

    public List<Garden> findAllWithOrchard() {
        return gardens.stream().filter(garden -> garden.hasOrchard()).toList();
    }

    public List<Garden> findAllFlowersMoreThen(int count) {
        return gardens.stream().filter(garden -> garden.getNumberOfFlowers() > count).toList();
    }

    public void addGarden(Garden gardenToAdd) {
        gardens.add(gardenToAdd);
    }

    public void addGarden(List<Garden> gardensToAdd) {
        gardens.addAll(gardensToAdd);
    }

    public static void main(String... args) {
        GardenManager gardenManager = new GardenManager();
        gardenManager.addGarden(new BotanicGarden());
        gardenManager.addGarden(new UniversityGarden(1222.24, 44, 11));
        gardenManager.addGarden(new BotanicGarden(1333.21, 14, 1778));
        gardenManager.addGarden(new BotanicGarden(1245.32, 17, 2342));
        gardenManager.addGarden(new UniversityGarden());
        gardenManager.addGarden(new UniversityGarden(2894.66, 732, 24));
        for (Garden garden : gardenManager.gardens)
            System.out.println(garden.toString() + "\n");
        var allWithOrchard = gardenManager.findAllWithOrchard();
        for (Garden garden : allWithOrchard)
            System.out.println(garden.toString());
        List<Garden> gardensToAdd = new LinkedList<Garden>();
        gardensToAdd.add(new DecorativeGarden(25, true, 32.89, 128));
        gardensToAdd.add(new FarmGarden(888, 155, 153.52, 987));
        gardensToAdd.add(new DecorativeGarden(8, false, 88.21, 896));
        gardenManager.addGarden(gardensToAdd);
        var moreThan100Flower = gardenManager.findAllFlowersMoreThen(100);
        for (Garden garden : moreThan100Flower)
            System.out.println(garden.toString());
    }
}
