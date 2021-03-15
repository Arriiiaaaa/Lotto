
/**
 * Draw numbers for lotto draw
 *
 * @author Arianna
 * @version 11/3/21
 */
public class Ball
{
    private int num; // number assigned to ball
    private final int NUM_RESULTS = 40; // number of possible results
    private final int CORRECTOR = 1; // to stop ball from rolling a 0
    
    /**
     * Draw ball
     */
    
    public Ball() {
        draw(); // draws number
    }

    /**
     * Draw ball by randomly choosing a face value
     */
    public void draw()
    {
        num = (int) (Math.random() * NUM_RESULTS + CORRECTOR); // chooses a random number between 0 and 40, 1 is added to prevent rolling a 1
    }
    
    /**
     * Returns face
     */
    public int getNum()
    {
        return num; // gets ball number
    }
}
