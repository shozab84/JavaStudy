package dayOne.primitive;

/**
 * Created by student on 22-Aug-16.
 */
public class ArraysExercise1 {
    public static void main(String[] args){
            int[] test = {3,2,1};
            System.out.println(firstLast6(test));

    }

    static boolean firstLast6(int[] nums){
        return (nums[0] == 6)|| (nums[nums.length-1] ==6);
    }



}
