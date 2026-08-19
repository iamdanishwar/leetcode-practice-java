class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(!stack.isEmpty() && x == stack.peek()){
                stack.pop();
            }
            else{
                stack.push(x);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();

    }
}