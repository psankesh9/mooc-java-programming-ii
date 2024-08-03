package dictionary;
public class Main {
    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        
        if (dictionary.load()) {
            System.out.println("Successfully loaded the dictionary from file");
        } else {
            System.out.println("Failed to load the dictionary from file");
        }

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("alla oleva"));

        dictionary.add("tietokone", "computer");
        dictionary.save();
    }
}
