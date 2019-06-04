import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] array = new int[10];
        for (int i=0;i<array.length;i++){
            int input = scanner.nextInt();
            array[i] = input;
        }
        for (int j =0;j<array.length;j++){
            System.out.println(array[j]);
        }

int index = minValue(array);
        System.out.println("the smallest element in the array is: " + array[index]);


    }
    public static int minValue(int []array){
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
