package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder log = new StringBuilder();
        String[] nameFiles = {
                "E://Games//src",
                "E://Games//rec",
                "E://Games//savegames",
                "E://Games//temp",
                "E://Games//rec//drawables",
                "E://Games//rec//icons",
                "E://Games//rec//vectors",
                "E://Games//src//main",
                "E://Games//src//test",
                "E://Games//src//main//Main.java",
                "E://Games//src//main//Utils.java",
                "E://Games//temp//temp.txt",
        };
        for (int i = 0; i < 9; i++) {
            File file = new File(nameFiles[i]);
            if (file.mkdir()) {
                log.append("Create folder: ").append(nameFiles[i]).append("\n");
                System.out.println("Create folder: " + nameFiles[i]);
            }
        }
        for (int f = 9; f < 12; f++) {
            File file1 = new File(nameFiles[f]);
            if (file1.createNewFile()) {
                log.append("Create file: ").append(nameFiles[f]).append("\n");
                System.out.println("Create file: " + nameFiles[f]);
            }
        }
        try (FileWriter writer = new FileWriter("E://Games//temp//temp.txt", true)) {
            writer.write(String.valueOf(log));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}