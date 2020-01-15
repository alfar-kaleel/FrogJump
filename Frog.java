/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frog;

import java.util.Scanner;

/**
 *
 * @author alfar
 */
public class Frog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x =0;
        
        System.out.println("Press 1 for time caculator 2 for distance calculator : ");
        
        
        
        Scanner input = new Scanner(System.in);
        
        x = input.nextInt();
        
        
        if( x == 1 ){
        timeCal();
        
        }
        
        if(x == 2){
        
       distanceCal();
        }
        
       else if(x<1 || x > 2){
        
        System.out.println("Invalid number, Try again");
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    static void timeCal(){
    
    int distance = 0;
    int time = 0;
    
    
    System.out.println("Please input your distance : ");
    
     Scanner input = new Scanner(System.in);
        
        distance = input.nextInt();
        
        if (distance < 5){
        time = 0;
        }
         
        while(distance >= 5){
        
        if (distance >= 5 && distance < 8){
        
            time = time + 1;
        }
        
        if (distance==8 ){
        
        time = time +3;
        
        }
        
              if(distance >9){
        
        time = time + 8;
        
        }
        
        distance = distance - 9;
        
        }
        
    System.out.println("The time taken is : " + time + "(s)");
    } 
    
    
    
    static void distanceCal(){
    
    int distance = 0;
    int time = 0;
    
       System.out.println("Please input your time : ");
    
     Scanner input = new Scanner(System.in);
        
        time = input.nextInt();
        
        if (time < 1){
        distance = 0;
        }
        
        while (time >= 1){
        
        if (time >= 1 && time < 3){
        
        distance = distance + 5;
        
        }
        
        if (time ==3){
        
            distance = distance + 8;
        }
        
        if (time > 3 && time < 8){
        
        distance = distance + 8;
        
        }
        
        
        if (time >= 8){
        
        
        distance = distance + 9;
        
        }
         
        time = time - 8;
        
        
        }
        
    
    System.out.println("The distance jumped is : " + distance + "(m)");
    
    }
    
    
    
}
