/* 
public class ExceptionDemo167 {
    public static void main(String[] args) {
        int a=10, b=0 , c;
        try{
            c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0 ,Try Again");
           // System.out.println(e); ON THE PLACE OF LINE 10 WE CAN USE THIS

        }
        System.out.println("Bye");
        
    }
}

*/

// SAME CODE BY TAKING INPUT BY USER

import java.util.*;
public class ExceptionDemo167 {
    public static void main(String[] args) {
        int a,b , c;
        System.out.println("enter a and b");
        Scanner scn = new Scanner(System.in);
         a = scn.nextInt();
         b = scn.nextInt();
        try{
            c = a/b;
            System.out.println("Division is: "+c);
        }
        catch(ArithmeticException e){
            System.out.println("Denominator should not be 0 ,Try Again");
           // System.out.println(e); ON THE PLACE OF LINE 10 WE CAN USE THIS

        }
        System.out.println("Bye");
        
    }
}
