import junit.framework.TestCase;

/**
 * A JUnit test case class for the Purse class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class PurseTest extends TestCase
{    
    public static final double EPSILON = 0.01;
    
    /**
     * Test the AddOneCentCoins method.
     */
    public void testAddOneCentCoins()
    {
        Purse myPurse = new Purse();
        assertEquals(0, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneCentCoins(1);
        assertEquals(0.01, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneCentCoins(100);
        assertEquals(1.01, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddTenCentCoins method.
     */
    public void testAddTenCentCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addTenCentCoins(1);
        assertEquals(0.10, myPurse.getTotal(), EPSILON); 
        
        myPurse.addTenCentCoins(100);
        assertEquals(10.10, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddFiftyCentCoins method.
     */
    public void testAddFiftyCentCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addFiftyCentCoins(1);
        assertEquals(0.50, myPurse.getTotal(), EPSILON); 
        
        myPurse.addFiftyCentCoins(100);
        assertEquals(50.50, myPurse.getTotal(), EPSILON); 
    }
    
    /**
     * Test the AddOneEuroCoins method.
     */
    public void testAddOneEuroCoins()
    {
        Purse myPurse = new Purse();
        
        myPurse.addOneEuroCoins(1);
        assertEquals(1.00, myPurse.getTotal(), EPSILON); 
        
        myPurse.addOneEuroCoins(100);
        assertEquals(101.00, myPurse.getTotal(), EPSILON); 
    }
}