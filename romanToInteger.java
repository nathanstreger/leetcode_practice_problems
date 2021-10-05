import java.util.Stack;

public class romanToInteger {
    public int romanToInt(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case 'I': {
                    stack.push(1);
                    break;
                }
                case 'V': {
                    stack.push(5);
                    break;
                }
                case 'X': {
                    stack.push(10);
                    break;
                }
                case 'L': {
                    stack.push(50);
                    break;
                }
                case 'C': {
                    stack.push(100);
                    break;
                }
                case 'D': {
                    stack.push(500);
                    break;
                }
                case 'M': {
                    stack.push(1000);
                    break;
                }
            }
        }
        
        while (!stack.empty()) {
            int curr = stack.pop();
            
            if (!stack.empty() && (stack.peek() < curr)) {
                curr -= stack.pop();
            }
            res += curr;
        }
        
        return res;
    }
}
