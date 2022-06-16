package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File src = new File("E://Games//src");
        File res = new File("E://Games//res");
        File saveGames = new File("E://Games//savegames");
        File temp = new File("E://Games//temp");
        File main = new File(src, "main");
        File test = new File(src, "test");
        File Main = new File(main, "Main.java");
        File Utils = new File(main, "Utils.java");
        File drawables = new File(res, "drawables");
        File vectors = new File(res, "vectors");
        File icons = new File(res, "icons");
        File tempTxt = new File(temp, "temp.txt");
        StringBuilder log = new StringBuilder();

        String[] folder = {"src", "res", "saveGames", "temp", "main", "drawables", "vectors", "icons"};
        String[] file = {"Main", "Utils", "tempTxt"};

        if (src.mkdir() && res.mkdir() && saveGames.mkdir() && temp.mkdir() && main.mkdir() && test.mkdir() && drawables.mkdir() && vectors.mkdir() && icons.mkdir()) {
            for (int i = 0; i < folder.length; i++) {
                log.append("Create folder ").append(folder[i]).append("\n");
                System.out.println("Create folder " + folder[i]);
            }
        }
        if (Main.createNewFile() && Utils.createNewFile() && tempTxt.createNewFile()) {
            for (int i = 0; i < file.length; i++) {
                log.append("Create file ").append(file[i]).append("\n");
                System.out.println("Create file " + file[i]);
            }
        }
        try (FileWriter writer = new FileWriter("E://Games//temp//temp.txt", true)) {
            writer.write(String.valueOf(log));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}