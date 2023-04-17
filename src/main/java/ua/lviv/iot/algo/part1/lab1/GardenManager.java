package ua.lviv.iot.algo.part1.lab1;

import java.util.LinkedList;
import java.util.List;

public final class GardenManager {
    private final List<Garden> gardens = new LinkedList<>();

    List<Garden> getGardens() {
        return gardens;
    }

    public List<Garden> findAllWithOrchard() {
        return gardens.stream()
                .filter(garden -> garden.hasOrchard())
                .toList();
    }

    public List<Garden> findAllFlowersMoreThen(final int count) {
        return gardens.stream().
                filter(garden -> garden.getNumberOfFlowers() > count)
                .toList();
    }

    public void addGarden(final Garden gardenToAdd) {
        gardens.add(gardenToAdd);
    }

    public void addGarden(final List<Garden> gardensToAdd) {
        gardens.addAll(gardensToAdd);
    }
}
