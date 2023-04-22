package ua.lviv.iot.algo.part1.lab1.writers;

import ua.lviv.iot.algo.part1.lab1.models.Garden;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public final class GardenWriter {
    private static final String PATH_TO_DIRECTORY = "src\\main\\resources\\";
    public static void writeToCSV(final List<Garden> gardens,
                                  final String fileName) throws IOException {

        if (gardens == null || gardens.isEmpty()) {
            return;
        }
        File file = new File(PATH_TO_DIRECTORY + fileName);
        try(FileWriter writer = new FileWriter( PATH_TO_DIRECTORY + fileName)) {
                List<String> headers = new LinkedList<>();
                Collections.sort(gardens, Comparator.comparing(g->g.getClass().getSimpleName()));
                for (Garden garden : gardens) {
                    if (!headers.contains(gardens.getClass().getSimpleName())) {
                        writer.write(garden.getHeaders() + "\n");
                        headers.add(garden.getClass().getSimpleName());
                    }
                    writer.write(garden.toCSV() + "\n");
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
