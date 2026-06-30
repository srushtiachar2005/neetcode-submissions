class Solution {
    public int totaldays(int[] w,int capacity){
        int days=1;
        int load=0;

        for(int i=0;i<w.length;i++){
            if(load+w[i]>capacity){
                days=days+1;
                load=w[i];
            }else{
                load+=w[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }

        while(low<=high){
            int mid=(low+high)/2;
            int totaldays=totaldays(weights,mid);
            if(totaldays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}