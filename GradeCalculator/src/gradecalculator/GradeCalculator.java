/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecalculator;
import java.util.Scanner;

/**
 *
 * @author PETRA AUDIO
 */
public class GradeCalculator {

  
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        double D;
        double E;
        double F;
        double test;
        double exam;
        double num;
        Scanner Input= new Scanner(System.in);
        System.out.println("Enter Test Score");
        test=Input.nextDouble();
        System.out.println("Enter Exam Score");
        exam=Input.nextDouble();
        
        num=test+exam;
        System.out.println("Total Score=" +num);
        
        if(num >=70&& num <=100){
         System.out.println("Excellent: Your Grade is A");
        }
        else if(num >=60 && num <=69){
         System.out.println("Very Good: Your Grade is B");
        }
        else if(num >=50 && num <=59){
         System.out.println(" Good: Your Grade is C");
        }
        else if(num >=45 && num <=49){
         System.out.println("Fair: Your Grade is D");
        }
        else if(num >=40 && num <=44){
         System.out.println("Poor: Your Grade is E");
        }
        else if(num >=0 && num <=39){
         System.out.println("Failed: Your Grade is F");
        }
        else
        {
         System.out.println("Score is out of range");
        }
    }
    
}
