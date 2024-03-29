package ua.lviv.iot.algo.part1.lab1.models;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public final class DecorativeGarden extends Garden {

    private int numberOfFlowerBeds;
    private boolean hasVerticalGarden;


    public void buildVerticalGarden() {
        setHasVerticalGarden(true);
    }

    public void removeVerticalGarden() {
        setHasVerticalGarden(false);
    }

    public String getHeaders() {
        return super.getHeaders() + "," + "numberOfFlowerBeds,"
                + " hasVerticalGarden";
    }

    public String toCSV() {
        return super.toCSV() + "," + numberOfFlowerBeds
                + "," + hasVerticalGarden;
    }


    @Override
    public boolean hasOrchard() {
        return false;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    public DecorativeGarden(final int numberOfFlowerBeds,
                            final boolean hasVerticalGarden,
                            final double area,
                            final int numberOfFlowers) {
        super(area, numberOfFlowers);
        this.hasVerticalGarden = hasVerticalGarden;
        this.numberOfFlowerBeds = numberOfFlowerBeds;
    }
}
