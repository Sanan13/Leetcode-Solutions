class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++) {
            char currentchar = s.charAt(i);
            if(currentchar=='(' || currentchar=='{' || currentchar=='[')
                stack.push(currentchar);
            else if (stack.isEmpty()) 
                return false;
            else if(!isMatching(stack.peek(),currentchar))
                return false;
            else
                stack.pop();
        }
        return stack.isEmpty();
    }
    boolean isMatching(char a, char b) {
        return (a=='(' && b==')') ||
               (a=='{' && b=='}') ||
               (a=='[' && b==']');
    }
}