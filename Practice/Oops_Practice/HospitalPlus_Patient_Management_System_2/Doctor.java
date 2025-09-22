package HospitalPlus_Patient_Management_System_2;

public class Doctor {
    private String doctorId;
    private String doctorName;
    private String doctorSpecialization;
    private boolean doctorAvailability;

    Doctor(String doctorId, String doctorName, String doctorSpecialization, boolean doctorAvailability) 
    {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorAvailability = doctorAvailability;
    }

    public String getDoctorId(){
        return doctorId;
    }   
    
    public String getDoctorName(){
        return doctorName;
    }

    public String getDoctorSpecialization(){
        return doctorSpecialization;
    }

    public boolean getDoctorAvailability(){
        return doctorAvailability;
    }

    public void setDoctorAvailability(boolean availability){
        this.doctorAvailability = availability;
    }
}
