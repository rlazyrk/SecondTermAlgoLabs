package ua.lviv.iot.algo.part1.lab1.models;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class GardenTest {

    static BotanicGarden emptyTestGarden;
    static BotanicGarden testGarden;

    @BeforeAll
    public static void setUp() {
        emptyTestGarden = new BotanicGarden();
        testGarden = new BotanicGarden(14.44, 7, 71,1);
    }

    @Test
    public void testHasOrchard() {
        assertTrue(emptyTestGarden.hasOrchard());
    }

    @Test
    public void testHasVegetableGarden() {
        assertFalse(emptyTestGarden.hasVegetableGarden());
    }

    @Test
    public void testGetAreaInSquareMeter() {
        double expected = 14.44;
        assertEquals(expected, testGarden.getAreaInSquareMeter());
    }

    @Test
    public void testGetNumberOfFlowers() {
        int expected = 71;
        assertEquals(expected, testGarden.getNumberOfFlowers());
    }

    @Test
    public void testSetAreaInSquareMeter() {
        double expected = 147.11;
        emptyTestGarden.setAreaInSquareMeter(expected);
        assertEquals(expected, emptyTestGarden.getAreaInSquareMeter());
    }

    @Test
    public void testSetNumberOfFlowers() {
        int expected = 100;
        emptyTestGarden.setNumberOfFlowers(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfFlowers());
    }

    @Test
    public void testTestToString() {
        String expected = "BotanicGarden(super=Garden(areaInSquareMeter=147.11, numberOfFlowers=100, id=null), numberOfGreenhouse=0)";
        assertEquals(expected, emptyTestGarden.toString());
    }
}