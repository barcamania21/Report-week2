package MyQueue;

import java.util.Stack;

public class MyQueue<E> {
    private Stack<E> stack1=new Stack<>();
    private Stack<E> stack2=new Stack<>();
    public void enqueue(E element){
        stack1.push(element);
    }
    public E dequeue(){
        if(stack2.isEmpty()){
            if(stack1.isEmpty()){
                return null;
            }
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
