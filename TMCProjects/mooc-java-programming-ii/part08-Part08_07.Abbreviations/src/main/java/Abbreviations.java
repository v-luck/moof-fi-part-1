import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationkey;
    public Abbreviations() {
        abbreviationkey = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (!hasAbbreviation(abbreviation)) {
            abbreviationkey.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (abbreviationkey.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (abbreviationkey.containsKey(abbreviation)) {
            return abbreviationkey.get(abbreviation);
        } else {
            return null;
        }
    }


}
