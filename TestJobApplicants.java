/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.first_last_jobapplicant;
import java.util.Scanner;
/**
 *
 * @author Asia
 */
public class TestJobApplicants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JobApplicant app1 = new JobApplicant("Anderson","440-263-9891"
        ,true,false, true, false);
        JobApplicant app2 = new JobApplicant("Velez", "216-467-8900"
         , false, false, false, true);
        JobApplicant app3 = new JobApplicant("Jones", "330-789-2200"
         ,true,false,true,true);
        JobApplicant app4 = new JobApplicant("Mitchell","614-220-4899"
          ,true,true,true,true); 
        String qualifiedMsg = " Is qualified for an interview";
        String notQualifiedMsg = " Is not qualified for an interview.";
        
        if(isQualified(app1))
            display(app1, qualifiedMsg);
        else
            display(app1, notQualifiedMsg);
        if(isQualified(app2))
            display(app2 ,qualifiedMsg);
        else
            display(app2, notQualifiedMsg);
        if(isQualified(app3))
            display(app3, qualifiedMsg);
        else
            display(app3, notQualifiedMsg);
        if(isQualified(app4))
            display(app4, qualifiedMsg);
        else
            display(app4, notQualifiedMsg);
    }
    public static boolean isQualified(JobApplicant app){
            
        int count = 0;
        boolean isQual;
        final int MIN_SKILLS = 3;
        if(app.isHasWordSkills())
            count = count++;
        if (app.isHasSpreadsheetSkills())
            count = count++;
        if (app.isHasDatabaseSkills())
            count = count++;
        if (app.isHasGraphicSkills())
            count = count++;
        if (count >= MIN_SKILLS)
            isQual = true;
        else 
         isQual = false; 
        return isQual;
}
    public static void display(JobApplicant app, String msg)
    {
        System.out.println(app.getName() + "" + msg + "Phone:" 
                + app.getPhone());}
}
  




