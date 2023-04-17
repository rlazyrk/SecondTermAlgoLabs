package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Garden {
    private double areaInSquareMeter;
    private int numberOfFlowers;

    public abstract boolean hasOrchard();

    public abstract boolean hasVegetableGarden();

    /**
     * give us header of the fields of this class
     */
    public String getHeaders() {
        return "areaInSquareMeter, numberOfFlowers";
    }

    /**
     * give us what we have to write into CSV file
     */
    public String toCVS() {
        return areaInSquareMeter + "," + numberOfFlowers;
    }
}
