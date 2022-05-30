package dome;

import java.util.ArrayList;

/**
 * The database class provides a facility to store entertainment item objects.
 * A list of all multimedia items can be printed to the terminal.
 * 
 * This version does not save the data to disk and it does not 
 * provide any search functions.
 * 
 * @author Papanastasis Zacharias
 * @since 16.11.2015
 * @version 1.0
 */
public class Database {
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database() {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem) {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the text terminal.
     */
    public void list() {
        for(Item item : items) {
            item.print();
            //System.out.println();   // empty line between items
        }
    }
}
