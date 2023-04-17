package ua.lviv.iot.algo.part1.lab1;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertThrows;

public class GardenWriterTest extends TestCase {
    private String EXPECTED_FILENAME = "src/test/resources/fileForTest.csv";
    private String FILE_FOR_TEST = "src/test/resources/fileForTest.csv";
    private final File expectedFile = new File(EXPECTED_FILENAME);
    private File fileToTest;
    private List<Garden> gardenList;


    @BeforeEach
    public void setUp(){
        gardenList = new LinkedList<>();
        gardenList.add(new BotanicGarden(12,11,42));
        gardenList.add(new DecorativeGarden());
        gardenList.add(new FarmGarden());
        gardenList.add(new FarmGarden(11,24,44,410));
        gardenList.add(new UniversityGarden());
        fileToTest = new File(FILE_FOR_TEST);
    }

    @Test
    public void testWriteToFileSuccess() throws IOException {

        GardenWriter.writeToCVS(gardenList, FILE_FOR_TEST);

        assertTrue(Files.exists(fileToTest.toPath()));
        assertEquals(Files.readAllLines(expectedFile.toPath()),
                Files.readAllLines(fileToTest.toPath()));
    }


    @Test
    public void testWriteToCVS_NullList() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            GardenWriter.writeToCVS(null, "test.csv");
        });
    }

    @Test
    public void testWriteToCVS_EmptyList() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
            List<Garden> test1 = new LinkedList<>();
            GardenWriter.writeToCVS(test1,"test.csv");
        });
    }
    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(FILE_FOR_TEST));
    }
}