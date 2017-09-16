/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosum;

/**
 *
 * @author rsunb
 */
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        //test the array
        twoSum(nums, target);
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] answerArray = new int[2];
        int sum; //target - nums[i], the second input to the addition problem
        for(int i=0; i< nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(j!=i){
                    sum = nums[i] + nums[j];
                    if(sum==target){
                        answerArray[0] = i;
                        answerArray[1] = j;
                    }
                }
            }
        } 
        return answerArray;
    }
}
