package dome;

/**
 * The CD class is subclass of the Item class and represents a CD object. 
 * Information about a CD is stored and can be retrieved.
 * @author Papanastasis Zacharias
 * @since 16.11.2015
 * @version 1.0
 */
public class CD extends Item {
    private String artist;
    private int numberOfTracks;

    /**
     * Initialize the CD.
     * @param theTitle The title of the CD.
     * @param theArtist The artist of the CD.
     * @param tracks The number of tracks on the CD.
     * @param time The playing time of the CD.
     */
    public CD(String theTitle, String theArtist, int tracks, int time) {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * Gets the artist of the CD.
     * @return The artist for this CD.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Gets the number of tracks on the CD.
     * @return The number of tracks on this CD.
     */
    public int getNumberOfTracks() {
        return numberOfTracks;
    }
    
    /**
     * Print details about this item to the text terminal.
     */
    public void print() {
        System.out.print("Title: " + getTitle() + " (" + getPlayingTime() + " mins)" 
                + ", by " + artist);
        if(getOwn()) {
            System.out.println("*");
        } else {
            System.out.println();
        }
    }
}