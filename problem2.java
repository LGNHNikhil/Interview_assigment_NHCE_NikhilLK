public class problem2 {
    public static void zerotolast(int[] nums) {
        int temp = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[temp] = i;
                temp++;
            }
        }
        while (temp < nums.length) {
            nums[temp] = 0;
            temp++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 4, 21};
        zerotolast(nums);
        System.out.print("Example: ");
        for (int n : nums) {
            System.out.print(n + " ");
        }

    }
}
