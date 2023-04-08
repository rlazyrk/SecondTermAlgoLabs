package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class FarmGarden extends Garden {

    private int numberOfTree;
    private int numberOfCrops;

    @Override
    public boolean hasOrchard() {
        return true;
    }

    @Override
    public boolean hasVegetableGarden() {
        return true;
    }

    public FarmGarden(final int numberOfTree,
                      final int numberOfCrops,
                      final double area,
                      final int numberOfFlower) {
        super(area, numberOfFlower);
        this.numberOfCrops = numberOfCrops;
        this.numberOfTree = numberOfTree;
    }

}
