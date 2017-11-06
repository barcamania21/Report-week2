package MyQueue;

public class MyQueueTestDrive {
    public static void main(String[] args){
        MyQueue queue=new MyQueue();
        queue.enqueue("hihi");
        queue.enqueue(2);
        queue.enqueue(4.3);
        queue.dequeue();
        queue.dequeue();
    }
}
