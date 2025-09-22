package HospitalPlus_Patient_Management_System_2;

public class Patient {
    private String patientId;
    private String patientName;
    private int patientAge;

    Patient(String patientId, String patientName, int patientAge) 
    {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public String getPatientName(){
        return patientName;
    }

    public int getPatientAge(){
        return patientAge;
    }
    
    public String getPatientId(){
        return patientId;
    }

}
