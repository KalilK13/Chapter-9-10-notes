package chapter10;

public class Main {
   // Math math = new Math(); this would return an error because of the private constructor for the Math class.
    private String somethingElse = "something else";
    private static final int A_NUMBER = 1000; //constant variable
    public static void printSomething(){
        System.out.println("Something");
//        System.out.println(somethingElse); Error, non static method cannot be referenced in a static metho.
    }
    public static void main(String[] args) {
        Main.printSomething();//Calling a static method using the class name and method.
        //A_NUMBER = 20; // cannot assign this variable a new value.
        System.out.println(A_NUMBER);
        System.out.printf("%, d%n", A_NUMBER); //String formatting. number now appears as 1,000 with a comma.
    }

}
