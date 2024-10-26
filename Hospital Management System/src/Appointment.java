import java.util.Date;

 class Appointment {

        private String appointmentId;
        private String patientId;
        private String doctorId;
        private Date appointmentDate;

        public Appointment(String appointmentId, String patientId, String doctorId, Date appointmentDate) {
            this.appointmentId = appointmentId;
            this.patientId = patientId;
            this.doctorId = doctorId;
            this.appointmentDate = appointmentDate;
        }

        public String getAppointmentId() {
            return appointmentId;
        }

        public String getPatientId() {
            return patientId;
        }

        public String getDoctorId() {
            return doctorId;
        }

        public Date getAppointmentDate() {
            return appointmentDate;
        }

        public void scheduleAppointment() {
            System.out.println("Scheduling appointment...");
            System.out.println("appointment Id"+getAppointmentId());
            System.out.println("appointment Date"+getAppointmentDate());

        }


}
