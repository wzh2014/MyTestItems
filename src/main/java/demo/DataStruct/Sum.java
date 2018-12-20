package demo.DataStruct;

import java.io.IOException;

/**
 * 堆栈实现自然数相加
 *
 * @author zhihong.wan
 * @since 2018年07月10日
 */
public class Sum {

    static int num;
    static int ans;
    static Stack theStack;

    public static void main(String[] args)

    throws IOException {
        num = 100;
        stackAddition();
        System.out.println("Sum = " + ans);
    }

    public static void stackAddition() {
        theStack = new Stack(10000);
        ans = 0;
        while(num > 0) {
            theStack.push(num);
            --num;

            //num--;
        }
        while(!theStack.isEmpty()) {
            int newN = theStack.pop();
            ans += newN;
        }
    }
}

class Stack {
    private int maxSize;
    private int[] data;
    private int top;

    public Stack(int s) {
        maxSize = s;
        data = new int[maxSize];
        top = -1;
    }

    public Stack() {

    }

    public void push(int p) {
        data[++top] = p;
    }

    public int pop() {
        return data[top--];
    }

    public int peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
