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
public class ArrayLesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        try {

            /*int [] nums=new int[3];
             nums[0]=10;
             nums[1]=22;
             nums[2]=43;
             nums[3]=32;
             nums [4]=65;*/
           /* int[] nums = {1, 84, 57, 46, 21, 41};

            int length = nums.length;

            for (int i = 0; i < length; i++) {
                if ((nums[i] % 2) != 0) {
                    // if ((nums[i] % 2) = 0) {

                    System.out.println(nums[i]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }
*/
       //int fullmarks=100;
        //int passMarks=32;
      //  boolean isFail=false;
        //double obtainedTotal=0;

       String[] subjects={"English","Nepali","Maths","OPT Maths","Science","Computer"};
       
      // double[] marks=new double [subjects.length];
       
       
        /* fail check
        for (int i=0;i<marks.length;i++){
            System.out.println("Enter Marks for "+ subjects [i]+ ":");
            marks[i]=input.nextInt();
            obtainedTotal+=marks[i];
        }
        for (int i=0;i<marks.length;i++){
            if(marks[i]<passMarks){
                isFail=true;
                break;
            }
        }
        //percentage 
        if(isFail){
            System.out.println("You are fail");
        }
        else {
           double percentage=(obtainedTotal/(fullmarks*subjects.length))*100;
            System.out.println(percentage);
           
        }*/
       MarkSheet marksheet=new MarkSheet(subjects, (new Scanner(System.in)));
        marksheet.getInput();
        marksheet.entry();
        
        if (marksheet.isPass()){
            System.out.println("Your are fail");
    }
        else {
            System.out.println(marksheet.getPercentage());
        }

}
}