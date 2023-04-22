package ua.lviv.iot.algo.part1.lab1.writers;


import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;


public class GardenWriterTest {
    private final String EXPECTED_FILENAME = "src\\main\\resources\\expected.csv";
    private final String PATH_FILE_FOR_TEST = "src\\main\\resources\\fileForTest.csv";
    private final File expectedFile = new File(EXPECTED_FILENAME);
    private File fileToTest;
    private List<Garden> gardenList = new LinkedList<>();


    @Before
    @BeforeEach
    public void setUp(){
        gardenList.add(new FarmGarden(44,44,22.44,22));
        gardenList.add(new UniversityGarden(10.11,134,11));
        gardenList.add(new BotanicGarden(10,11,342));
        gardenList.add(new DecorativeGarden(10,true,10.44,422));
        fileToTest = new File(PATH_FILE_FOR_TEST);
    }

    @Test
    public void testWriteToFileSuccess() throws IOException {

            GardenWriter.writeToCSV(gardenList, "fileForTest.csv");
            byte[] fileByte_1 = FileUtils.readFileToByteArray(expectedFile);
            byte[] fileByte_2 = FileUtils.readFileToByteArray(fileToTest);
            Assert.assertArrayEquals(fileByte_1,fileByte_2);

    }
    @Test
    public void testWriteToCVS_NullList() throws Exception {
        GardenWriter.writeToCSV(null, "test.csv");
        File testFile = new File("src/main/resources/test.csv");
        Assert.assertFalse(testFile.exists());
    }

    @Test
    public void writeFileToFile() throws IOException {
        File file = new File(PATH_FILE_FOR_TEST);
        Files.createFile(Path.of(PATH_FILE_FOR_TEST));
        FileWriter fileWriter = new FileWriter(PATH_FILE_FOR_TEST);
        fileWriter.write("some string");
        fileWriter.close();
        testWriteToFileSuccess();
    }
    @After
    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(PATH_FILE_FOR_TEST));
    }
}