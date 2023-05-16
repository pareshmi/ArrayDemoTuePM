/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemotuepm;

import java.util.Scanner;

/**
 *
 * @author reshmee
 */
public class ArrayDemoTuePM {

    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        
        //creating an array
        //char[] myLetters =new char[5];
        
        //adding values to it
       /* myLetters[0]='R';
        myLetters[1]='O';
        myLetters[2]='N';
        myLetters[3]='A';
        myLetters[4]='K';
        
        //calling an array
        /*for(int i=0;i<myLetters.length;i++)
        {
            System.out.println(myLetter[i]);
            
        }
        */
        //scannar input
        
        System.out.println(" Enter Word");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        char[] myLetters = new char[myWord.length()];
        for(int i =0;i<myLetters.length;i++) {
            myLetters[i]=myWord.charAt( i);
            System.out.print(myLetters[i]);
        }
        for(int i = myLetters.length-1;i>=0 ;i --)
            System.out.print(myLetters[i]);
    } 
    }

 
