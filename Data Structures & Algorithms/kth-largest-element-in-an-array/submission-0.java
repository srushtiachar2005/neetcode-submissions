class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int a:nums){
            pq.offer(a);
        }

        int ans=-1;
        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }
        return ans;

    }
}
