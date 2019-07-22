/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambhulkar
 */
import java.io.*;

public class callender {
    public static void main(String args[]) throws IOException{
        System.out.println("enter the date in dd-mm-yyyy format");
        System.out.println("Enter date");
        
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        String date=buff.readLine();
        int dat =Integer.parseInt(date);
        
        System.out.println("Enter month");
        String Month=buff.readLine();
        int mont=Integer.parseInt(Month);
         
       System.out.println("Enter the year");
       String Year=buff.readLine();
      int year=Integer.parseInt(Year);
    //   float year=Float.parseFloat(Year);//Boolean.parseBoolean(Year);

        if(mont>12){
            System.out.println("the month is out of limit");
         }else
        if(dat>31){
            System.out.println("date is out of limit");
        }
        if(year%4==0)
        {
        if(mont==2 && dat >29){
         System.out.println("invalid")  ; 
        }
        }
        else if (mont == 2 && dat > 28)
        {  
        System.out.println("invalid");
        
        }
   // this.dat = 0;
        else if (mont == 4 || mont == 6 || mont == 9 ||  mont == 11 && dat > 30)
        {

        }
   // this.day = 0;
        
    }}
