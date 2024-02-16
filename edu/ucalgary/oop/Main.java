package edu.ucalgary.oop;
public class Main {
    public static void main(String[] args) {
        DisasterVictim victim1 = new DisasterVictim("Freda", "2024-01-06");

        Inquirer inquirer1 = new Inquirer("Joseph", "Boullion", "123-456-7890", "Seeking information");

        Location location1 = new Location("UofC", "2500 24 Ave NW");

        MedicalRecord medicalRecord1 = new MedicalRecord(location1, "Burned knee", "2024-01-05");

        Supply supply1 = new Supply("Cloth", 2);

        FamilyRelation familyRelation1 = new FamilyRelation(victim1, "Husband", new DisasterVictim("Joseph", "2024-02-06"));

        ReliefService reliefService1 = new ReliefService(inquirer1, victim1, "2024-02-06", "Last seen at the park", location1);

        victim1.addMedicalRecord(medicalRecord1);

        victim1.addSupply(supply1);

        victim1.addFamilyConnection(familyRelation1);

        System.out.println("Victim Name: " + victim1.getFirstName());
        System.out.println("Entry Date: " + victim1.getENTRY_DATE());
        System.out.println("Medical Records: ");
        for (MedicalRecord record : victim1.getMedicalRecords()) {
            System.out.println("- " + record.getDateOfTreatment() + ": " + record.getTreatmentDetails());
        }
        System.out.println("Personal Belongings: ");
        for (Supply supply : victim1.getPersonalBelongings()) {
            System.out.println("- " + supply.getType() + ": " + supply.getQuantity());
        }
        System.out.println("Family Connections: ");
        for (FamilyRelation relation : victim1.getFamilyConnections()) {
            System.out.println("- " + relation.getRelationshipTo() + ": " + relation.getPersonTwo().getFirstName());
        }

        // Printing inquirer details
        System.out.println("\nInquirer: " + inquirer1.getFirstName() + " " + inquirer1.getLastName());
        System.out.println("Info: " + inquirer1.getInfo());
        System.out.println("Services Phone: " + inquirer1.getServicesPhoneNum());

        // Printing relief service details
        System.out.println("\nRelief Service Details:");
        System.out.println(reliefService1.getLogDetails());
    }
}