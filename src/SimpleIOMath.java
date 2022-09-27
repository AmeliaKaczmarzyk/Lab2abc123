import java.util.Scanner;

/**
 * @version 10.03.2022
 * @author Marin K
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    private boolean isPrime(int intToCheckForPrimality){
        for(int i = 2; i <= (Math.sqrt(intToCheckForPrimality + 1)); i++){
            if(intToCheckForPrimality % i == 0) {
                return false;
            }
        }
        return true;
    }
    private boolean isFactor(int intToDivide, int intToBeCheckedForFactor){
        return intToBeCheckedForFactor % intToDivide == 0;
    }

    private int firstPrimeFactor(int intToFindFirstPrimeFactor) {
        for (int i = 2; i <= intToFindFirstPrimeFactor; i++) {
            if (isPrime(i) && isFactor(i, intToFindFirstPrimeFactor)){
                return (i);
            }
        }
        return(intToFindFirstPrimeFactor);
    }

    public void promptUser(){
        //beginning of program outputs and gets user input
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }
    public void printInfo(){
        //prints literally everything except fpr the beginning of program and input prompts
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        System.out.println("The first prime factor of " + age + " is: " + firstPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: " + favNumber * favNumber);
        System.out.println("* end of program *");
    }
    public static void main(String[] args){
        SimpleIOMath app  = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
