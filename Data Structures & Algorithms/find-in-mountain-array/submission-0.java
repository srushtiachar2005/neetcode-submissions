/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int low=0;
        int n=mountainArr.length();
        int high=n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                low=mid+1;
            }else{
                high=mid;
            }
        }

        int peak=low;
        int ans=findAscending(mountainArr,0,peak,target);
        if(ans!=-1){
            return ans;
        }

        return findDescending(mountainArr,peak+1,n-1,target);
    }
    private int findAscending(MountainArray mountainArr,int low, int high,int target){
        
        while(low<=high){
            int mid=(low+high)/2;
            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    private int findDescending(MountainArray mountainArr, int low, int high,int target){
        while(low<=high){
            int mid=(low+high)/2;

            if(mountainArr.get(mid)==target){
                return mid;
            }else if(mountainArr.get(mid)>target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}