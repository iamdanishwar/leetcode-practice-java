class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int answer[] = new int[temperatures.length];
        Stack<Integer> mystack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!mystack.empty() && temperatures[mystack.peek()] < temperatures[i]){
                int pop = mystack.pop();
                answer[pop] = i - pop;
            }
            mystack.push(i);
        }
            return answer;
    }
}