public class p56 {
    public static void main(String[] args) {
        // Create two strings
        String str1 = "Hello";
        String str2 = "World";

        // a. Display the length
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        // b. Concatenate two strings
        String concatenatedString = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenatedString);

        // c. Check whether the strings are equal, startsWith(), and endsWith() methods
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal? " + areEqual);
        System.out.println("Does String 2 start with 'W'? " + str2.startsWith("W"));
        System.out.println("Does String 2 end with 'ld'? " + str2.endsWith("ld"));

        // d. Display the character at the 5th position of the first string
        char charAt5 = str1.charAt(4);
        System.out.println("Character at 5th position in String 1: " + charAt5);

        char[] charArray = new char[5];
        str1.getChars(0, 5, charArray, 0);
        System.out.println("Characters using getChars(): " + new String(charArray));

        char[] charArray2 = str1.toCharArray();
        System.out.println("Characters using toCharArray(): " + charArray2[4]);

        // e. Searching String using methods indexOf() and lastIndexOf()
        int indexOfW = str1.indexOf('W');
        System.out.println("Index of 'W' in String 1: " + indexOfW);

        int lastIndexOfL = str1.lastIndexOf('l');
        System.out.println("Last index of 'l' in String 1: " + lastIndexOfL);

        // f. Replaces all occurrences of one character in the invoking string
        String replacedString = str1.replaceAll("l", "L");
        System.out.println("String 1 after replacing 'l' with 'L': " + replacedString);

        // g. Find the total allocated capacity of the first string
        StringBuffer sb = new StringBuffer(str1);
        int capacity = sb.capacity();
        System.out.println("Total allocated capacity of String 1: " + capacity);
    }
}
