
    import java.sql.SQLOutput;
    import java.util.Scanner;


    public class scanner {

        static long findEvenOdd(long number) {
            if (number % 2 == 0) {
                System.out.println(" number is even");
            }
            else {
                   System.out.println(" number is odd");
            }
            return number;
        }

        public static void main(String args[]) {
//creating Scanner class object
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number: ");
//reading value from the user
           // int num = scan.nextInt();
             long num = scan.nextLong();

            System.out.print(num);
//method calling
            long result =  findEvenOdd(num);
        }
    }