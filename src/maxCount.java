import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class maxCount {

    public static void main(String[] args) throws Exception {
        String line, word = "";
        int count = 0, maxCount = 0;
        ArrayList<String> words = new ArrayList<String>();
        line = "Apple is the most nutritional fruit and fruit fruit fruit doctor suggest to eat apple daily.An Apple a day keeps the doctor away";

        String string[] = line.toLowerCase().split(" ");
            //Adding all words generated in previous step into words
            for(String s : string) {
                words.add(s);
            }


        //Determine the most repeated word
        for(int i = 0; i < words.size(); i++){
            count = 1;
            //Count each word and store it in variable count
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    //System.out.println(words.get(i));
                    System.out.println(words.get(j));
                    count++;
                    System.out.println(count);
                }
            }
            //If maxCount is less than count then store value of count in maxCount
            //and corresponding word to variable word
            if(count > maxCount){
                maxCount = count;
                word = words.get(i);
            }
        }
        System.out.println("count " + count);
        System.out.println("Most repeated word: " + word);
    }

}
