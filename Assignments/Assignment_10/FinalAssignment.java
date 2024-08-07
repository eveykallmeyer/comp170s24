import java.util.Arrays;

public class FinalAssignment {

    // main method to create the arrays and a string for each problem, and to implement the merge, reverse, and simpleSort methods.
    public static void main(String[] args) {

        // Ages of my cousins on my mom's side
        int[] left = new int [] {11, 14, 16, 17};
        int momsCousinsLength = left.length;

        // Ages of my cousins on my dad's side
        int[] right = new int [] {9, 10, 22, 25};
        int dadsCousinsLength = right.length;

        // Merged array with all of my cousin's ages
        int[] cousinsAges = merge(left, right, momsCousinsLength, dadsCousinsLength);

        // Test merge method
        System.out.println("My cousins on my mom's side are the following ages: " + Arrays.toString(left));
        System.out.println("My cousins on my dad's side are the following ages: " + Arrays.toString(right));
        System.out.println("My cousins, in order from youngest to oldest, are the following ages:" + Arrays.toString(cousinsAges));

        // Test reverse method


        // Test simpleSort method


    }

    // merge method to create a single sorted array that was merged from merge two original arrays.
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

    // reverse method to return the reverse of a string.


    // simpleSort method to return an array in its ascending order
}