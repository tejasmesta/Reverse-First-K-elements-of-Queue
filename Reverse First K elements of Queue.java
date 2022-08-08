class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<k;i++)
        {
            st.push(q.poll());
        }
        
        Queue<Integer> ans = new LinkedList<>();
        
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }
        
        while(!q.isEmpty())
        {
            ans.add(q.poll());
        }
        
        return ans;
    }
}
