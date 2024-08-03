import java.util.HashMap;
import java.util.HashSet;
public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate)) {
            return false;
        }
        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)) {
            registry.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : registry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        HashSet<String> printedOwners = new HashSet<>();
        for (String owner : registry.values()) {
            if (!printedOwners.contains(owner)) {
                printedOwners.add(owner);
                System.out.println(owner);
            }
        }
    }

    public static void main(String[] args) {
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        VehicleRegistry registry = new VehicleRegistry();
        registry.add(li1, "Arto");
        registry.add(li2, "Arto");
        registry.add(li3, "Jürgen");

        System.out.println("License plates:");
        registry.printLicensePlates();
        System.out.println("---");
        System.out.println("Owners:");
        registry.printOwners();
    }
}
