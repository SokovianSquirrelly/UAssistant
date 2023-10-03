public class SubstanceReportAlcohol extends SubstanceReport{
    private boolean breathalyzerWasTaken;
    private float bloodAlcoholContent;

    @Override
    public String displayPositiveSubstance() {
        if (breathalyzerWasTaken) {
            return String.format("ETG - %b", bloodAlcoholContent);
        }
        return "ETG - No BAC Taken";
    }
}
