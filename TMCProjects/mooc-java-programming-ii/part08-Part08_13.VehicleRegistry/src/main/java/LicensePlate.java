
public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    public boolean equals(Object comparedObject) {
        if (!(comparedObject instanceof LicensePlate)) {
            return false;
        }

        LicensePlate comparedLicensePlate = (LicensePlate) comparedObject;
        if (this.liNumber.equals(comparedLicensePlate.liNumber) && this.country.equals(comparedLicensePlate.country)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int liNumberHash = liNumber.hashCode();
        int countryNumberHash = country.hashCode();
        return liNumberHash + countryNumberHash;
    }


}
