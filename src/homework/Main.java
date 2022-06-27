package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] file = {"Main.java", "Utils.java"};
        String path = "E://Games//";
        StringBuilder log = new StringBuilder();
        String[] folderSrc = {"main", "test"};
        String[] folderRec = {"drawables", "vectors", "icons"};
        String[] folder1 = {"src", "res", "savegames", "temp"};
        String[] fileTemp = {"temp.txt"};

        CreateFile(file, path, log, folderSrc, folderRec, folder1, fileTemp);
        WriteLog(log);
    }

    private static void WriteLog(StringBuilder log) {
        try (FileWriter writer = new FileWriter("E://Games//temp//temp.txt", true)) {
            writer.write(String.valueOf(log));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void CreateFile(String[] file, String path, StringBuilder log, String[] folderSrc, String[] folderRec, String[] folder1, String[] fileTemp) throws IOException {
        for (int i = 0; i < folder1.length; i++) {
            File file1 = new File(path + folder1[i]);
            if (file1.mkdir()) {
                log.append("Create folder ").append(folder1[i]).append("\n");
                System.out.println("Create folder " + folder1[i]);
            }
        }
        for (int i = 0; i < folderSrc.length; i++) {
            File file2 = new File(path + folder1[0] + "//" + folderSrc[i]);
            if (file2.mkdir()) {
                log.append("Create folder ").append(folderSrc[i]).append("\n");
                System.out.println("Create folder " + folderSrc[i]);
            }
        }
        for (int i = 0; i < folderRec.length; i++) {
            File file3 = new File(path + folder1[1] + "//" + folderRec[i]);
            if (file3.mkdir()) {
                log.append("Create folder ").append(folderRec[i]).append("\n");
                System.out.println("Create folder " + folderRec[i]);
            }
        }
        for (int i = 0; i < file.length; i++) {
            File file4 = new File(path + folder1[0] + "//" + folderSrc[0] + "//" + file[i]);
            if (file4.createNewFile()) {
                log.append("Create file ").append(file[i]).append("\n");
                System.out.println("Create file " + file[i]);
            }
        }
        for (int i = 0; i < fileTemp.length; i++) {
            File file5 = new File(path + folder1[3] + "//" + fileTemp[i]);
            if (file5.createNewFile()) {
                log.append("Create file ").append(fileTemp[i]).append("\n");
                System.out.println("Create file " + fileTemp[i]);
            }
        }
    }
}