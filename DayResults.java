import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DayResults {
    private List<IndividualResults> testResults;
    private Set<ColorGroup> colorsCalled;
    private Date testDate;

    public List<Client> getNoShows()
    {
        List<Client> noShows = new ArrayList<>();
        for (IndividualResults testResult : testResults) {
            if (testResult.isANoShow()) {
                noShows.add(testResult.getClient());
            }
        }
        return noShows;
    }

    public List<Client> getFailuresToProduce()
    {
        List<Client> failuresToProduce = new ArrayList<>();
        for (IndividualResults testResult : testResults) {
            if (testResult.didFailToProduce()) {
                failuresToProduce.add(testResult.getClient());
            }
        }
        return failuresToProduce;
    }
}
