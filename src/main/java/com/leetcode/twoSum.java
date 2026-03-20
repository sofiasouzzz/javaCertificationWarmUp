import java.util.ArrayList;
import java.util.List;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};

        int target = 9;

        twoSum(nums, target);
    }
public static void twoSum(int[] nums, int target) {
 for(int i = 0; i < nums.length; i++){

            for(int j = i + 1; j < nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    int[]result = new int[]{i, j};
                    System.out.println(result);
                }
            
            }
        }
}}