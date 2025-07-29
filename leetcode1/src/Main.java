import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "(]";
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put(']', '[');
        charMap.put('}', '{');

        for (char c : s.toCharArray()) {
            if (charMap.containsValue(c)) {
                stack.push(c);
            } else if (charMap.containsKey(c)) {
                if (stack.isEmpty() || charMap.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
