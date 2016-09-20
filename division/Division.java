
/**
 * 
 */
public class Division
{
    
    private double numerator;
    private double denominator;

    /**
     * Constructor for objects of class Division
     */
    public Division()
    {
       numerator = 1;
       denominator = 1;
    }

    /**
     * Description:A method used for the user to input the numerator and denominator
     * Input:numerator (double) and denominator (double)
     * Purpose:To add the numerator and denominator into the system
     * Example: n1=3, n2=6
     */
    public void getInfo(double n1, double n2)
    {
        numerator = n1;
        denominator = n2;   
    }
    
    /**
     * Description:prints the answer to the division
     * Purpose:divides the numbers and prints the answer
     */
    public void print()
    {
        System.out.println(numerator/denominator);
    }
}
