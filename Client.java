import java.util.List;
import java.util.Objects;

public class Client {
    private final String firstName;
    private final String lastName;
    private Gender gender;
    private final Date dateOfBirth;
    private List<Prescription> prescriptions;
    private String probationOfficer;
    private ColorGroup uaGroup;
    private boolean isJuvenile;
    private Supervision supervision;
    private CheckIn isCheckedIn;

    Client(String firstName, String lastName, String gender, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        setGender(gender);
        this.dateOfBirth = dateOfBirth;
    }

    //getters
    public String getNameFirstLast() {
        return firstName + " " + lastName;
    }

    public String getNameLastFirst() {
        return lastName + ", " + firstName;
    }

    public String getGender() {
        if (gender == Gender.FEMALE) {
            return "Female";
        }
        else if (gender == Gender.MALE) {
            return "Male";
        }
        return "";
    }

    public String getProbationOfficer() {
        return probationOfficer;
    }

    //setters
    public void setGender(String gender) {
        if (Objects.equals(gender, "Male")) {
            this.gender = Gender.MALE;
        }
        else if (Objects.equals(gender, "Female")) {
            this.gender = Gender.FEMALE;
        }
        else {
            this.gender = Gender.OTHER;
        }
    }
    public void assignProbationOfficer(String probationOfficer) {
        this.probationOfficer = probationOfficer;
    }
    public void assignColor(String color)
    {
        switch (color) {
            case "Blue" -> uaGroup = ColorGroup.BLUE;
            case "Yellow" -> uaGroup = ColorGroup.YELLOW;
            case "Pink" -> uaGroup = ColorGroup.PINK;
            case "Green" -> uaGroup = ColorGroup.GREEN;
        }
    }

    public void clearCheckInStatus() {
        isCheckedIn = CheckIn.NOT_APPLICABLE;
    }

    public void checkInClient() {
        isCheckedIn = CheckIn.YES;
    }

    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    enum Supervision {
        FORMAL,
        PRE_TRIAL,
        DRUG_COURT,
        MENTAL_HEALTH_COURT,
        DEFERRED_PROSECUTION
    }

    enum CheckIn {
        YES,
        NO,
        NOT_APPLICABLE
    }
}
