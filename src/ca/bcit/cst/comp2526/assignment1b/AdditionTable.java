package ca.bcit.cst.comp2526.assignment1b;

/**
 * Class AdditionTable represents an addition arithmetic table.
 * 
 * @author Alex Zielinski
 */
public class AdditionTable 
{
    /** TableType variable to determine type of table */
    private TableType t;
    
    /** Stores addition operator as String */
    private final String operator = "+"; 
    
    /** 2D array for addition table */
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
     * @param start     Tables starting value
     * @param stop      Tables ending value
     */
    public AdditionTable(int start, int stop)
    {
        this.start = start;
        this.stop = stop;
    }
    
    /** 
     * Method that creates addition table 
     */
    public void createTable()
    {
        arraySize = stop - start + 1;                // defines 2D array size
        table = new float[arraySize][arraySize];     // creates 2D array
        
        // creates addition table
        for (int row = 0; row < table.length; row++)
                    for (int col = 0; col < table.length; col++)
                        table[row][col] = (row + start) + (col + start);
    }
    
    /** 
     * Method that displays addition table 
     */
    public void display()
    {
        String s = "-----";
        System.out.printf("\n");
       
        // prints operator
        System.out.printf("%5s", operator);

        // prints header numbers
        System.out.printf("  ");
        for (int i = 0; i < table.length; i++)
            System.out.printf("%5d", (i + start));

        System.out.printf("\n");

        // prints underline under header numbers
        System.out.printf("  ");
        for (int i = 0; i <= table.length; i++)
            System.out.printf("%5s", s);

        System.out.printf("\n");

        // prints side column numbers and elements of array
        for (int row = 0; row < table.length; row++)
        {
            System.out.printf("%5d |", row + start);
            for (int col = 0; col < table.length; col++)
                System.out.printf("%5.0f", table[row][col]);
            
            System.out.printf("\n");
        }
    }
}
