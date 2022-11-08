package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class ParsFile {
    private String FileName;

    ParsFile(String FileName) {
        this.FileName = FileName;
    }
    public String get_text(String FileName) {
        String result = "";
        try {
            File Text = new File(FileName);
            Scanner scan = new Scanner(Text);
            while (scan.hasNext()) {
                String nextLine = scan.nextLine();
                result += nextLine;
            }
            return result;

        } catch (FileNotFoundException e) {
            System.out.println("File is not found...");
        }
        return result;
    }
}

class FrequencyDictionary {
    private String str;

    FrequencyDictionary (String str) {
        this.str = str;
    }

    public HashMap<String, Integer> get_dict(String str) {
        HashMap<String, Integer> result = new HashMap<> ();
        char[] buff = str.toCharArray();
        for (int index = 0; index < buff.length; ++index) {
            if (result.containsKey(String.valueOf(buff[index]))) {
                result.put(String.valueOf(buff[index]), result.get(String.valueOf(buff[index])) + 1);
            } else {
                result.put(String.valueOf(buff[index]), 1);
            }
        }
        return result;
    }
}


public class Main {
    public static void main(String[] args) {
        String file_name = "C:\\Users\\vadim\\Desktop\\test.txt";
        com.company.ParsFile file = new com.company.ParsFile(file_name);
        String s = file.get_text(file_name);
        com.company.FrequencyDictionary frequencyDictionary = new com.company.FrequencyDictionary(s);
        HashMap<String, Integer> result = frequencyDictionary.get_dict(s);
        for (Map.Entry entry : result.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
