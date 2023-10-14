package lab6;


public class Lab61 {
    /*
    *
Given input string: "2hrs and 5 minutes"
Please calculate how many minutes in total*/
    // cut chuoi by and

    public static void main(String[] args) {

        String giveNumber = "2hrs and 5 minutes";
        // Slit the string by add
        String[] arrayTime = giveNumber.split("and");
        // Initialize variables for hours and minutes
        int hours = 0;
        int minutes = 0;
        int totalMinutes = 0;
        // Process the array to find hours and minutes
        for (String t : arrayTime
        ) {
            //extract hours
            if (t.contains("hrs")) {
                String hrsPart = t.trim().replace("hrs", "");
                hours = Integer.parseInt(hrsPart.trim());
                // extract minutes
            } else if (t.contains("minutes")) {
                String miPart = t.trim().replace("minutes", "");
                minutes = Integer.parseInt(miPart.trim());

            }
        }
        totalMinutes = hours * 60 + minutes;
        System.out.printf("Total minutes is: %d%n", totalMinutes);

    }


}





