package ua.lviv.iot.algo.part1.lab1.models;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class FarmGardenTest extends TestCase {

    FarmGarden emptyTestGarden;
    FarmGarden testGarden;

    @Before
    public void setUp() {
        emptyTestGarden = new FarmGarden();
        testGarden = new FarmGarden(11, 77, 25.44, 172);
    }

    @Test
    public void testHasOrchard() {
        assertTrue(emptyTestGarden.hasOrchard());
    }

    @Test
    public void testHasVegetableGarden() {
        assertTrue(emptyTestGarden.hasVegetableGarden());
    }

    @Test
    public void testGetNumberOfTree() {
        int expected = 11;
        assertEquals(expected, testGarden.getNumberOfTree());
    }

    @Test
    public void testGetNumberOfCrops() {
        int expected = 77;
        assertEquals(expected, testGarden.getNumberOfCrops());
    }

    @Test
    public void testSetNumberOfTree() {
        int expected = 7;
        emptyTestGarden.setNumberOfTree(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfTree());
    }

    @Test
    public void testSetNumberOfCrops() {
        int expected = 11;
        emptyTestGarden.setNumberOfCrops(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfCrops());
    }

    @Test
    public void testTestToString() {
        String expected = "FarmGarden(super=Garden(areaInSquareMeter=0.0, numberOfFlowers=0), numberOfTree=0, numberOfCrops=0)";
        assertEquals(expected, emptyTestGarden.toString());
    }

    @Test
    public void testSetAreaInSquareMeter() {
        double expected = 77.121;
        emptyTestGarden.setAreaInSquareMeter(expected);
        assertEquals(expected, emptyTestGarden.getAreaInSquareMeter());
    }
}