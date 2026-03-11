/**
 * OOPSBannerApp
 *
 * UC6: Use static helper methods to generate
 * ASCII patterns for characters O, P, and S.
 *
 * @author swapnanil
 * @version 6.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[][] word = { getO(), getO(), getP(), getS() };

        for (int i = 0; i < 7; i++) {
            for (String[] letter : word) {
                System.out.print(letter[i] + "   ");
            }
            System.out.println();
        }
    }

    static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] getP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
