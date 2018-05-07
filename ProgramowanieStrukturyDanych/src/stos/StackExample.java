package stos;

import java.util.Stack;

public class StackExample {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stos jest pusty? " + stack.empty());
        stack.push(1);
        System.out.println("Stos jest pusty? " + stack.empty());
        stack.push(2);
        System.out.println("Liczba na górze stosu to:" + stack.peek());
        System.out.println("Możemy jeszcze raz zobaczyć co jest na górze: " + stack.peek());
        System.out.println("Teraz wyciągamy ostatni elemet ze stosu: " + stack.pop());
        System.out.println("Kolejny element jaki możey pobrać ze stosu to: " + stack.peek());
        System.out.println("Ponieważ użyliśmy metody peek() , na wierzchu stosu ciągle znajduje się: " + stack.peek());
        System.out.println("Dobrze, wyciągnijmy w końcu ten element: " + stack.pop());
        System.out.println("Stos jest pusty? " + stack.empty());
    }
}

