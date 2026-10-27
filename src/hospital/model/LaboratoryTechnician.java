package hospital.model;

public class LaboratoryTechnician extends MedicalStaff {

    public LaboratoryTechnician(String employeeId, String department,
                                int workingHours) {
        super(employeeId, department, workingHours);
    }

    @Override
    public void performDuties() {
        System.out.println(
                "Duty: Conducting laboratory tests, analyzing samples and reporting results to doctors."
        );
    }
}