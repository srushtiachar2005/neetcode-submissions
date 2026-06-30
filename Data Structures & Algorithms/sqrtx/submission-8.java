class Solution {
    public int mySqrt(int x) {
        /*int ans=0;
        for(int i=1;i<=x;i++){
            if(i<=x/i){
                ans=i;
            }else{
                break;
            }
        }
        return ans;*/
        int low=1;
        int high=x;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}