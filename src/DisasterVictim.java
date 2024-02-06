import java.util.ArrayList;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String comments;
    private static String ASSIGNED_SOCIAL_ID;
    private ArrayList<MedicalRecord> medicalRecords;
    private ArrayList<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private ArrayList<Supply> personalBelongings;

    // Constructor
    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        this.medicalRecords = new ArrayList<>();
        this.familyConnections = new ArrayList<>();
        this.personalBelongings = new ArrayList<>();
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public static String getASSIGNED_SOCIAL_ID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public static void setASSIGNED_SOCIAL_ID(String ASSIGNED_SOCIAL_ID) {
        DisasterVictim.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public MedicalRecord[] getMedicalRecords() {
        return medicalRecords.toArray(new MedicalRecord[0]);
    }

    public void setMedicalRecords(MedicalRecord[] medicalRecords) {
        this.medicalRecords.clear();
        for (MedicalRecord record : medicalRecords) {
            addMedicalRecord(record);
        }
    }

    public FamilyRelation[] getFamilyConnections() {
        return familyConnections.toArray(new FamilyRelation[0]);
    }

    public void setFamilyConnections(FamilyRelation[] familyConnections) {
        this.familyConnections.clear();
        for (FamilyRelation relation : familyConnections) {
            addFamilyConnection(relation);
        }
    }

    public String getENTRY_DATE() {
        return ENTRY_DATE;
    }

    public ArrayList<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    // Additional methods
    public void addSupply(Supply supply) {
        personalBelongings.add(supply);
    }

    public void removeSupply(Supply supply) {
        personalBelongings.remove(supply);
    }

    public void addFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.add(familyConnection);
    }

    public void removeFamilyConnection(FamilyRelation familyConnection) {
        familyConnections.remove(familyConnection);
    }

    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
}
