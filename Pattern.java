import javax.sound.midi.MidiChannel;

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    System.out.println("enter number of row");
    int n = scn.nextInt();
       for(int i = 1;i<=n;i++){
        for(int j =1;j<=n-i;j++){
            System.out.print("\t");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*\t");
        }
        System.out.println();
    }
    for(int i =n;i>=1;i--){
        for(int j = 1;j<=n-i;j++){
            System.out.print("\t");
        }
        for(int j=2*i-1;j>=1;j--){
        System.out.print("*\t");
    }
    System.out.println();
}
    }
}

