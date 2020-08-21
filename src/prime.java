import java.util.Scanner;

public class prime {
    public static void main(String[] args)
    {
        int number=0;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        if(number==0 || number==1)
        {
            System.out.println("number is not prime");
        }
        else
        {
            for(int i=2;i<number/2;i++)
            {
                if(number % i == 0)
                {
                    System.out.println("number is not prime");
                    count = count+1;
                    break;
                }
            }
            if(count==1)
            {
                System.out.println("number is not prime");
            }
            else
            {
                System.out.println("number is prime");
            }

        }

    }
}
