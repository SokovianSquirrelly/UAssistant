import java.util.List;

public class IndividualResults {
    private Client client;
    private TestResults testResults;
    private List<SubstanceReport> positiveSubstances;
    private boolean isDiluteSample;
    private boolean isLessThanTwentyML;
    private boolean wasSentToLab;

    public void reportNegative() {
        testResults = TestResults.NEGATIVE;
        positiveSubstances = null;
    }

    public void reportNoShow() {
        testResults = TestResults.NO_SHOW;
        positiveSubstances = null;
        isDiluteSample = false;
        isLessThanTwentyML = false;
        wasSentToLab = false;
    }

    public void reportFailureToProduce() {
        testResults = TestResults.FAILED_TO_PRODUCE;
        positiveSubstances = null;
        isDiluteSample = false;
        isLessThanTwentyML = false;
        wasSentToLab = false;
    }

    enum TestResults {
        NEGATIVE,
        NO_SHOW,
        FAILED_TO_PRODUCE,
        POSITIVE
    }
}
