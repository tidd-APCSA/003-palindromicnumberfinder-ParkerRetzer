public class PalindromicNumberFinder {
    private int num;


    //added variables
    private String original = "";
    private String reverse = "";
    private int reversedInt = 0;
    private int temp;
    private int next = 0;
    private boolean isPalindrome;
  

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    
    //test this/fix this cuz this one takes too long to output
    public int searchForPalindromicNum(int num){
         next = num + 1;
         while(next != num && isPalindrome != true){
         next = next + 10000;
         isPalindrome = testPalindromicNum(next);
         //System.out.println(isPalindrome);
         }
        return next - num;
         
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome

    public boolean testPalindromicNum(int num){
      reverseNum(num);
      if(original.equals(reverse) && num == reversedInt){
        return true;
      }else{
        return false;
      } 

    }

    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      //this for loop is technically uneccesary, if converted to return type int.
      original = original + num;
      int length = original.length() - 1;
      //reverses the number as a string
      for(int i = length; i >= 0 ; i--){
        
        reverse = reverse + original.charAt(i);
      }

      //reverses the number as an int as well;
      while (num != 0){
        temp = num % 10;
        reversedInt = reversedInt * 10 + temp;
        num /= 10;
      }

      //test int reversing
      //System.out.println(reversedInt);
      return reverse;
    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
