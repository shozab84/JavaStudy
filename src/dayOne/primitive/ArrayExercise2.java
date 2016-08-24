package dayOne.primitive;

/**
 * Created by student on 22-Aug-16.
 */
public class ArrayExercise2 {

    //same first last

    public static void main (String[] args) {

        // declaring an array
        int[] test = {3, 2, 3};
        System.out.println(sameFirstLast(test));// outputing the result by running the method

    }

        static boolean sameFirstLast(int[] nums) {
            return ((nums.length >= 1) && (nums[0] == nums[nums.length - 1])); // here is the logic
        }
    }







