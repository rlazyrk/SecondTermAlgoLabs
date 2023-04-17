package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public final class UniversityGarden extends Garden {
    private int numberOfSculpture;

    public void addSculptures(final int count) {
        setNumberOfSculpture(numberOfSculpture + count);
    }

    public void removeSculptures(final int count) {
        if (numberOfSculpture < count) {
            setNumberOfSculpture(0);
        } else {
            setNumberOfSculpture(numberOfSculpture - count);
        }
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "numberOfSculpture";
    }

    public String toCVS() {
        return super.toCVS() + "," + numberOfSculpture;
    }

    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    public UniversityGarden(final double area,
                            final int numOfFlower,
                            final int numberOfSculpture) {
        super(area, numOfFlower);
        this.numberOfSculpture = numberOfSculpture;
    }
}
