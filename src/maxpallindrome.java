
import java.util.Scanner;


public class maxpallindrome {

        private static String findLongestPalindromicSubstring(String input) {
            if(input.isEmpty()) {
                return "";
            }
            int n = input.length();
            int longestSoFar = 0, startIndex = 0, endIndex = 0;
            boolean[][] palindrom = new boolean[n][n];

            for(int j = 0; j < n; j++) {
                System.out.println("j");
                System.out.println(j);
                palindrom[j][j] = true;
                System.out.println(palindrom[j][j]);
                for(int i = 0; i < j; i++) {
                    System.out.println("i");
                    System.out.println(i);
                    System.out.println(palindrom[i+1][j-1]);
                    System.out.println("if condition");
                    System.out.println(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1]));
                    if(input.charAt(i) == input.charAt(j) && (j-i <= 2 || palindrom[i+1][j-1])) {
                        palindrom[i][j] = true;
                        if(j-i+1 > longestSoFar) {
                            longestSoFar = j-i+1;
                            System.out.println("longestSoFar");
                            System.out.println(longestSoFar);
                            startIndex = i;
                            endIndex = j;
                        }
                    }
                }
            }
            System.out.println("input.substring(startIndex, endIndex+1)");
            System.out.println(input.substring(startIndex, endIndex+1));
            return input.substring(startIndex, endIndex+1);
        }
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            String input = keyboard.next();
            System.out.println(findLongestPalindromicSubstring(input));
        }

}
