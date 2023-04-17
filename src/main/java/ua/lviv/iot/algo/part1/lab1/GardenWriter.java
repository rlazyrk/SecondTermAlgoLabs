package ua.lviv.iot.algo.part1.lab1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GardenWriter {
    public static void writeToCVS(final List<Garden> gardens,
                                  final String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            throw new FileAlreadyExistsException("File already exists");
        } else {
            if (gardens == null || gardens.isEmpty()) {
                throw new IllegalArgumentException("List cannot be empty");
            }
            FileWriter writer = new FileWriter(fileName);
            Map<String, Boolean> headers = new HashMap<>();
            gardens.sort((grdn1, garden2) -> grdn1.getClass().getSimpleName().
                    compareTo(garden2.getClass().getSimpleName()));
            for (Garden garden : gardens) {
                if (!headers.containsKey(gardens.getClass().getSimpleName())) {
                    writer.write(garden.getHeaders() + "\n");
                    headers.put(garden.getClass().getSimpleName(), true);
                }
                writer.write(garden.toCVS() + "\n");
            }
            writer.close();
        }
    }
}
