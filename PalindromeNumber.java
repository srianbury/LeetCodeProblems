/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromenumber;

/**
 *
 * @author rsunb
 */
public class PalindromeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isPalindrome(3));
    }
    
    //palindrome for an odd number of digits
    public static boolean isPalindrome(int num){
        String numberAsString = Integer.toString(num);
        if(numberAsString.length()==1){
            return true;
        }
        for(int i=0; i<numberAsString.length()/2; i++){
            //System.out.println(numberAsString.charAt(i) + " " + numberAsString.charAt(numberAsString.length()-i-1));
            if(numberAsString.charAt(i)!=numberAsString.charAt(numberAsString.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
}
