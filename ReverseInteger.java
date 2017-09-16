/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseinteger;
import java.lang.Math;

/**
 *
 * @author rsunb
 */
public class ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(reverse(123));
    }
    public static int reverse(int x) {
        if(x>Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        int sign;
        if(x<0){
            sign = -1;
            x*=sign;
        }else{
            sign = 1;
        }
        double answer = 0;
        int returnAnswer;
        int newValue = -1;
        
        while(x>0){
            newValue = x%10;
            answer = (answer * 10) + newValue;
            x /= 10;
            System.out.println("answer: " + answer);
            System.out.println("x " + x);
            System.out.println();
            
            if(answer>Integer.MAX_VALUE){
                return 0;
            }
        }
        
        returnAnswer = (int)answer;
        
        return returnAnswer;
    }
    
}
