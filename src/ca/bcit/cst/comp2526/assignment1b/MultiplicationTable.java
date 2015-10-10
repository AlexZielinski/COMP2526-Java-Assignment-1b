package ca.bcit.cst.comp2526.assignment1b;

/**
 * Class MultiplicationTable represents a multiplication table.
 * 
 * @author Alex Zielinski
 */
public class MultiplicationTable 
{
    /** TableType variable to determine type of table */
    private TableType t;
    
    /** Stores multiplication operator as String  */
    private final String operator = "*"; 
    
    /** 2D array for multiplication table */
    private float[][] table;     
    
    /** Stores array size */
    private int arraySize;
    
    /** Stores tables start value */
    private int start;
    
    /** Stores tables end value */
    private int stop;
    
    /**
     * Non-default constructor
     * 
     * @param start     for tables starting value
     * @param stop      for tables ending value
     */
    public MultiplicationTable(int start, int stop)
    {
        this.start = start;
        this.stop = stop;
    }
    
    /** 
     * Method to create multiplication table 
     */
    public void createTable()
    {
        arraySize = stop - start + 1;               // defines 2D array size
        table = new float[arraySize][arraySize];    // creates 2D array
        
        // creates multiplication table
        for (int row = 0; row < table.length; row++)
                    for (int col = 0; col < table.length; col++)
                        table[row][col] = (row + start) * (col + start);
    }
    
    /** 
     * Method to display multiplication table 
     */
    public void display()
    {
        String s = "-----";
        System.out.printf("\n");
        
        System.out.printf("%5s", operator);

        // prints header numbers
        System.out.printf("  ");
        for (int i = 0; i < table.length; i++)
            System.out.printf("%5d", (i + start));

        // prints operator
        System.out.printf("\n");

        // prints underline under header numbers
        System.out.printf("  ");
        for (int i = 0; i <= table.length; i++)
            System.out.printf("%5s", s);

        System.out.printf("\n");

        // prints side column numbers and elements of 2D array
        for (int row = 0; row < table.length; row++)
        {
            System.out.printf("%5d |", row + start);
            for (int col = 0; col < table.length; col++)
                System.out.printf("%5.0f", table[row][col]);
            
            System.out.printf("\n");
        }
    }
}
