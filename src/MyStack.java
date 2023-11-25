public class MyStack {
    private int size = 10;
    private int top;
    private int[] arr;

    public MyStack() {
        arr = new int[size];
        top = -1;
    }

    public void push(int v) {
        arr[++top] = v;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
        }
    }
}
