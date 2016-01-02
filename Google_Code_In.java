//Rishabh Minocha
import java.io.*;
import javax.swing.*;
public class Google_Code_In
  {
  public static void main(String args[])throws IOException
   {
     String input[]=new String[7];
     int a,b,c,n=4,points=0;
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Welcome");
     System.out.println("To play this game first input your name. There are going to be 10 questions with options.");
     input[1]=obj.readLine();
     if(input[1].length()<1){
     System.out.println("Please input a valid name. ");
     input[1]=obj.readLine();
     }
     for(a=1;a<=10;a++)
     {
       if(a==1)
       {
        System.out.println("Heres the first question");
        System.out.println("In 2005 the Government of ________ voted to adopt open source across all its bodies.");
        System.out.println("1. Peru");
        System.out.println("2. India");
        System.out.println("3. Australia");
        System.out.println("4. Brazil");
        c=Integer.parseInt(obj.readLine());
        switch(c)
        {
          case 1:points++;
          System.out.println("Correct"); System.out.println("you have "+points+" points");System.out.println(""); break;
          case 2:System.out.println("");break;
          case 3: System.out.println("");break;
          case 4: System.out.println("");break;
        }

       }
       if(a==2)
       {
         System.out.println("Heres the second question");
         System.out.println("In February ____, the United States White House moved its website to Linux servers using Drupal for content management");
         System.out.println("1. 2002");
         System.out.println("2. 2009");
         System.out.println("3. 2013");
         System.out.println("4. 2015");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1: System.out.println("");break;
           case 2:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points"); System.out.println("");break;
           case 3: System.out.println("");break;
           case 4:System.out.println(""); break;
         }
        }
         if(a==3)
       {
         System.out.println("Heres the question");
         System.out.println("Whats the full form of FOSS");
         System.out.println("1. Free and open source software");
         System.out.println("2. Fully operational source software");
         System.out.println("3. Fully operating software source");
         System.out.println("4. Free open sidey software");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points"); System.out.println("");  break;
           case 2:System.out.println("");break;
           case 3: System.out.println("");break;
           case 4:System.out.println("");break;
         }

       }
         if(a==4)
       {
         System.out.println("Heres the next question");
         System.out.println("What is FOSS?");
         System.out.println("1. Computer software that can be classified as both free software and open-source software.");
         System.out.println("2. Mobile software that can be classified as both free software and open-source software.");
         System.out.println("3. Wear software that can be classified as both free software and open-source software.");
         System.out.println("4. None of the above");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points"); System.out.println(""); break;
           case 2:System.out.println("");break;
           case 3: System.out.println("");break;
           case 4:System.out.println("");break;
         }

       }
        if(a==5)
       {
         System.out.println("Heres the next question");
         System.out.println("FOSS is which of the following?");
         System.out.println("1. Only developers get to use it.");
         System.out.println("2. Paid and only a limited people can use it");
         System.out.println("3. Free and anyone can use it");
         System.out.println("4. Something nobody knows");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1:System.out.println(""); break;
           case 2:System.out.println("");break;
           case 3: points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points");System.out.println(""); break;
           case 4:System.out.println("");break;
         }

       }
       if(a==6)
       {
         System.out.println("Heres the next question");
         System.out.println("The Linux kernel was started by who?");
         System.out.println("1. Eric Raymold");
         System.out.println("2. Richard Stalman");
         System.out.println("3. Rishabh Minocha");
         System.out.println("4. Linus Torvalds");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1: System.out.println("");break;
           case 2:System.out.println("");break;
           case 3: System.out.println("");break;
           case 4: points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points");System.out.println("");break;
         }

       }
       if(a==7)
       {
         System.out.println("Heres the next question");
         System.out.println("Who announced the GNU project?");
         System.out.println("1. Rishabh Minocha");
         System.out.println("2. Richard Stalman");
         System.out.println("3. Eric Raymold");
         System.out.println("4. Linus Torvalds");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1: System.out.println("");break;
           case 2:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points");System.out.println("");break;
           case 3: System.out.println("");break;
           case 4: System.out.println("");break;
         }

       }

       if(a==8)
       {
         System.out.println("Heres the next question");
         System.out.println("Who coined the term FLOSS?");
         System.out.println("1. Rishabh Minocha");
         System.out.println("2. Erica Ray");
         System.out.println("3. Rishab Aiyer Ghosh");
         System.out.println("4. Jamess Torvalds");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1: System.out.println("");break;
           case 2:System.out.println("");break;
           case 3:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points"); System.out.println("");break;
           case 4: System.out.println("");break;
         }

       }

       if(a==9)
       {
         System.out.println("Heres the next question");
         System.out.println("When was the term FLOSS coined?");
         System.out.println("1. 2001");
         System.out.println("2. 2002");
         System.out.println("3. 1998");
         System.out.println("4. 1999");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1: System.out.println("");break;
           case 2:points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points");System.out.println("");break;
           case 3: System.out.println("");break;
           case 4: System.out.println("");break;
         }

       }
           if(a==10)
       {
         System.out.println("Heres the next question");
         System.out.println("Which was the first state to officially declare its support for FOSS?");
         System.out.println("1. New Delhi");
         System.out.println("2. Goa");
         System.out.println("3. Karnataka");
         System.out.println("4. Kerala");
         c=Integer.parseInt(obj.readLine());
         switch(c)
         {
           case 1:System.out.println("");break;
           case 2:System.out.println("");break;
           case 3: System.out.println("");break;
           case 4: points++;
           System.out.println("Correct"); System.out.println("you have "+points+" points"); System.out.println("");break;
         }

       }
     }
     System.out.println("");
     System.out.println("Congratulations "+input[1]+"! You have recieved a score of "+points+" points!");

   }

}
