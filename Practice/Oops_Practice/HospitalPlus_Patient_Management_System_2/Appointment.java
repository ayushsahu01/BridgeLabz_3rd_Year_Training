package HospitalPlus_Patient_Management_System_2;

public class Appointment {
    private String appointmentId;
    private Doctor doctor;
    private Patient patient;
    private String appointmentDate;
    private String appointmentTime;
    private String appointmentStatus;

    Appointment(String appointmentId, Doctor doctor, Patient patient, String appointmentDate, String appointmentTime, String appointmentStatus) 
    {
        this.appointmentId = appointmentId;
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentStatus = appointmentStatus;
    }

    public String getAppointmentId(){
        return appointmentId;
    }
    public Doctor getDoctor(){
        return doctor;
    }
    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }
    public Patient getPatient(){
        return patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }
    public String getAppointmentDate(){
        return appointmentDate;
    }
    public void setAppointmentDate(String date){
        this.appointmentDate = date;
    }
    public String getAppointmentTime(){
        return appointmentTime;
    }
    public void setAppointmentTime(String time){
        this.appointmentTime = time;
    }
    public String getAppointmentStatus(){
        return appointmentStatus;
    }
    public void setAppointmentStatus(String status){
        this.appointmentStatus = status;
    }

    public void CreateAppointment(){
        this.appointmentStatus = "Scheduled";
        System.out.println("Appointment Created Successfully");
    }

    public void CancelAppointment(){
        this.appointmentStatus = "Cancelled";
        System.out.println("Appointment Cancelled Successfully");
    }

    public void RescheduleAppointment(String newDate, String newTime){
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        this.appointmentStatus = "Rescheduled";
        System.out.println("Appointment Rescheduled Successfully");
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + 
                "\nDoctor: " + doctor.getDoctorName() + 
                "\nPatient: " + patient.getPatientName() + 
                "\nDate: " + appointmentDate + 
                "\nTime: " + appointmentTime + 
                "\nStatus: " + appointmentStatus;
    }
}
