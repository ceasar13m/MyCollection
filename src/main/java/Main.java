import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Stack<ArrayList<Integer>> stringStack = new Stack<ArrayList<Integer>>();
        stringStack.push(new ArrayList<Integer>());
        stringStack.push(new ArrayList<Integer>());
        stringStack.push(new ArrayList<Integer>());

        System.out.println(stringStack.size());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.size());
        System.out.println(stringStack.back());
        System.out.println(stringStack.size());
        stringStack.clear();
        System.out.println(stringStack.size());
    }
}
