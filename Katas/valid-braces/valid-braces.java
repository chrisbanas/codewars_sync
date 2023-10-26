import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {
        char first = braces.charAt(0);
        if (first == ']' || first == '}' || first == ')') return false;

        char last = braces.charAt(braces.length() - 1);
        if (last == '[' || last == '{' || last == '(') return false;

        Stack<Character> stack = new Stack<>();

        for (char c : braces.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '[' && closing == ']') ||
               (opening == '{' && closing == '}');
    }

}