package dome;

/**
 * The Item class represents a multi-media item.
 * Information about the item is stored and can be retrieved.
 * This class serves as a superclass for more specific itms.
 * @author Papanastasis Zacharias
 * @since 16.11.2015
 * @version 1.0
 */
public class Item {
    private String title;
    private int playingTime;
    private boolean gotIt;

    /**
     * Initialise the fields of the item.
     * @param theTitle The title of this item.
     * @param time The running time of this item.
     */
    public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
        gotIt = false;
    }
    
    /**
     * Gets the title of the item.
     * @return the title of the multimedia item. 
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * Gets the total playtime of the item.
     * @return the playing time in mins of the multimedia item. 
     */
    public int getPlayingTime(){
        return playingTime;
    }

   /**
     * Set the flag indicating whether the user owns this item or not.
     * @param ownIt true if the user owns the multimedia item, false otherwise.
     */
    public void setOwn(boolean ownIt) {
        gotIt = ownIt;
    }

    /**
     * Gets the owership flag for the item.
     * @return true if the user owns a copy of this multimedia item.
     */
    public boolean getOwn() {
        return gotIt;
    }

    /**
     * Print details about this item to the text terminal.
     */
    public void print() {
        System.out.print("Title: " + title + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
    }
}
