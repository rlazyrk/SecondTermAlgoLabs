package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecorativeGardenTest {

    DecorativeGarden emptyTestGarden;
    DecorativeGarden testGarden;

    @BeforeEach
    public void setUp() {
        emptyTestGarden = new DecorativeGarden();
        testGarden = new DecorativeGarden(10, true, 17.11, 7);
    }

    @Test
    public void testBuildVerticalGarden() {
        emptyTestGarden.buildVerticalGarden();
        assertTrue(emptyTestGarden.isHasVerticalGarden());
    }

    @Test
    public void testRemoveVerticalGarden() {
        testGarden.removeVerticalGarden();
        assertFalse(testGarden.isHasVerticalGarden());
    }

    @Test
    public void testHasOrchard() {
        assertFalse(emptyTestGarden.hasOrchard());
    }

    @Test
    public void testHasVegetableGarden() {
        assertFalse(emptyTestGarden.hasVegetableGarden());
    }

    @Test
    public void testGetNumberOfFlowerBeds() {
        int expected = 10;
        assertEquals(expected, testGarden.getNumberOfFlowerBeds());
    }

    @Test
    public void testIsHasVerticalGarden() {
        assertTrue(testGarden.isHasVerticalGarden());
    }

    @Test
    public void testSetNumberOfFlowerBeds() {
        int expected = 10;
        emptyTestGarden.setNumberOfFlowerBeds(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfFlowerBeds());
    }

    @Test
    public void testSetHasVerticalGarden() {
        emptyTestGarden.setHasVerticalGarden(true);
        assertTrue(emptyTestGarden.isHasVerticalGarden());
    }

    @Test
    public void testTestToString() {
        String expected = "DecorativeGarden(super=Garden(areaInSquareMeter=0.0, numberOfFlowers=0), numberOfFlowerBeds=0, hasVerticalGarden=false)";
        assertEquals(expected, emptyTestGarden.toString());
    }

}