package ua.lviv.iot.algo.part1.lab1.models;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class DecorativeGardenTest extends TestCase {

    DecorativeGarden emptyTestGarden;
    DecorativeGarden testGarden;

    @Before
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