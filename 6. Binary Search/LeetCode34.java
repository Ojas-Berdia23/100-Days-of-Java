public class LeetCode34 {
    public static void main(String[] args) {
        int[] arr = {5 ,7 ,7 ,7 ,7 ,8 ,8, 10};
        int num = 7;
        int[] result = searchRange(arr, num);
        System.out.println(result[0]+ " " + result[1]);

    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                if(flag) {
                    ans[0] = i;
                }
                ans[1] = i;
            }
        }
        return ans;
    }
}
