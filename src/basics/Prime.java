package basics;

import java.io.IOException;

public class Prime {
    public static void main(String args[])throws IOException{
        System.out.print("Enter a number: ");
        int n=System.in.read();
        int i=2;
        int flag=-1;
        while(i<n){
            if(n%i==0){
                System.out.println("Not prime");
                flag=1; 
                break;  
            }
            i++;
        }
        if(flag==-1){
            System.out.println("Prime");
        }
    }
    
}
