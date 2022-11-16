
package PlayList.business;

import PlayList.data.DAO;
import PlayList.data.DAOImplementation;
import java.util.ArrayList;

public class Coordinator {
    
    private DAO dao;

    public Coordinator() {
         dao = new DAOImplementation();
    }
    
    public ArrayList<Album> getAlbum(){
    
        return dao.getAlbum();
    }
        public ArrayList<String> getStore(){
        
            return dao.getStore();
        }
    public ArrayList<String> getTraks(){
    
        return dao.getTraks();
    }
}
