import java.util.Scanner;

/**
 * @version 10.03.2022
 * @author Marin K
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    //check for primeness
    //only need to check numbers up to sqrt(i+1)

    /**
     * @return Whether the input is prime
     */
    private boolean isPrime(int intToCheckForPrimality){
        for(int i = 2; i <= (Math.sqrt(intToCheckForPrimality + 1)); i++){
            if(intToCheckForPrimality % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param intToDivide the number that is to be incremented
     * @param intToBeCheckedForFactor Check whether is a factor of intToDivide
     * @return wheter it is a factor
     */
    private boolean isFactor(int intToDivide, int intToBeCheckedForFactor){
        return intToBeCheckedForFactor % intToDivide == 0;
    }

    /**
     *
     * @param intToFindFirstPrimeFactor Method finds the first prime factor of this int
     * @return the first prime factor as an int
     */
    private int firstPrimeFactor(int intToFindFirstPrimeFactor) {
        //must satisfy 1: is factor, 2: is prime
        for (int i = 2; i <= intToFindFirstPrimeFactor; i++) {
            if (isPrime(i) && isFactor(i, intToFindFirstPrimeFactor)){
                return (i);
            }
        }
        return(intToFindFirstPrimeFactor);
    }

    public void promptUser() throws InterruptedException{
        //beginning of program outputs and gets user input
        System.out.println("* Sit yourself down, take a seat *");
        Thread.sleep(250);
        System.out.println("* All you gotta do is repeat after me *");
        Scanner in = new Scanner(System.in);
        Thread.sleep(250);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }
    public void printInfo() throws InterruptedException{
        //prints literally everything except fpr the beginning of program and input prompts
        System.out.println("I'm gonna teach you how to sing it out");
        Thread.sleep(250);
        System.out.println("Come on, come on, come on");
        Thread.sleep(250);
        System.out.println("Let me tell you what it's all about");
        Thread.sleep(250);
        System.out.println("Reading, writing, arithmetic");
        Thread.sleep(250);
        System.out.println("Are the branches of the learning tree");
        Thread.sleep(250);
        System.out.println("Your name is: " + name);
        Thread.sleep(250);
        System.out.println("Your age is: " + age);
        Thread.sleep(250);
        System.out.println("At your next birthday, you will turn " + (age + 1));
        Thread.sleep(250);
        //calls firstPrimeFactor
        System.out.println("The first prime factor of " + age + " is: " + firstPrimeFactor(age));
        Thread.sleep(250);
        System.out.println("Your favorite number is: " + favNumber);
        Thread.sleep(250);
        System.out.println("Your favorite number squared is: " + favNumber * favNumber);
        Thread.sleep(250);
        System.out.println("* end of program *");
    }

    /**
     * create object app
     * call promptUser() to get user input values (int, int, String)
     * call printInfo to p[rint the info back to user
     * @param args none
     */
    public static void main(String[] args)throws InterruptedException
    {
        SimpleIOMath app  = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
    }
}
