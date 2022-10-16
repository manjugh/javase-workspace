import java.util.Arrays;

/*

Rearrange Positive & Negative Values
 */
public class RearrangeValues {

    public static void main(String[] args) {
        //rearragneWithoutOrder();
        rearrangeWithOrder();
    }

    private static void rearrangeWithOrder(){
        //int [] numbers = {4,5,6,-9};
        int [] numbers = {4,5,6,-9,8,-5,-3};
        int j=0;
        int k=0;

        for(int i=0; i<=numbers.length-1;i++){
            if(numbers[i] <0){

                int temp = numbers[i];
                //shifting arrayo to the left

                for(k=i; k>j; k-- ){
                    numbers[k] = numbers[k-1];
                }
                numbers[j] = temp;
                j++;
            }
        }

        Arrays.stream(numbers).forEach(System.out::println);

    }

    private static void rearragneWithoutOrder() {
        int [] numbers = {4,5,6,-9,8,-5,-3};
        int j = 0;
        for (int i=0; i<=numbers.length-1;i++){
            int temp = numbers[i];
            if(temp < 0){
                if(i!=j){
                    numbers[i] = numbers[j];
                    numbers[j]=temp;
                }
                j++;
            }

        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
