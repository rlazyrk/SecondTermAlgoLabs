package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.Before;

public class UniversityGardenTest extends TestCase {

    UniversityGarden emptyTestGarden;
    UniversityGarden testGarden;

    @Before
    public void setUp() {
        emptyTestGarden = new UniversityGarden();
        testGarden = new UniversityGarden(11.11, 174, 77);
    }

    public void testAddSculptures() {
        int expected = 10;
        emptyTestGarden.addSculptures(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfSculpture());
    }

    public void testRemoveSculptures() {
        int expected = 27;
        testGarden.removeSculptures(50);
        assertEquals(expected, testGarden.getNumberOfSculpture());
    }

    public void testHasOrchard() {
        assertFalse(emptyTestGarden.hasOrchard());
    }

    public void testHasVegetableGarden() {
        assertFalse(emptyTestGarden.hasVegetableGarden());
    }

    public void testGetNumberOfSculpture() {
        int expected = 77;
        assertEquals(expected, testGarden.getNumberOfSculpture());
    }

    public void testSetNumberOfSculpture() {
        int expected = 25;
        emptyTestGarden.setNumberOfSculpture(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfSculpture());
    }

    public void testTestToString() {
        String expected = "UniversityGarden(super=Garden(areaInSquareMeter=0.0, numberOfFlowers=0), numberOfSculpture=0)";
        assertEquals(expected, emptyTestGarden.toString());
    }
}