# Class Design

- hospital.model.MedicalStaff (abstract): shared fields (employeeId, department, workingHours), constructor, displayInformation() and abstract performDuties().
- Doctor, Nurse, Pharmacist, LaboratoryTechnician: extend MedicalStaff and implement performDuties().
- hospital.app.Main: stores all staff in a MedicalStaff array and shows polymorphism.
