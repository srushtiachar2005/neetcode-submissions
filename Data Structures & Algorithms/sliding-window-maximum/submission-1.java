class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0;
        int[] res=new int[nums.length-k+1];
        int ri=0;

        Deque<Integer> q=new ArrayDeque<>();
        while(r<nums.length)
        {
            while(!q.isEmpty() && nums[q.peekLast()]<nums[r])
            {
                q.pollLast();
            }

            q.offerLast(r);

            if((r-l+1)>k){
                if(q.peekFirst()==l){
                    q.pollFirst();
                }
                l++;
            }
            if ((r - l + 1) == k) {
                res[ri++] = nums[q.peekFirst()];
            }
            r++;

        }
        return res;
    }
}
