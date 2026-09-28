class Solution {
    public boolean NumberHasEven(int num){
        int Digitcount=0;
        while(num!=0){
            num= num/10;
            Digitcount++;
        }
        return Digitcount%2==0;

    }
    public int findNumbers(int[] nums) {
        int evenCount =0;
        for(int i=0; i<nums.length;i++){
            if(NumberHasEven(nums[i])){
                evenCount++;
            }
        }
        return evenCount;
        
    }
}