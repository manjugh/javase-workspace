import java.util.Arrays;

public class AnagramExample {
    public static void main(String[] args) {
        String str1 = "events";
        String str2 = "steven";

        char[] strChar1 = str1.toCharArray();
        char[] strChar2 = str2.toCharArray();
        Arrays.sort(strChar1);
        Arrays.sort(strChar2);
        if(Arrays.equals(strChar1,strChar2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
