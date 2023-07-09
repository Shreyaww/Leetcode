class MyQueue {

    Stack<Integer> stk = new Stack<>();
    Stack<Integer> stk1 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stk.add(x);
    }
    
    public int pop() {
        if(stk1.isEmpty()){
            while(!stk.isEmpty()){
                stk1.push(stk.pop());
            }
        }
        return stk1.pop();
    }
    
    public int peek() {
        if(stk1.isEmpty()){
            while(!stk.isEmpty()){
                stk1.push(stk.pop());
            }
        }
        return stk1.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty() && stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */