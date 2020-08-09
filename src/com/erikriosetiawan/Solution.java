import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] sortedACharArray = sort(a.toLowerCase().toCharArray());
        char[] sortedBCharArray = sort(b.toLowerCase().toCharArray());
        
        // Sorting the array of char and convert into String
        String aResult = String.valueOf(sortedACharArray);
        String bResult = String.valueOf(sortedBCharArray);

        // Compare the String
        // return true if equals
        // else return false
        if (aResult.equalsIgnoreCase(bResult))
            return true;
        else return false;    
    }

    // Method to sorting the array of char
    static char[] sort(char[] charArray) {
        char[] sortedCharArray = charArray;

        for (int i = 0; i < sortedCharArray.length - 1; i++) {
            for (int j = 0; j < sortedCharArray.length - i - 1; j++) {
                if (sortedCharArray[j] > sortedCharArray[j + 1]) {
                    char swap = sortedCharArray[j];
                    sortedCharArray[j] = sortedCharArray[j + 1];
                    sortedCharArray[j + 1] = swap;
                }
            }
        }

        return sortedCharArray;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
