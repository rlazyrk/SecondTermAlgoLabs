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
    public void remoweFlowers(int count){
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
        garden3.setNumberOfFlowers(11);
        garden4.setAreaInSquareMeter(142.2);
        garden4.setHasOrchard(true);
        garden3.setHasVegetableGarden(false);
        Garden[] arrOfGardens = new Garden[]{garden1,garden2,garden3,garden4};
        for(int i = 0;i<arrOfGardens.length; i++){
            System.out.println(arrOfGardens[i].toString());
        }
        garden4.remoweFlowers(10);
        for(int i = 0;i<arrOfGardens.length; i++){
            System.out.println(arrOfGardens[i].toString());
        }

    }
}