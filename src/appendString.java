public class appendString {

    public static void main(String[] args)
    {
        String s = "hellodev";
        String t = "hellodev";
        int k = 10;

        if (s.equals(t)) {
            System.out.println(s);
            System.out.println(t);
            String result =  (k >= s.length() * 2 || k % 2 == 0) ? "Yes" : "No";
            System.out.println(result);

        }
        int comlen = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (t.charAt(i) != s.charAt(i))
                break;
            comlen++;
        }

        System.out.println(comlen);
        int sDiff = s.length() - comlen;
        System.out.println(sDiff);
        int tDiff = t.length() - comlen;
        System.out.println(tDiff);
        int tot = sDiff + tDiff;
        System.out.println(tot);
   }
}
