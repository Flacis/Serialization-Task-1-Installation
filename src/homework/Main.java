package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "E://Games//";
        StringBuilder log = new StringBuilder();
        String[] nameFile = {"Main.java", "Utils.java", "temp.txt"};
        String[] nameFolders = {"src", "res", "savegames", "temp", "drawables", "vectors", "icons", "main", "test"};
        saveFolder(path, log, nameFolders);
        createFile(path, log, nameFile, nameFolders);
        logWriter(log);
    }

    private static void createFile(String path, StringBuilder log, String[] nameFile, String[] nameFolders) throws IOException {
        for (int fileMain = 0; fileMain < 2; fileMain++) {
            File main = new File(path + nameFolders[0] + "//" + nameFolders[7] + "//" + nameFile[fileMain]);
            if (main.createNewFile()) {
                lCF(log, nameFile[0]);
            }
            for (int fileTemp = 2; fileTemp < 3; fileTemp++) {
                File temp = new File(path + nameFolders[3] + "//" + nameFile[fileTemp]);
                if (temp.createNewFile()) {
                    lCF(log, nameFile[2]);
                }
            }
        }
    }

    private static void logWriter(StringBuilder log) {
        try (FileWriter writer = new FileWriter("E://Games//temp//temp.txt", true)) {
            writer.write(String.valueOf(log));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lCF(StringBuilder log, String nameFile) {
        log.append("Create file: ").append(nameFile).append("\n");
        System.out.println("Create file: " + nameFile);
    }

    private static void saveFolder(String path, StringBuilder log, String[] nameFolders) {
        for (int i = 0; i < 4; i++) {
            File generalFolders = new File(path + nameFolders[i]);
            if (generalFolders.mkdir()) {
                logCreate(log, nameFolders[i]);
            }
            for (int res = 4; res < 7; res++) {
                String resFolder = path + nameFolders[1] + "//" + nameFolders[res];
                File resFolders = new File(resFolder);
                if (resFolders.mkdir()) {
                    logCreate(log, nameFolders[res]);
                }
                for (int src = 7; src < 9; src++) {
                    String srcFolder = path + nameFolders[0] + "//" + nameFolders[src];
                    File srcFolders = new File(srcFolder);
                    if (srcFolders.mkdir()) {
                        logCreate(log, nameFolders[src]);
                    }
                }
            }
        }
    }

    private static void logCreate(StringBuilder log, String nameFolders) {
        log.append("Create folder: ").append(nameFolders).append("\n");
        System.out.println("Create folder: " + nameFolders);
    }
}