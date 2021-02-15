package ua.com.alevel;

import java.util.*;
import java.io.*;
import java.io.FileInputStream;
import java.io.File;

public class FileFindMethods {
    public static String enterDirectory() {
        System.out.println("Write the directory of file (if that is current directory push ENTER) ");
        String info = "";
        Scanner scanner = new Scanner(System.in);
        info = scanner.nextLine();
        return info;
    }

    public static String enterFile() {
        System.out.println("Write full name of file (if you want to find files of directory push ENTER) ");
        String info = "";
        Scanner scanner = new Scanner(System.in);
        info = scanner.nextLine();
        return info;
    }

    public static String finderNameFile(String dir, String file) {
        String info = dir + "/" + file;
        return info;

    }

    public static void findFile(String fileName) {
        File file = new File(fileName);
        try (FileInputStream inputStream = new FileInputStream(file)) {
            System.out.println("Find file " + fileName);
            int symbol;
            while ((symbol = inputStream.read()) != -1) {
                System.out.print((char) symbol);
            }
        } catch (IOException e) {

            System.out.println("File " + fileName + " is not found");
        }
    }

    public static void findFileDir(String dir) {
        File direct = new File(dir);
        System.out.println("find files in directory");

    }

}



