import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        //int [] numbers  = {3,2,4,1,8,6,-5,-7,-9};
        int [] numbers = {3,2,1};

        for(int i=0; i< numbers.length;i++){
            for(int j=1;j<numbers.length;j++){
                if(numbers[j] <numbers[j-1]){
                    int temp = numbers[j-1];
                    numbers[j-1] = numbers[j];
                    numbers[j]=temp;
                }
            }
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
