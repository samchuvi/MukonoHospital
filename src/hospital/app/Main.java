package hospital.app;

import hospital.model.MedicalStaff;
import hospital.model.Doctor;
import hospital.model.Nurse;
import hospital.model.Pharmacist;
import hospital.model.LaboratoryTechnician;

public class Main {

    public static void main(String[] args) {

        MedicalStaff[] staffMembers = {
                new Doctor("M001", "General Medicine", 8),
                new Nurse("M002", "Emergency", 8),
                new Pharmacist("M003", "Pharmacy", 7),
                new LaboratoryTechnician("M004", "Laboratory", 8)
        };

        System.out.println("========================================");
        System.out.println(" MUKONO HOSPITAL STAFF MANAGEMENT SYSTEM");
        System.out.println("========================================");

        for (MedicalStaff staff : staffMembers) {
            System.out.println("\n----------------------------------------");

            staff.displayInformation();
            staff.performDuties();
        }

        System.out.println("\nSystem completed successfully.");
    }
}