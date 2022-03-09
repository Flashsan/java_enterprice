package com.Grigorovich_Alexander.homeWork_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File {
    private static final String INPUT_PATH_FILE = "inFile.txt";
    private static final String OUT_PATH_FILE = "outFile.txt";

    public static List<String[]> readFromFile() {

        List<String[]> dataFromFile = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(INPUT_PATH_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                dataFromFile.add(line.split("\n"));
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataFromFile;
    }

    public static void writeInFile(List<String[]> line) {
        try {
            FileWriter fileWriter = new FileWriter(OUT_PATH_FILE);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String[] listData : line) {
                for (String writeLine : listData) {
                    bufferedWriter.write(writeLine);
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

