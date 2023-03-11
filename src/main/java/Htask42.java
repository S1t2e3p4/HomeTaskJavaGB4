/**
 * Задача 2:
 * Valid Parentheses
 * Easy
 * 18.4K
 * 1K
 * Companies
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: true
 * Example 2:
 *
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 *
 * Input: s = "(]"
 * Output: false
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

import java.util.*;

public class Htask42 {
    public static void main(String[] args) {
        String symbols = "({[]})";
        System.out.println(etoValidno(symbols));
}
    public static Boolean etoValidno(String text) {
        Boolean flag = false;
        Deque<String> list = new LinkedList<>();
        String[] arr = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = (text.substring(i, i + 1));
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(") || arr[i].equals("{") || arr[i].equals("[")) {
                list.addFirst(arr[i]);
            } else {
                if (!list.isEmpty()
                        && (list.peekFirst().equals("(") && arr[i].equals(")"))
                        || (list.peekFirst().equals("{") && arr[i].equals("}"))
                        || (list.peekFirst().equals("[") && arr[i].equals("]"))) {
                    list.pop();
                } else {
                    return flag;
                }
            }
        }
        if (list.isEmpty()) {
            flag = true;
        }
        return flag;
    }
}