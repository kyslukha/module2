package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Console {
    public static void main(String[] args) throws IOException {
        FileFindMethods finder = new FileFindMethods();
        String nameDir = finder.enterDirectory();
        String nameFile = finder.enterFile();
        String fileName;
        if (!nameDir.isEmpty()) {
            fileName = finder.finderNameFile(nameDir, nameFile);
        } else {
            fileName = finder.finderNameFile("src", nameFile);
        }
        if (!fileName.isEmpty()) {
            finder.findFile(fileName);
        } else {
            finder.findFileDir(nameDir);
        }


    }
}
