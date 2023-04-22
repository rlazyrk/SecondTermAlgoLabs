package ua.lviv.iot.algo.part1.lab1.models;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public final class FarmGarden extends Garden {

    private int numberOfTree;
    private int numberOfCrops;

    public String getHeaders() {
        return super.getHeaders() + "," + "numberOfTree, "
                + "numberOfCrops";
    }

    public String toCSV() {
        return super.toCSV() + "," + numberOfTree
                + "," + numberOfCrops;
    }

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
