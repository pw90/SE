package se;

import entity.Instance;
import entity.Route;
import entity.Solution;
import gui.SEFrame;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import readwriter.DBManager;
import readwriter.FileManager;

/**
 *
 * @author Rafał
 */
public class SE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileManager fileManager = new FileManager();
        fileManager.readFileSolution("resources/solution/C1_2_9.txt");
        fileManager.readFileInstance("resources/instance/C1_2_9.txt");
        Solution solution = fileManager.getSolution();

//        DBManager db = new DBManager();
//        db.create(solution);
        Collection routes = solution.getRouteCollection();
        
        for (Iterator iterator = routes.iterator(); iterator.hasNext();) {
            Route r = (Route) routes.iterator().next();
        
            List customers = r.getCustomers();
            for (Object customerID : customers) {
                Instance customer = solution.getInstance((int)customerID);
                System.out.print(customer.getX());
            }
            break;

        }

       

      
//
//        
//
//        Instance customer = solution.getInstance(id);
        //System.out.print(customer.getX());

        SEFrame frame = new SEFrame();

    }
}
