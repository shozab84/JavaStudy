package dayOne.primitive;

/**
 * Created by student on 22-Aug-16.
 */
public class ArrayExercise3 {

    // commonEnd example
    public static void main (String[] args){

        int[] test1 = {1,2,3};
        int[] test2 = {7,3,2};
        System.out.println(commonEnd(test1,test2));// outputting result

    }

    static boolean commonEnd(int [] nums1, int[] nums2){

        return( (nums1[0] == nums2[0]) || ((nums1[nums1.length-1] == (nums2[nums2.length-1]) )) );


    }

}
