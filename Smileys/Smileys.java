
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beere");
        printWithSmileys("face");
    }

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";
        int length = characterString.length();
        int texteven = length;
        int textodd = length + 1;
        if (characterString.length() % 2 == 1) {
            printSmileyLine(textodd);
            System.out.println(smiley + " " + characterString + "  " + smiley);
            printSmileyLine(textodd);
        } else {
            printSmileyLine(texteven);
            System.out.println(smiley + " " + characterString + " " + smiley);
            printSmileyLine(texteven);
        }
    }

    private static void printSmileyLine(int length) {
        String smiley = ":)";
        if (length <= 4) {
            for (int i = 0; i < length + 1; i++) {
                System.out.print(smiley);
            }
            System.out.println("");
        } else {
            for (int j = 0; j < length; j++) {
                System.out.print(smiley);
            }
            System.out.println("");
        }
    }
}
