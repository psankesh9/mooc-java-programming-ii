public class Notepad {
    private String name;
    private int year;
 
    public Notepad(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        if (object == this) {
            return true;
        }

        Notepad compared = (Notepad) object;

        return this.name.equals(compared.name);
    }

    public static void main(String[] args) {
        Notepad basics = new Notepad("Equals basics", 2000);
        Notepad advanced = new Notepad("Equals advanced", 2001);

        System.out.println(basics.equals(basics)); // true
        System.out.println(basics.equals(advanced)); // false
        System.out.println(basics.equals(new Notepad("Equals basics", 2000))); // true
        System.out.println(basics.equals(new Notepad("Equals basics", 2001))); // true
    }
}
