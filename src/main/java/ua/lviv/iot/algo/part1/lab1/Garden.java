package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

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

}

