package ca.bcit.cst.comp2526.assignment1b;

/**
 * Class Main.
 * 
 * @author Alex Zielinski
 */
public class Main
{
    /** 
     * Main method
     * 
     * @param argv      command line arguments
     */
    public static void main(final String[] argv)
    {
        final TableType type;
        final int       start;
        final int       stop;
        
        if(argv.length != 3)
        {
            usage();
        }
       
        type  = getType(argv[0]);
        start = getNumber(argv[1]);
        stop  = getNumber(argv[2]);
        
        displayTable(type, start, stop);
    }
   
    /**
     * Method TableType to determine the TableType
     * 
     * @param str       for String operator
     * 
     * @return table type
     */
    public static TableType getType(final String str)
    {
        final TableType type;
        
        if(str.equals("+"))
        {
            type = TableType.ADD;
        }
        else if(str.equals("*"))            
        {
            type = TableType.MULT;
        }
        else
        {
            usage();
            type = null;
        }
        
        return (type);
    }
    
    /**
     * Method to return number for Start and Stop.
     * 
     * @param str       String.
     * 
     * @return number.
     */
    public static int getNumber(final String str)
    {
        int val;
        
        try
        {
            val = Integer.parseInt(str);
        }
        catch(NumberFormatException ex)
        {
            usage();
            val = 0;
        }
        
        return (val);
    }
   
    /**
     * Method to display table
     * 
     * @param type      Tables type
     * @param start     Tables start value
     * @param stop      Tables end value
     */
    public static void displayTable(final TableType type,
                                    final int start,
                                    final int stop)
    {   
        // if addition table is specified
        if (type == TableType.ADD)
        {
            // creates and displays addition table
            AdditionTable add = new AdditionTable(start, stop);
            add.createTable();
            add.display();
        }
        else
        {
            // else creates and displays multiplication table
            MultiplicationTable mult = new MultiplicationTable(start, stop);
            mult.createTable();
            mult.display();
        }
    }    
    
    /**
     * Method to display instructions
     */
    public static void usage()
    {
        System.err.println("Usage: Main <type> <start> <stop>");
        System.err.println("\tWhere <type> is one of +, -, \"*\", /");
        System.err.println("\tand <start> is between 1 and 100");
        System.err.println("\tand <stop> is between 1 and 100");
        System.err.println("\tand start < stop");
         System.exit(1);
    }            
}


