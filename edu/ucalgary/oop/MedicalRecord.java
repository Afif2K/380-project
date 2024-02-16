package edu.ucalgary.oop;
public class MedicalRecord {
    private Location location;
    private String treatmentDetails;
    private String dateOfTreatment;

    public MedicalRecord(Location location, String treatmentDetails, String dateOfTreatment) {
        if (location == null || treatmentDetails == null || dateOfTreatment == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }
        this.location = location;
        this.treatmentDetails = treatmentDetails;
        this.dateOfTreatment = dateOfTreatment;
    }

    public DisasterVictim getVictim() {
        DisasterVictim[] occupants = location.getOccupants();
        if (occupants.length > 0) {
            return occupants[0]; 
        } else {
            return null;
        }
    }

    public void setVictim(DisasterVictim victim) {
        location.addOccupant(victim);
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
        if (dateOfTreatment == null) {
            throw new IllegalArgumentException("Error, set date of treatment");
        }
        this.dateOfTreatment = dateOfTreatment;
    }
}
