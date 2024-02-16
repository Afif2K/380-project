import java.util.ArrayList;

public class Location {
    private String name;
    private String address;
    private ArrayList<DisasterVictim> occupants;
    private ArrayList<Supply> supplies;

    // Constructor
    public Location(String name, String address) {
        this.name = name;
        this.address = address;
        this.occupants = new ArrayList<>();
        this.supplies = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DisasterVictim[] getOccupants() {
        return occupants.toArray(new DisasterVictim[0]);
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants.clear();
        for (DisasterVictim victim : occupants) {
            addOccupant(victim);
        }
    }

    public Supply[] getSupplies() {
        return supplies.toArray(new Supply[0]);
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies.clear();
        for (Supply supply : supplies) {
            addSupply(supply);
        }
    }

    // Add and Remove methods
    public void addOccupant(DisasterVictim occupant) {
        occupants.add(occupant);
    }

    public void removeOccupant(DisasterVictim occupant) {
        occupants.remove(occupant);
    }

    public void addSupply(Supply supply) {
        supplies.add(supply);
    }

    public void removeSupply(Supply supply) {
        supplies.remove(supply);
    }

    // Update location details
    public void updateLog(String name, String address) {
        setName(name);
        setAddress(address);
    }
}
