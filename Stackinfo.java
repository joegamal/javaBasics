import java.util.*;

public class Stackinfo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //the stack push method in java return the element btw.
        System.out.println(stack.push(5));

        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);


        for(int i : stack) {
            System.out.println(i);
        }



    }
}