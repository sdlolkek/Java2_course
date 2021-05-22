/**
 * A class to simulate a coin purse that can hold
 * one-euro, fifty-cent, ten-cent, and one-cent coins.
 */
public class Purse 
{
    // Coin value constants
    public static final double ONE_EURO_VALUE = 1.0;
    public static final double FIFTY_CENT_VALUE = .50;
    public static final double TEN_CENT_VALUE = .10;
    public static final double ONE_CENT_VALUE = .01;
    
    // Instance variables for number of each coin denomination
     int numOneEuro;
     int numFiftyCent;
     int numTenCent;
     int numOneCent;
    
    /**
     * Construct an empty Purse
     */
    public Purse()
    {
        numOneEuro = numFiftyCent = numTenCent = numOneCent = 0;
    }
    
    /**
     * Add count one-cent coins to this purse
     * @param count the number of one-cent coins to add
     */
    public void addOneCentCoins(int count)
    {
       numOneCent +=count;
    }
    
    /**
     * Add count ten-cent coins to this purse
     * @param count the number of ten-cent coins to add
     */
    public void addTenCentCoins(int count)
    {
       numTenCent +=count;
    }
    
    /**
     * Add count fifty-cent coins to this purse
     * @param count the number of fifty-cent coins to add
     */
    public void addFiftyCentCoins(int count)
    {
        numFiftyCent +=count;
    }
    
    /**
     * Add count one-euro coins to this purse
     * @param count the number of one-euro coins to add
     */
    public void addOneEuroCoins(int count)
    {
        numOneEuro +=count;
    }
    
    /**
     * Determine the total value of all the coins
     * in this purse
     * @return the total value of the coins in this Purse
     */
    public double getTotal()
    {
        double total =  numOneEuro*ONE_EURO_VALUE + numFiftyCent*FIFTY_CENT_VALUE + numTenCent*TEN_CENT_VALUE + numOneCent*ONE_CENT_VALUE;
        return total;
    }
    
    /**
     * Get a String representation of this Purse
     * @return a String representation of this Purse
     */
    public String toString()
    {
      
        String output = numOneCent + " one-cent coins \n" + numTenCent + " ten-cent coins \n" + numFiftyCent + " fifty-cent coins \n" + numOneEuro + " one-euro coins \n";
        return output;
        return;
    }
}