package com.techmisal.easy;

import java.util.Stack;

public class MinStack {

    int min = Integer.MAX_VALUE;

    public Stack<Integer> stack = new Stack<Integer>();


    public void pop() {


        if (stack.pop() == min) {

            min = stack.pop();

        }

    }


    public void push(int x) {

        if (x <= min) {
            stack.push(min);
            min = x;
        }

        stack.push(x);

    }


    public int getMin() {

        return min;
    }


    public int top() {

        return stack.peek();
    }
}
