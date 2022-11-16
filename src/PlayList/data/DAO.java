
package PlayList.data;

import PlayList.business.Album;
import java.util.ArrayList;

public interface DAO {
    public ArrayList<Album> getAlbum();
    public ArrayList<String> getStore();
    public ArrayList<String> getTraks();
}
