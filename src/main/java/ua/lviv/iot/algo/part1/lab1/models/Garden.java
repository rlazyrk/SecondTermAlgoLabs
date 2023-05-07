package ua.lviv.iot.algo.part1.lab1.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.minidev.json.annotate.JsonIgnore;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class Garden {
    private double areaInSquareMeter;
    private int numberOfFlowers;
    private Integer id;

    public abstract boolean hasOrchard();

    public abstract boolean hasVegetableGarden();

    /**
     * give us header of the fields of this class
     */
    @JsonIgnore
    public String getHeaders() {
        return "areaInSquareMeter, numberOfFlowers";
    }

    /**
     * give us what we have to write into CSV file
     */
    public String toCSV() {
        return areaInSquareMeter + "," + numberOfFlowers;
    }
}
