
/**
 * Write a description of class Lotto here.
 *
 * @author Arianna
 * @version (11/3/21
 */
public class Ticket
{
    final int LIMIT = 4;
    final int MAX = 40;
    final int CORRECTOR = 1;
    private int num = 0;
    private boolean sameNumber = false;
    
    public Ticket() {
        selectNum();
    }
    
    // Creates array for numbers
    int[] row = new int[LIMIT];
    public void selectNum() {
        
        //collecting 4 random numbers for the ticket
        for (int index = 0; index < LIMIT; index++) {
            num = (int) (Math.random() * MAX + CORRECTOR);
            //run method to stop same number being drawn twice
            sameNum();
            if (sameNumber = false) { //adds number to ticket if it isn't a repeat
                row[index] = num;
            }
        }
    }
    
    // method to stop same number being drawn twice
    public void sameNum() {
        for (int index = 0; index < LIMIT; index++) {
            if (num == row[index]) { //runs through the list, if the number is the same as one of the values of the list, records that the number is a repeat
                sameNumber = true;
            }
        }
    }
    
    public int[] returns() {
        return row; // return array
    }
}
