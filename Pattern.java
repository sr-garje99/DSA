// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern p = new Pattern();
        int t;
        t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n;
            n=sc.nextInt();
            p.pattern(n);
        }
        
    
    }
    void pattern(int n){
        for(int i =0;i<n;i++){
            //System.out.println(i);
            for(int j =0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j =0;j<n-i-1;j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}