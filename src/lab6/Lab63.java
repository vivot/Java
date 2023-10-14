package lab6;

public class Lab63 {
    /* String myStr = "100 minutes";
     NOT using REGEX, extract digit character from that String
     Expected output: "100".
     EX: "12345nabc678" -> "12345678"*/
    public static void main(String[] args) {
        String myStr = "100 minutes";
        // Initalize new stringNumber
        String strNumber = removeNonDigits(myStr);
        System.out.println("Total minutes is: " + strNumber);

    }
// Add new method to extract number to new string
    public static String removeNonDigits(String myStr) {
        StringBuilder builder = new StringBuilder();
        // loop to add all number to a new string.
        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (Character.isDigit(c)) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}


