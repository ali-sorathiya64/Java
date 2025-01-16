import java.util.Scanner;

public class array_reverse {

    public static void reverse_an_array(int nums[]) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number[] = { 55, 54, 53, 52 };

        reverse_an_array(number);
        for (int i = 0; i <= number.length; i++) {
            System.out.println("value is : " + number[i]);

        }

    }

}