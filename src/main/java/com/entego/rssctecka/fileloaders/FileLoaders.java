package com.entego.rssctecka.fileloaders;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileLoaders {
    public String readBookTextFile(String fileName) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName + ".txt")));
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return "Chyba při čtení souboru:" + fileName;
        }
    }
}
