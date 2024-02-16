package edu.ucalgary.oop;
public class ReliefService {
    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry,
                         String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        this.dateOfInquiry = dateOfInquiry;
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
        this.inquirer = inquirer;
    }

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
        this.missingPerson = missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    public void setDateOfInquiry(String dateOfInquiry) {
        if (dateOfInquiry == null || dateOfInquiry.isEmpty()) {
            throw new IllegalArgumentException("Date of inquiry cannot be null or empty");
        }
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public void setInfoProvided(String infoProvided) {
        this.infoProvided = infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public void setLastKnownLocation(Location lastKnownLocation) {
        this.lastKnownLocation = lastKnownLocation;
    }

    public void printLogDetails() {
        System.out.println(getLogDetails());
    }
    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + "\n" +
                "Missing Person: " + missingPerson.getFirstName() + "\n" +
                "Date of Inquiry: " + dateOfInquiry + "\n" +
                "Info Provided: " + infoProvided + "\n" +
                "Last Known Location: " + lastKnownLocation.getName() + ", " + lastKnownLocation.getAddress();
    }
}
