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
        int i=0;
        
        Iterator iterator = routes.iterator();
        
       while( iterator.hasNext()) {
            Route r = (Route) iterator.next();
            System.out.println(r.getData());
        }

       

      
//
//        
//
//        Instance customer = solution.getInstance(id);
        //System.out.print(customer.getX());

        SEFrame frame = new SEFrame();

    }
}
