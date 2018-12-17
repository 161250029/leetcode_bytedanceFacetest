package DataStructure.test1;

import java.util.ArrayList;
import java.util.List;

//双栈效率更高
//之后可以试着尝试一下
class MinStack {
    /** initialize your data structure here. */
    int[] stack;
    int index;
    int small;
    List<Integer> smallList;
    public MinStack() {
        this.stack = new int[10000];
        this.index = -1;
        this.small = -1;
        this.smallList = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack[++ index] = x;
        if(index == 0) {
            small = 0 ;
            smallList.add(small);
        }
        else {
            if(x < stack[small]) {
                small = index;
                smallList.add(small);
            }
        }
    }

    public void pop() {
        if(small == index && smallList.size() > 1) {
            smallList.remove((Object) index);
            small = smallList.get(smallList.size() - 1);                    //这里需要加上判断 ， 不然会报错 。指针错误就是在这里产生的
        }
        else if(small == index && smallList.size() == 1){
            smallList.remove((Object) index);
            small = -1;
        }
        else {

        }
        index -- ;
    }

    public int top() {
        return stack[index];
    }

    public int getMin() {
        return stack[small];
    }

    public static void main(String args[]) {
        MinStack stack = new MinStack();
//        stack.push(2);
//        stack.push(0);
//        stack.push(3);
//        stack.push(0);
//        stack.getMin();
//        stack.pop();
//        stack.getMin();
//        stack.pop();
//        stack.getMin();
//        stack.pop();
//        stack.getMin();
        stack.push(2147483646);
        stack.push(2147483646);
        stack.push(2147483647);
        stack.top();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.getMin();
        stack.pop();
        stack.push(2147483647);
        stack.top();
        stack.getMin();
        stack.push(-2147483648);
        stack.top();
        stack.getMin();
        stack.pop();
        stack.getMin();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
