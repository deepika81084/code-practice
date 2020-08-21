import java.util.Scanner;

public class pallindrome {

           public static void main(String[] args)
           {
               int number,rem;
               int result=0;
               int temp;
               System.out.println("enter number:");
               Scanner scan = new Scanner(System.in);
               number = scan.nextInt();
               System.out.println(number);

               temp = number;

               while(number>0)
               {
                   rem = number%10;
                   System.out.println(rem);
                   number = number/10;
                   System.out.println(number);
                   result = result*10+rem;
                   System.out.println(result);

               }
               if(temp==result){
                   System.out.println("number is plaindrome");
               }
               else{
                   System.out.println("number is not palindrome");
               }




           }
}
