package hospital.model;

public class Pharmacist extends MedicalStaff {

    public Pharmacist(String employeeId, String department,
                      int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Dispensing prescribed medicines and advising patients on their proper use."
        );
    }
}