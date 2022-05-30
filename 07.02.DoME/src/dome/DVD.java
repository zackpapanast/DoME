package dome;

/**
 * The DVD class is subclass of the Item class and represents a DVD object. 
 * Information about the DVD is stored and can be retrieved. 
 * We assume that we only deal with movie DVDs at this version.
 * @author Papanastasis Zacharias
 * @since 16.11.2015
 * @version 1.0
 */
public class DVD extends Item {
    private String director;

    /**
     * Constructor for objects of class DVD.
     * @param theTitle The title of this DVD.
     * @param theDirector The director of this DVD.
     * @param time The running time of the main feature.
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * Gets the director of the movie in the DVD.
     * @return The director for this DVD.
     */
    public String getDirector() {
        return director;
    }
}

