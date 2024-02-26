package bracket;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalancer {

    public static boolean checker( String input){

        Stack<Character> stack = new Stack<>();

        for (char ch: input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
            }else if (ch == ')' && !stack.isEmpty() && stack.peek()== '(') {
                stack.pop();
            }else if (ch == ']' && !stack.isEmpty() && stack.peek()== '[') {
                stack.pop();
            }else if (ch == '}' && !stack.isEmpty() && stack.peek()== '{') {
                stack.pop();
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        //taking user input
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter input 1");
        String input1 = scanner.nextLine();

        System.out.println("Enter input 2");
        String input2 = scanner.nextLine();

        System.out.println("Enter input 3");
        String input3 = scanner.nextLine();


        //check the balancing
        System.out.println("input 1 balanced ? " + checker(input1));
        System.out.println("input 2 balanced ? " + checker(input2));
        System.out.println("input 3 balanced ? " + checker(input3));



    }

}
