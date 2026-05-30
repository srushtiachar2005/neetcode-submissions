class Solution {
    public int lastStoneWeight(int[] stones) {
        
        List<Integer> list=new ArrayList<>();
        for(int a:stones){
            list.add(a);
        }

        while(list.size()>1)
        {
            Collections.sort(list);
            int a=list.remove(list.size()-1);
            int b=list.remove(list.size()-1);

            list.add(Math.abs(a-b));
        }
        return list.get(0);
    }
}
