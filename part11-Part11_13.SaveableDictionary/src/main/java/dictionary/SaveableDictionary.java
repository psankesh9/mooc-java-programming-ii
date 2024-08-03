package dictionary;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word) && !dictionary.containsValue(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        } else if (dictionary.containsValue(word)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else if (dictionary.containsValue(word)) {
            String key = null;
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    key = entry.getKey();
                    break;
                }
            }
            if (key != null) {
                dictionary.remove(key);
            }
        }
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    dictionary.put(parts[0], parts[1]);
                }
            }
            fileReader.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            writer.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
