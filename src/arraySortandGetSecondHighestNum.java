public class arraySortandGetSecondHighestNum
{

    public static void main(String[] args)
    {
            int[] a = {-6,-3,-7,-2};
            int temp=0;
            for(int i=1;i<a.length;i++)
             {

                 for(int j=i;j>0;j--)
                 {
                     if(a[j]<a[j-1])
                     {
                         temp = a[j];
                         a[j] = a[j - 1];
                         a[j-1]=temp;
                     }
                 }
             }
           for(int i=0;i<a.length;i++)
           {

               System.out.println(a[i]);
           }

        for(int i=a.length-1; i>0; i--)
        {
            System.out.println("for");
            if (a[i]==a[i-1])
            {
                System.out.println("if");
                System.out.println(a[i]);
                continue;
            }
            else
                {
                    System.out.println("else");
                    System.out.println(a[i-1]);
                    break;
               }
        }
//           int length = a.length;
//           System.out.println("second highest number is");
//           System.out.println(a[length-2]);


    }

}
