class Medication {
    private String medicationName;
    private int quantity;

    public Medication(String medicationName, int quantity) {
        this.medicationName = medicationName;
        this.quantity = quantity;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void prescribeMedication() {
        System.out.println("Prescribing medication: " + getMedicationName());
    }
}

class Treatment {
    private String treatmentName;
    private String patientId;

    public Treatment(String treatmentName, String patientId) {
        this.treatmentName = treatmentName;
        this.patientId = patientId;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void applyTreatment() {
        System.out.println("Applying treatment: " + getTreatmentName());
    }
}
