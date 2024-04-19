/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp3;


/**
 *
 * @author bilel
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileHandler {

    private String filePath;
    private Integer fileSizeInKb;
    private Integer numberOfLines;
    private ArrayList<String> fileContent;

    public FileHandler(String filePath) throws IOException {
        File file = new File(filePath);

        if (file.exists()) {
            this.filePath = filePath;
            this.fileSizeInKb = 0;
            this.numberOfLines = 0;
            this.fileContent = new ArrayList<>();
            readFile();
        } else {
            System.out.println("Le fichier n'existe pas");
        }
    }

    private void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            fileContent.add(line);
            numberOfLines++;
            fileSizeInKb += line.length() / 1024;
        }
        br.close();
    }

    public ArrayList<String> findLineWithPattern(String pattern) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        ArrayList<String> linesWithPattern = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            if (line.contains(pattern)) {
                linesWithPattern.add(line);
            }
        }
        br.close();
        return linesWithPattern;
    }

    public boolean compareString1(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean compareString2(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public boolean compareString3(String str1, String str2) {
        return str1 == str2;
    }

    public void reverseString(int lineIndex) {
        if (lineIndex > fileContent.size()) {
            System.out.println("Index inexistant");
        } else {
            StringBuilder sb = new StringBuilder(fileContent.get(lineIndex));
            sb.reverse();
            System.out.println(sb);
        }
    }

    public void removeDuplicates(int lineIndex) {
        String str = fileContent.get(lineIndex);
        StringBuilder sb = new StringBuilder();
        Set<Character> seenCharacters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seenCharacters.contains(c)) {
                sb.append(c);
                seenCharacters.add(c);
            }
        }
        System.out.println(sb);
    }
}
