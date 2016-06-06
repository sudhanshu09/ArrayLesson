/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylesson;

import java.util.Scanner;

/**
 *
 * @author Sudhanshu
 */
public class MarkSheet {

    int fullmarks = 100;
    int passMarks = 32;
    boolean isFail = false;
    double obtainedTotal = 0;
    double[] marks;
    String[] subjects;
    Scanner input;
    //Constructor

    public MarkSheet(String[] subjects, Scanner input) {
        marks = new double[subjects.length];
        this.subjects = subjects;
        this.input = input;
        
        
        
        

   
}
     public void getInput() {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter Marks for " + subjects[i] + ":");
            marks[i] = input.nextInt();
            obtainedTotal += marks[i];
        }
    }
    public boolean isPass(){
       for (int i=0;i<marks.length;i++){
            if(marks[i]<passMarks){
                return true;
            }
    }
       return false;
    
    
    
}
   public double getPercentage(){
       return (obtainedTotal/(fullmarks*subjects.length))*100;
          
   }
   public String getDivision(){
       double percentage=getPercentage();
       if(percentage>=80){
           
       }
       return "Distinction";
       
       
   }

    void entry() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }