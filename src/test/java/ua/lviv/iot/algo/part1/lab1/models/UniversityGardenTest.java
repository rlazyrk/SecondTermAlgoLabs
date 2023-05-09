package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class UniversityGardenTest{

    UniversityGarden emptyTestGarden;
    UniversityGarden testGarden;

    @BeforeEach
    public void setUp() {
        emptyTestGarden = new UniversityGarden();
        testGarden = new UniversityGarden(11.11, 174, 77);
    }

    @Test
    public void testAddSculptures() {
        int expected = 10;
        emptyTestGarden.addSculptures(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfSculpture());
    }

    @Test
    public void testRemoveSculptures() {
        int expected = 27;
        testGarden.removeSculptures(50);
        assertEquals(expected, testGarden.getNumberOfSculpture());
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
    public void testGetNumberOfSculpture() {
        int expected = 77;
        assertEquals(expected, testGarden.getNumberOfSculpture());
    }

    @Test
    public void testSetNumberOfSculpture() {
        int expected = 25;
        emptyTestGarden.setNumberOfSculpture(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfSculpture());
    }

    @Test
    public void testTestToString() {
        String expected = "UniversityGarden(super=Garden(areaInSquareMeter=0.0, numberOfFlowers=0), numberOfSculpture=0)";
        assertEquals(expected, emptyTestGarden.toString());
    }
}