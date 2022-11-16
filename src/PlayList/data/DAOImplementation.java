
package PlayList.data;

import PlayList.business.Album;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DAOImplementation implements DAO {

    ArrayList<String> store;
    ArrayList<String> traks;

    @Override
    public ArrayList<Album> getAlbum() {
        ArrayList<Album> albums = new ArrayList<>();
        String filepath = System.getProperty("user.dir");

        String dataFile = filepath + File.separator + "albums.txt";

        File fileobj = new File(dataFile);

        Scanner input = null;

        try {
//            System.out.println(this.store.size());

            input = new Scanner(fileobj);
//            ArrayList<Album> albums = new ArrayList<>();
            input.useDelimiter("\\Z");

            String s = input.next().toString();
            String[] items = s.split("\n----------------------------------------------------------------------------------\\r?\\n|\n----------------------------------------------------------------------------------"); // creating a string array line by line
//            ArrayList<String> store = new ArrayList<>();
//            ArrayList<String> traks = new ArrayList<>();
            this.store = new ArrayList<>();
            this.traks = new ArrayList<>();

            for (int j = 0; j < items.length; j++) { // iterating through every element in array

                String line1 = items[j].substring(0, items[j].indexOf("\n"));
                String rest = items[j].substring(items[j].indexOf('\n') + 1);

                this.store.add(line1);
                this.traks.add(rest);
//                System.out.println(this.store.size());
            }

            String[] words = new String[this.store.size()];
            ArrayList<String> info = new ArrayList<>();
//            ArrayList<String> jst_titl = new ArrayList<>();
            for (int i = 0; i < this.store.size(); i++) {
//                String[] dunno = traks.get(i).split("\\(|\\)");
//                for(String w:dunno){
//                jst_titl.add(w);
//            }
//                System.out.println(jst_titl.get(1));
                String a = this.store.get(i);
                words = a.split(":");
                info.add(words[0]);
                info.add(words[1]);
                info.add(words[2]);
                info.add(words[3]);
                info.add(words[4]);
                info.add(this.traks.get(i));
            }

            int count = 0;

            for (int i = 0; i < this.store.size(); i++) {
                albums.add(new Album(Integer.parseInt(info.get(count)), info.get(count + 1), info.get(count + 2), info.get(count + 3), info.get(count + 4), info.get(count + 5)));
                count = count + 6;
            }
            Collections.sort(albums);

        } catch (FileNotFoundException fnf) {
            System.out.println("where is this file?");
            System.exit(0);

        } finally {
            input.close();
        }
//        System.out.println(this.store.size());
        return albums;
    }

    @Override
    public ArrayList<String> getStore() {
        return this.store;
    }

    @Override
    public ArrayList<String> getTraks() {
        return this.traks;
    }

}
