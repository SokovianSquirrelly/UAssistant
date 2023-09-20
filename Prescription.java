public class Prescription {
    private Substance substance;
    private String nameOfMedication;
    private String dosage;
    private Date prescribedDate;
    private Date endDate;

    public String getPrescribedDate() {
        return prescribedDate.getDateAmericanFormat();
    }
}
