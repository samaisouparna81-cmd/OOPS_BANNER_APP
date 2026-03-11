/**
 * OOPSBannerApp
 *
 * UC7: Store character patterns in a class
 * for better modularity and scalability.
 *
 * @author swapnanil
 * @version 7.0
 */
public class OOPSBannerApp {

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = { o, o, p, s };

        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[i] + "   ");
            }
            System.out.println();
        }
    }
}
