class Solution {
    public int func(int[] piles, int hour){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total += (piles[i] + hour - 1) / hour;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int n:piles){
            high=Math.max(high,n);
        }

        while(low<=high){
            int mid=(low+high)/2;

            int totalhrs=func(piles,mid);
            if(totalhrs<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}
