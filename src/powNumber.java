public class powNumber {

    public static void main(String[] args)
    {
        float a=2;
        int b=-1;
        float temp=1;

        if(b==0)
        {
            System.out.println("1");
        }
        if(b>0)
        {
            for (int i = 1; i <= b; i++)
            {
                temp = temp * a;
            }
            System.out.println(temp);
        }
        if(b<0)
        {
            b=b*-1;
            System.out.println(b);
            a=1/a;
            System.out.println(a);
            for(int i=1;i<=b;i++)
            {
                temp=temp*a;
            }
            System.out.println(temp);
        }

    }
}
