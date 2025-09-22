package HospitalPlus_Patient_Management_System_2;

public class PatientReportGeneratorImpl implements IReportGenerator {
    private Patient patient;

    public PatientReportGeneratorImpl(Patient patient){
        this.patient = patient;
    }

    @Override
    public void generateReport() 
    {
        System.out.println("---- Patient Report ----");
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getPatientAge());
    }
    
}
