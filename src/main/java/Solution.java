import java.util.Stack;

/**
 * 将stack1用于入栈，并且在进行入栈前需要把stack2中的元素pop出来放入stack1中
 * 将stack2用于出栈，并且在进行出栈前需要把stack1中的元素pop出来放入stack2中
 */
public class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(node);

    }

    public int pop() {


        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        return stack2.pop();
    }
}