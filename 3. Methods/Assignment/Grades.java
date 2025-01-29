// Java Program to Calculate Grade of Students
/*
 Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 

 */

package Assignment;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        marks();
    }
    static void marks() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your marks out of 100 = ");
        int marks = in.nextInt();
        in.close();

        if (marks >= 91 && marks <= 100) {
            System.out.println("Grade = AA");
        }
        else if (marks >= 81 && marks <= 90) {
            System.out.println("Grade = BB");
        }
        else if (marks >= 71 && marks <= 80) {
            System.out.println("Grade = BC");
        }
        else if (marks >= 61 && marks <= 70) {
            System.out.println("Grade = CC");
        }
        else if (marks >= 51 && marks <= 60) {
            System.out.println("Grade = CD");
        }
        else if (marks >= 41 && marks <= 50) {
            System.out.println("Grade = DD");
        }
        else if (marks >= 101) {
            System.out.println("Enter your marks correctly");
        }
        else{
            System.out.println("Grade = Fail");
        }
    }
}
