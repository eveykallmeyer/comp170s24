import java.util.Arrays;

public class FinalAssignment {


    // MAIN METHOD
    //create the arrays and a string to use in the respective problems, and to implement the merge, reverse, and simpleSort methods.
    public static void main(String[] args) {

        // Array #1 for merge method: Ages of my cousins on my mom's side
        int[] left = new int [] {12, 17};
        int momsCousinsLength = left.length; // determine length of the array

        // Array #2 for merge method: Ages of my cousins on my dad's side
        int[] right = new int [] {2, 9, 10, 22, 25};
        int dadsCousinsLength = right.length; // determine length of the array

        // Array #3 for merge method: Merged array with all of my cousin's ages in order from youngest to oldest
        int[] cousinsAges = merge(left, right, momsCousinsLength, dadsCousinsLength); // implement merge method

        // Test merge method
        System.out.println("PROBLEM #1 ANSWER:");
        System.out.println("My cousins on my mom's side are the following ages: " + Arrays.toString(left));
        System.out.println("My cousins on my dad's side are the following ages: " + Arrays.toString(right));
        System.out.println("My cousins, in order from youngest to oldest, are the following ages:" + Arrays.toString(cousinsAges)); // showcase merge method



        // String for reverse method
        String reverseTestString = "lollapalooza";
        String reverseTestResult = reverse(reverseTestString); // implement reverse method

        // Test reverse method
        System.out.println("\nPROBLEM #2 ANSWER:");
        System.out.println(reverseTestString + " spelled backwards is " + reverseTestResult); // showcase reverse method



        // Array for simpleSort method: Years the Summer Olympics has been hosted by the U.S.
        int[] summerOlympicsInAmerica = new int[] {1984, 1932, 1996, 1904};

        // Test simpleSort method
        System.out.println("\nPROBLEM #2 ANSWER:");
        System.out.println("The Summer Olympics have been held in The U.S. four times, during: " + Arrays.toString(summerOlympicsInAmerica));
        simpleSort(summerOlympicsInAmerica); // implement simpleSort method
        System.out.println("From earliest to most recent, the Summer Olympics were held in The U.S. during: " + Arrays.toString(summerOlympicsInAmerica)); // showcase simpleSort method
    }



    // MERGE METHOD
    // create a single sorted array that was merged from two original arrays.
    public static int[] merge(int[] left, int[] right, int momsCousinsLength, int dadsCousinsLength) {

        int[] cousinsAges = new int[momsCousinsLength + dadsCousinsLength]; // create an array merged from the original left and right arrays
        int i=0, j=0, k=0; // set all initial indexes to 0

        while (i < momsCousinsLength && j < dadsCousinsLength) {
            if (left[i] <= right[j]) {
                cousinsAges[k++] = left[i++]; // place age values from the left array into the new array if it is less than or equal to the age value in the right array
            } else {
                cousinsAges[k++] = right[j++]; // place age values from the right array into the new array if it is less than the age value in the left array
            }
        }

        while (i < momsCousinsLength) {
            cousinsAges[k++] = left[i++]; // add the rest of the age values from the left array into the merged array
        }

        while (j < dadsCousinsLength) {
            cousinsAges[k++] = right[j++]; // add the rest of the age values from the right array into the merged array
        }

        return cousinsAges; // return the final merged array in order from least to greatest
    }



    // REVERSE METHOD
    // return the reverse of a string
    public static String reverse(String reverseTestString) {

        if (reverseTestString == null || reverseTestString.isEmpty()) { // do not allow null or empty strings
            return reverseTestString;
        }

        int reverseTestStringLength = reverseTestString.length(); // determine length of the string
        char[] reverseTestChars = new char[reverseTestStringLength]; // create an array that will consist of the string reversed

        for (int i = 0; i < reverseTestStringLength; i++) { // move through the entire string letter by letter
            char currentChar = reverseTestString.charAt(reverseTestStringLength - 1 - i);
            reverseTestChars[i] = currentChar; // place the into the new array characters in reverse order one by one
        }
        return new String(reverseTestChars); // return the reversed string
    }



    // SIMPLESORT METHOD
    // return an array in its ascending order
    public static int[] simpleSort(int[] summerOlympicsInAmerica) { 

        int summerOlympicsInAmericaLength = summerOlympicsInAmerica.length; // determine length of the array
        int i = 0; // set initial index to 0

        while (i < summerOlympicsInAmericaLength - 1) {
            int earliestYear = i; // create a variable that represents the earliest year, which is also the smallest value
            int j = i + 1; // establish that the method should begin at the proceeding value in the array

            while (j < summerOlympicsInAmericaLength) {
                if (summerOlympicsInAmerica[j] < summerOlympicsInAmerica[earliestYear]) { // find the index of the smallest value in the array
                    earliestYear = j; // establish that if a smaller element is found the index needs to be changed as it reorders
                }
                j++; // move on to the next value in the array
            }

            if (earliestYear != i) {
                int reorder = summerOlympicsInAmerica[i]; // create a variable representing the beginning of the array
                summerOlympicsInAmerica[i] = summerOlympicsInAmerica[earliestYear]; // establish that the current year is then aslo the earliest year
                summerOlympicsInAmerica[earliestYear] = reorder; // establish that the earliest year then is now at the front of the array
            }
            i++; // move on to the next value in the array
        }
        return summerOlympicsInAmerica; // return the array in order from smallest to largest
    }

}