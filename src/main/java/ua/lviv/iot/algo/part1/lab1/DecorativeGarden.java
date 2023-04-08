package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class DecorativeGarden extends Garden {

    int numberOfFlowerBeds;
    boolean hasVerticalGarden;


    public void buildVerticalGarden() {
        setHasVerticalGarden(true);
    }

    public void removeVerticalGarden() {
        setHasVerticalGarden(false);
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    public DecorativeGarden(int numberOfFlowerBeds, boolean hasVerticalGarden, double area, int numberOfFlowers) {
        super(area, numberOfFlowers);
        this.hasVerticalGarden = hasVerticalGarden;
        this.numberOfFlowerBeds = numberOfFlowerBeds;
    }
}
