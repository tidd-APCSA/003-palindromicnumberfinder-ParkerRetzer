public class PalindromicNumberFinder {
    private int num;

    //added variable
    //private int reversedInt = 0;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
  
    public int searchForPalindromicNum(int num){
         int next = num;
         boolean isPalindrome = false;
         //System.out.println(isPalindrome);
         while(isPalindrome == false){

         next = next + 1;

         //System.out.println(next);

         isPalindrome = testPalindromicNum(next);

         //System.out.println(isPalindrome);
         }

        return next - num;
         
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
      
      //System.out.println("tp" + num);

      int reverse = Integer.parseInt(reverseNum(num));
      if(num == reverse){

        //System.out.println("true");

        return true;
      }else{

        //System.out.println("false");

        return false;
      } 

    }

    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      
      String original = "";
      original = original + num;
      String reverse = "";

      int length = original.length() - 1;

      for(int i = length; i >= 0 ; i--){
        reverse = reverse + original.charAt(i);
      }

      return reverse;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}
