package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class BotanicGarden extends Garden {
    private int numberOfGreenhouse;

    public void buildGreenhouse() {
        setNumberOfGreenhouse(getNumberOfGreenhouse() + 1);
    }

    public void destroyGreenhouse() {
        if (numberOfGreenhouse == 1 | numberOfGreenhouse == 0) {
            setNumberOfGreenhouse(0);
        } else {
            setNumberOfGreenhouse(numberOfGreenhouse - 1);
        }
    }

    @Override
    public boolean hasOrchard() {
        return true;
    }

    @Override
    public boolean hasVegetableGarden() {
        return false;
    }

    public BotanicGarden(final double area,
                         final int numberOfGreenhouse,
                         final int numberOfFlower) {
        super(area, numberOfFlower);
        this.numberOfGreenhouse = numberOfGreenhouse;
    }
}
