class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        int n = heights.length;

        for(int i=0;i<heights.length;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()] > heights[i])
            {   
                int elementIndex=stack.pop();
                int height=heights[elementIndex];
                int pse=stack.isEmpty()?-1:stack.peek();
                int nse=i;
                int width=nse-pse-1;
                maxArea=Math.max(maxArea,height*width);
            }
            stack.push(i);
        }

        while(!stack.isEmpty())
        {
            int elementIndex=stack.pop();
            int height=heights[elementIndex];
            int nse=n;
            int pse=stack.isEmpty()?-1:stack.peek();

            int width=nse-pse-1;

            maxArea=Math.max(maxArea,height*width);
            
        }
        return maxArea;
    }
}
