class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        int[] freq=new int[26];

        for(char a:tasks){
            freq[a-'A']++;
        }

        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }
       
        int time=0;
        while(!pq.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int cycle=n+1;
            while(cycle>0 && !pq.isEmpty()){
                int count=pq.poll();
                count--;
                if(count>0){
                    list.add(count);
                }
                time++;
                cycle--;
            }

            for(int x:list){
                pq.offer(x);
            }

            if(!pq.isEmpty()){
                time+=cycle;
            }
        }
        return time;
    }
}
