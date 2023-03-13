package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Garden {
    private double areaInSquareMeter;
    private boolean hasOrchard;
    private boolean hasVegetableGarden;
    private int numberOfFlowers;
    private static Garden defaultGarden = new Garden();

    public static Garden getInstance(){
        return defaultGarden;
    }
    public void plantFlowers(int count){
        setNumberOfFlowers(getNumberOfFlowers() + count);
    }
    public void removeFlowers(int count){
        if(getNumberOfFlowers()<= count){
            setNumberOfFlowers(0);
        }
        else{
            setNumberOfFlowers(getNumberOfFlowers()-count);
        }
    }
    public void addVegetableRegion(double area){
        setAreaInSquareMeter(getAreaInSquareMeter() + area);
    }

    public static void main(String[] args) {
        Garden garden1 = new Garden();
        Garden garden2 = new Garden(10, true,true,10);
        Garden garden3 = getInstance();
        Garden garden4 = getInstance();
        Garden[] gardens = new Garden[]{garden1,garden2,garden3,garden4};
        for( Garden garden : gardens){
            System.out.println(garden.toString());
        }
    }
}