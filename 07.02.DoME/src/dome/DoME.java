package dome;

/**
 * This project simulates a simple facility to store multimedia item objects. 
 * The multimedia items, which can be either music CDs or movie DVDs, can be stored in database.
 * The functionality offered by the database includes the storage of the items in a list
 * and the printing of items' information to the text terminal.
 * The current version does not save the data to disk and does not provide any search functionality.
 * @author Papanastasis Zacharias
 * @since 16.11.2015
 * @version 1.0
 */
public class DoME {

    public static void main(String[] args) {
        Database db = new Database();

        DVD dvd1 = new DVD("A Clockwork Orange", "Kubrick", 118);
        dvd1.setOwn(true);
        db.addItem(dvd1);
        
        CD cd1 = new CD("Skyfall", "Adele", 1, 4);
        cd1.setOwn(true);
        db.addItem(cd1);
        
        DVD dvd2 = new DVD("Kill Bill V. I", "Quentin Tarantino", 111);
        db.addItem(dvd2);

        
        db.list();
    }
}
