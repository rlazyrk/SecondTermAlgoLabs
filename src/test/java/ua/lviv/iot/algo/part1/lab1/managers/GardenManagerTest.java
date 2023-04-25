package ua.lviv.iot.algo.part1.lab1.managers;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.models.BotanicGarden;
import ua.lviv.iot.algo.part1.lab1.models.FarmGarden;
import ua.lviv.iot.algo.part1.lab1.models.Garden;
import ua.lviv.iot.algo.part1.lab1.models.UniversityGarden;

import java.util.LinkedList;
import java.util.List;

public class GardenManagerTest extends TestCase {

    List<Garden> testList;
    UniversityGarden garden3;
    FarmGarden garden2;
    BotanicGarden garden1;

    @Before
    public void setUp() {
        testList = new LinkedList<Garden>();
        garden1 = new BotanicGarden(11, 25, 101);
        garden2 = new FarmGarden(11, 25, 25, 103);
        garden3 = new UniversityGarden(24, 99, 24);
    }

    @Test
    public void testFindAllWithOrchard() {
        GardenManager testManager = new GardenManager();
        testManager.addGarden(garden1);
        testManager.addGarden(garden2);
        testManager.addGarden(garden3);
        testList.add(garden1);
        testList.add(garden2);
        assertEquals(testList, testManager.findAllWithOrchard());
    }

    @Test
    public void testFindAllFlowersMoreThen() {
        GardenManager testManager = new GardenManager();
        testManager.addGarden(garden1);
        testManager.addGarden(garden2);
        testManager.addGarden(garden3);
        testList.add(garden1);
        testList.add(garden2);
        assertEquals(testList, testManager.findAllFlowersMoreThen(100));
    }

    @Test
    public void testAddGarden() {
        GardenManager testManager = new GardenManager();
        testManager.addGarden(garden1);
        testManager.addGarden(garden2);
        testManager.addGarden(garden3);
        testList.add(garden1);
        testList.add(garden2);
        testList.add(garden3);
        assertEquals(testList, testManager.getGardens());
    }

    @Test
    public void testTestAddGarden() {
        GardenManager testManager = new GardenManager();
        testList.add(garden1);
        testList.add(garden2);
        testList.add(garden3);
        testManager.addGarden(testList);
        assertEquals(testList, testManager.getGardens());
    }
}