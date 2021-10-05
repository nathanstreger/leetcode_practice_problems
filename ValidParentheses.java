import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(': 
                case '{':
                case '[':
                {
                    stack.push(s.charAt(i));
                    break;
                }
                case ')': {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek() != '(') {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                    break;
                }
                case '}': {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek() != '{') {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                    break;
                }
                case ']': {
                    if (stack.empty()) {
                        return false;
                    }
                    if (stack.peek() != '[') {
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                    break;
                }
            }
        }
        
        return stack.empty();
    }
}
