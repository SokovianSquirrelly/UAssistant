import java.util.List;

public class Substance {
    private final String abbreviation;
    private final String drugName;
    private boolean isPrescribed;
    private List<String> commonNames;

    Substance(String abbreviation, String drugName) {
        this.abbreviation = abbreviation;
        this.drugName = drugName;
    }

    public String getAbbreviation() { return abbreviation; }

    public String getDrugName() { return drugName; }
}
