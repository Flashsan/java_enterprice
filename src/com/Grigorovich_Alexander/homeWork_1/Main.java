package com.Grigorovich_Alexander.homeWork_1;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String[]> dataFromFile = File.readFromFile();
        dataFromFile.sort(new Comporator());
        File.writeInFile(dataFromFile);
        System.out.println("Operation is done.");
    }
}
