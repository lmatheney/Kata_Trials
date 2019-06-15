public class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
  
    int years = 0;
    double gains = 0;
    double taxed = 0;
    double total = 0;
    
    //First we need to check if our principal amount is already our desired amount, that would be the 0 year case
    if(principal == desired){
    
    return years;
    }
    else
    {
    
    //Otherwise, while principal amount is not equal to the desired amount we need to run a yearly investment cycle
    while(principal <= desired)
    {
    
     gains = principal * interest;
     taxed = gains * tax;
     total = gains - taxed;
     principal += total;
     
    years++;
    
    }
    
    //Once the princpal amount has is equal to or greater than the desired amount, we output the years it took.
    return years;
    }
  }
 
}
