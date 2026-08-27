package Prelim;

import java.util.Scanner;

public class methodsDemo {

//     Void
    static void message(String name, int age) {
        System.out.println("Hello Guys, this is " + name + ". I am " + age + " years old!");
    }

//    Returning methods
    static int calculateAge(int currentYear, int birthyear) {
        return currentYear - birthyear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

//        call void method
        message(name, age);
//      Call returning method               
        int calculatedAge = calculateAge(2026, 2000);
        System.out.println("\n The calculated age is : " + calculatedAge);
        
//        Conditional 
        if(age == calculatedAge){
            System.out.println("it means you are honest");
        }else {
            System.out.println("it means you are LIAR!!!!");
        }

//        Array
        String children[] = {"Carl", "Hudson", "Chechen"};
        System.out.println("The children of " + name + " are the ff:");
        for(int i=0; i<children.length; i++){
            System.out.println((i+1)+ ". " + children[i] + " ");
        }
    }
}
