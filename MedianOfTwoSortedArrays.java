class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] medianArray = new int[size];
        int medianArrayIndex = 0;
        int nums1Index = 0;
        int nums2Index = 0;
        
        while(nums1Index < nums1.length && nums2Index < nums2.length){
            if(nums1[nums1Index] < nums2[nums2Index]){
                medianArray[medianArrayIndex] = nums1[nums1Index];
                nums1Index++;
            }else{
                medianArray[medianArrayIndex] = nums2[nums2Index];
                nums2Index++;            
            }
            medianArrayIndex++;
        }
        
        //fill the array with the rest of the array that is longer
        for(int index = nums1Index; index < nums1.length; index++){
            medianArray[medianArrayIndex] = nums1[index];
            medianArrayIndex++;
        }
        
        for(int index = nums2Index; index < nums2.length; index++){
            medianArray[medianArrayIndex] = nums2[index];
            medianArrayIndex++;
        }
        
        //if its even
        if(size%2==0){
            return (medianArray[(size/2)-1] + medianArray[size/2]) / 2.0;
        }
        return medianArray[size/2];
        
    }
}
