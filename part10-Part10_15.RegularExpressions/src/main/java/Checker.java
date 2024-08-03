public class Checker {

    public boolean isDayOfWeek(String string) {
        return string.matches("^(mon|tue|wed|thu|fri|sat|sun)$");
    }

    public boolean allVowels(String string) {
        return string.matches("^[aeiou]*$");
    }

    public boolean timeOfDay(String string) {
        return string.matches("^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
    }

    public static void main(String[] args) {
        Checker checker = new Checker();

        System.out.println(checker.isDayOfWeek("tue")); // true
        System.out.println(checker.isDayOfWeek("abc")); // false

        System.out.println(checker.allVowels("oi")); // true
        System.out.println(checker.allVowels("queue")); // false

        System.out.println(checker.timeOfDay("17:23:05")); // true
        System.out.println(checker.timeOfDay("abc")); // false
        System.out.println(checker.timeOfDay("33:33:33")); // false
    }
}
