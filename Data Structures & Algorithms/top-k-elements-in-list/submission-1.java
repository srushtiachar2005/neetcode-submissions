class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] ans=new int[k];

        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i).getKey();
        }
        return ans;*/
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            pq.offer(new int[]{entry.getValue(),entry.getKey()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        {
            res[i]=pq.poll()[1];
        }
        return res;
    }
}
