
package cau2.phien3;

import java.util.Scanner;
public class Cau2Phien3 {

   
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

    }
    
}
