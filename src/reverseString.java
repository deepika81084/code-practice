import java.util.Scanner;

public class reverseString {

    public static void main(String args[])
    {
        String str;
        String revString="";
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        System.out.println(str);

        int len = str.length();
        System.out.println(len);
        for(int i=len-1;i>=0;i--)
        {
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);

    }

}
