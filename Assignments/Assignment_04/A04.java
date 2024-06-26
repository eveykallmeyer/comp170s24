public class A04 {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
    } // method main

    public static void printOddCharacters(String string) {
        for (int i=1; i < string.length(); i += 2) { // go through every other character in the string starting at the second letter
            System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    } // method printOddCharacters

    public static void printEvenCharacters(String string) {
        for (int i=0; i < string.length(); i += 2) { // go through every other character in the string starting at the first letter
        System.out.print(string.charAt(i) + " ");
        }
        System.out.println();
    } // method printEvenCharacters
}
