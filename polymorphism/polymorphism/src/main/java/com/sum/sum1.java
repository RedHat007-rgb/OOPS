package com.sum;

public class sum1 implements Runnable{
    public void sum(){
        int sum=0;
        for(int i=0;i<101;i++){
            sum=sum+i;
           
        }
         System.out.println("Sum of 100 numbers is "+sum);
        
    }


    public void run(){
        sum();
    }
}
