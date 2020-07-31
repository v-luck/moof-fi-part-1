
public class Program {

    public static void main(String[] args) {
        Timer dogg = new Timer();
        while (true) {
            System.out.println(dogg);
            dogg.advance();

            try {
                Thread.sleep(200);
            } catch (Exception e) {

            }
        }


    }
}
