import java.util.*;
import java.io.*;
class jalan2 {
    public static void main(String[] args){
        int[] nums={-3, 1, 2, 4, -6, 8, -8, -1};
        ArrayList<Integer> A = new ArrayList<>();  
        ArrayList<Integer> B = new ArrayList<>();

        for(int i : nums){
            if(i > 0){
                A.add(i);
            } else{
                B.add(i);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = A.get(i/2);
            }else{
                nums[i] = B.get(i/2);
            }
        }
        for (int i=0; i<nums.length; i++){
            System.out.print(nums[i] +",");
        }
    }
}