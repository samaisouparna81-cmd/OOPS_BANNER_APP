/**
 * OOPSBannerApp
 *
 * UC5: Use inline array initialization with String.join()
 * to create banner lines concisely.
 *
 * @author swapnanil
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", "*     *", "*     *", "*      ", "      *"),
                String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
