public class Program {
    public static void main(String[] args) {
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout()); // false
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout()); // true
        System.out.println(den.takeFromHideout()); // peekaboo
        System.out.println(den.isInHideout()); // false
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout()); // true
        System.out.println(den.takeFromHideout()); // heelloo
        System.out.println(den.isInHideout()); // false

        Hideout<Integer> den2 = new Hideout<>();
        System.out.println(den2.isInHideout()); // false
        den2.putIntoHideout(1);
        System.out.println(den2.isInHideout()); // true
        System.out.println(den2.takeFromHideout()); // 1
        System.out.println(den2.isInHideout()); // false
    }
}
