package HospitalPlus_Patient_Management_System_2;

public class AppointmentReportImpl implements IReportGenerator {
    private Appointment appointment;

    public AppointmentReportImpl(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public void generateReport() {
        System.out.println("---- Appointment Report ----");
        System.out.println("Appointment ID: " + appointment.getAppointmentId());
        System.out.println("Doctor: " + appointment.getDoctor().getDoctorName());
        System.out.println("Patient: " + appointment.getPatient().getPatientName());
        System.out.println("Date: " + appointment.getAppointmentDate());
        System.out.println("Time: " + appointment.getAppointmentTime());
        System.out.println("Status: " + appointment.getAppointmentStatus());
    }
}
