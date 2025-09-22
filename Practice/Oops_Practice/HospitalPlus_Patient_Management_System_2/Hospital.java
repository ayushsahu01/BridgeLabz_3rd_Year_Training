package HospitalPlus_Patient_Management_System_2;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("D001", "Dr. Smith", "Cardiology", true);
        Patient patient1 = new Patient("P001", "John Doe", 45);
        Appointment appointment1 = new Appointment("A001", doctor1, patient1, "2024-10-15", "10:00 AM", "Pending");
        appointment1.CreateAppointment();

        IReportGenerator patientReport = new PatientReportGeneratorImpl(patient1);
        IReportGenerator appointmentReport = new AppointmentReportImpl(appointment1);
        
        patientReport.generateReport();
        appointmentReport.generateReport();
    }
}
