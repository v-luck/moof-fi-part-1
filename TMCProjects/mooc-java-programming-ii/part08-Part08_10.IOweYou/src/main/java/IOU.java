import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> rememberer;
    public IOU() {
        rememberer = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        if (rememberer.containsKey(toWhom)) {
            rememberer.remove(toWhom);
        }
        rememberer.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return (rememberer.getOrDefault(toWhom, 0.0));
    }
}
