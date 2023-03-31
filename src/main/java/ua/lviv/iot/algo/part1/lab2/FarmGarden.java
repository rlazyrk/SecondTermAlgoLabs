package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@AllArgsConstructor
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
    public FarmGarden(int numberOfTree, int numberOfCrops, double area, int numberOfFlower){
        super(area,numberOfFlower);
        this.numberOfCrops=numberOfCrops;
        this.numberOfTree=numberOfTree;
    }

}
