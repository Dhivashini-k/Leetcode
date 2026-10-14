class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 ;
        double avg = 0.0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        avg = (double) sum /k;
        //int  l =0;
        double maxAvg = avg;

        for(int r = k; r< nums.length ; r++){
            sum += nums[r];
            sum -= nums[r - k];
            //l++;
            avg = (double) sum / k;
            maxAvg = Math.max(avg , maxAvg);
        }
        return maxAvg;
    }
}