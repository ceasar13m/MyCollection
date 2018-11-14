
public class Stack <T>{

    private class ListStack {
        T value;
        ListStack next;
    }

    private ListStack front;
    private ListStack last;
    private int size = 0;

    void push(T value) {
        ListStack stack = new ListStack();
        stack.value = value;
        stack.next = null;
        if(front == null) {
            last = stack;
            front = last;
        }
        else {
            last.next = stack;
            last = last.next;
        }
        size++;
    }

    T pop() {
        if(size == 0) {
            return null;
        }
        else {
            T temp = last.value;
            ListStack countA = front;
            ListStack countB = front;
            while(countA != last) {
                countB = countA;
                countA = countA.next;
            }
            last = countB;
            last.next = null;
            size--;

            return temp;
        }
    }

    void clear() {
        front = null;
        last = null;
        size = 0;
    }

    T back() {
        if(size == 0)
            return null;
        else
            return last.value;
    }

    int size() {
        return size;
    }
}