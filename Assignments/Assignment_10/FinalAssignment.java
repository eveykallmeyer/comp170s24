import java.util.Arrays;

public class FinalAssignment {


    
    // MAIN METHOD
    //create the arrays and a string for each problem, and to implement the merge, reverse, and simpleSort methods.
    public static void main(String[] args) {

        // Array #1 for merge method: Ages of my cousins on my mom's side
        int[] left = new int [] {12, 17};
        int momsCousinsLength = left.length;

        // Array #2 for merge method: Ages of my cousins on my dad's side
        int[] right = new int [] {2, 9, 10, 22, 25};
        int dadsCousinsLength = right.length;

        // Array #3 for merge method: Merged array with all of my cousin's ages
        int[] cousinsAges = merge(left, right, momsCousinsLength, dadsCousinsLength);

        // Test merge method
        System.out.println("My cousins on my mom's side are the following ages: " + Arrays.toString(left));
        System.out.println("My cousins on my dad's side are the following ages: " + Arrays.toString(right));
        System.out.println("My cousins, in order from youngest to oldest, are the following ages:" + Arrays.toString(cousinsAges));


        // String for reverse method
        String reverseTestString = "lollapalooza";
        String reverseTestResult = reverse(reverseTestString);

        // Test reverse method
        System.out.println(reverseTestString + " spelled backwards is " + reverseTestResult);


        // Test simpleSort method


    }



    // MERGE METHOD
    // create a single sorted array that was merged from merge two original arrays.
    public static int[] merge(int[] left, int[] right, int momsCousinsLength, int dadsCousinsLength) {

        int[] cousinsAges = new int[momsCousinsLength + dadsCousinsLength];
        int i=0, j=0, k=0;

        while (i < momsCousinsLength && j < dadsCousinsLength) {
            if (left[i] <= right[j]) {
                cousinsAges[k++] = left[i++];
            } else {
                cousinsAges[k++] = right[j++];
            }
        }

        while (i < momsCousinsLength) {
            cousinsAges[k++] = left[i++];
        }

        while (j < dadsCousinsLength) {
            cousinsAges[k++] = right[j++];
        }

        return cousinsAges;
    }



    // REVERSE METHOD
    // return the reverse of a string.
    public static String reverse(String reverseTestString){

        if (reverseTestString == null || reverseTestString.isEmpty()) {
            return reverseTestString;
        }

        int reverseTestStringLength = reverseTestString.length();
        char[] reverseTestChars = new char[reverseTestStringLength];

        for (int i = 0; i < reverseTestStringLength; i++) {
            char currentChar = reverseTestString.charAt(reverseTestStringLength - 1 - i);
            reverseTestChars[i] = currentChar;
        }
        return new String(reverseTestChars);
    }



    // SIMPLESORT METHOD
    // return an array in its ascending order
}