public class SubstanceReport {
    private Substance substance;
    private boolean isDeclaredRx;
    private String prescriptionName;
    private boolean hasVoluntarilyAdmitted;
    private Date dateLastTaken;

    public String displayPositiveSubstance() {
        return substance.getAbbreviation();
    }

    public String displayVoluntaryAdmission() {
        if (!hasVoluntarilyAdmitted) {
            return "No";
        }
        else {
            return "Yes - " + dateLastTaken.getDateAmericanFormat();
        }
    }
}
