package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class UniversityGarden extends Garden {
    private int numberOfSculpture;

    public void addSculptures(int count) {
        setNumberOfSculpture(numberOfSculpture + count);
    }

    public void removeSculptures(int count) {
        if (numberOfSculpture < count) {
            setNumberOfSculpture(0);
        } else {
            setNumberOfSculpture(numberOfSculpture - count);
        }
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    public UniversityGarden(double area, int numOfFlower, int numberOfSculpture) {
        super(area, numOfFlower);
        this.numberOfSculpture = numberOfSculpture;
    }
}

