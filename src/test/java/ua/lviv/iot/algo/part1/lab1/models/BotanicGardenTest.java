package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BotanicGardenTest {

    static BotanicGarden emptyTestGarden;
    static BotanicGarden testGarden;

    @BeforeEach
    public void setUp() {
        emptyTestGarden = new BotanicGarden();
        testGarden = new BotanicGarden(14.44, 7, 71,1);
    }

    @Test
    public void buildGreenhouse() {
        int expected = 8;
        testGarden.buildGreenhouse();
        assertEquals(expected, testGarden.getNumberOfGreenhouse());
    }

    @Test
    public void destroyGreenhouse() {
        int expected = 6;
        testGarden.destroyGreenhouse();
        assertEquals(expected, testGarden.getNumberOfGreenhouse());
        BotanicGarden testGarden2 = new BotanicGarden(1.1, 1, 7,1);
        int expected2 = 0;
        testGarden2.destroyGreenhouse();
        assertEquals(expected2, testGarden2.getNumberOfGreenhouse());
    }


    @Test
    public void hasOrchard() {
        assertTrue(emptyTestGarden.hasOrchard());
    }

    @Test
    public void hasVegetableGarden() {
        assertFalse(emptyTestGarden.hasVegetableGarden());
    }

    @Test
    public void getNumberOfGreenhouse() {
        int expected = 7;
        assertEquals(expected, testGarden.getNumberOfGreenhouse());
    }

    @Test
    public void setNumberOfGreenhouse() {
        int expected = 7;
        emptyTestGarden.setNumberOfGreenhouse(expected);
        assertEquals(expected, emptyTestGarden.getNumberOfGreenhouse());
    }

    @Test
    public void testToString() {
        String expected = "BotanicGarden(super=Garden(areaInSquareMeter=0.0, numberOfFlowers=0), numberOfGreenhouse=0, id=null)";
        assertEquals(expected, emptyTestGarden.toString());
    }
}