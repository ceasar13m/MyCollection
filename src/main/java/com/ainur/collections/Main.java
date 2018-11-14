package java;

//
public class Main {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("aaa");
        stringStack.push("bbb");
        stringStack.push("ccc");

        System.out.println(stringStack.size());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.size());
        System.out.println(stringStack.back());
        System.out.println(stringStack.size());
        stringStack.clear();
        System.out.println(stringStack.size());
    }
}
