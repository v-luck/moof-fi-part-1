
public class Main {

    public static void main(String[] args) {
        SimpleDate d = new SimpleDate(1,2,2000);
        System.out.println(d.equals("Heh"));
        System.out.println(d.equals(new SimpleDate(5,2,2012)));
        System.out.println(d.equals(new SimpleDate(1,2,2000)));
    }
}
