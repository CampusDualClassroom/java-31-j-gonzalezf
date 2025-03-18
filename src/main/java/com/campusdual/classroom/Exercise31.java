package com.campusdual.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exercise31 {

    public static void main(String[] args) {

        String filePath = "src/main/resources/lorem.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
