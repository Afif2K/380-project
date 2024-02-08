public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    // Constructor
    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    // Getters and Setters
    public DisasterVictim getVictim() {
        DisasterVictim[] occupants = location.getOccupants();
        if (occupants.length > 0) {
            return occupants[0]; // Assuming there's only one victim per medical record
        } else {
            return null; // Return null if no victim found
        }
    }

    public void setVictim(DisasterVictim victim) {
        // Not implementing this setter assuming victim is derived from location
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDateOfTreatment() {
        return dateOfTreatment;
    }

    public void setDateOfTreatment(String dateOfTreatment) {
        this.dateOfTreatment = dateOfTreatment;
    }
}
