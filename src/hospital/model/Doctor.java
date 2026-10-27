package hospital.model;

public class Doctor extends MedicalStaff {

    public Doctor(String employeeId, String department,
                  int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Diagnosing patients, ordering tests and prescribing treatment."
        );
    }
}