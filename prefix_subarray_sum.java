public class prefix_subarray_sum {
    public static void prefix_max_array(int nums[]) {
        int current_sum = 0;
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (max < current_sum) {
                    max = current_sum;
                }
            }
        }
        System.out.println("max array is :" + max);
    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefix_max_array(arr);
    }

}
