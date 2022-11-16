
package PlayList.business;


public class Album implements Comparable<Album>{

    private int rank;
    private String title;
    private String artist;
    private String year;
    private String sales;
    private String tracks;

    public Album() {
        this.setRank(0);
        this.setArtist("");
        this.setSales("");
        this.setTitle("");
        this.setTracks("");
        this.setYear("");
    }

    public Album(int rank, String title, String artist, String year, String sales, String tracks) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.sales = sales;
        this.tracks = tracks;
    }

    public int getRank() {
        return this.rank;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getYear() {
        return this.year;
    }

    public String getSales() {
        return this.sales;
    }

    public String getTracks() {
        String[] titl = this.tracks.split("\\(|\\)\\r?\\n|\\)");
        String tet = "";
        int j = 1;
        int count = 1;
        for (int i = 0; i < titl.length; i = i + 2, j = j + 2) {
            String[] time = titl[j].split(":");
            tet = tet + "|" + String.format("%-4s", count) + "|" + String.format("%-80s", titl[i]) + "|" + String.format("%4s", time[0]) + "|" + String.format("%4s", time[1]) + "|" + "\n";
            count++;
            if (!(j < titl.length - 2)) {
                break;
            }
        }
        return tet;
    }

    public String getTrack(String wrd) {
        String[] titl = this.tracks.split("\\(|\\)\\r?\\n|\\)");
        String ms = wrd.toLowerCase();
        char ch;
        String tet = "";
        int count = 1;
        for (int i = 0; i < titl.length; i = i + 2) {

            if (titl[i].toLowerCase().contains(ms)) {
                tet = tet + "Track "+count + ". " + titl[i].toLowerCase().replaceAll(ms, ms.toUpperCase())+"\n";
            }
            count++;
        }
        return tet;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public void setTracks(String tracks) {
        this.tracks = tracks;
    }
    
    @Override
    public int compareTo(Album other){
    if(other.getRank()>this.getRank()){
    return -1;
    }
      if(other.getRank()<this.getRank()){
    return 1;
    }
      return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album title:          " + this.getTitle() + "\n");
        sb.append("Artist:               " + this.getArtist() + "\n");
        sb.append("Year of release:      " + this.getYear() + "\n");
        sb.append("Sales to date:        " + this.getSales() + "\n");
        sb.append("Rank:        " + this.getRank() + "\n");
        sb.append("\n");
        sb.append("Track list:           \n" + "-------------------------------------------------------------------------------------------------\n");
        sb.append("|" + String.format("%-4s", "No.") + "|" + String.format("%-80s", "Title") + "|" + String.format("%4s", "Mins") + "|" + String.format("%4s", "Secs") + "|" + "\n");
        sb.append("-------------------------------------------------------------------------------------------------\n");

        sb.append(getTracks());
        sb.append("-------------------------------------------------------------------------------------------------\n");

        return sb.toString();
    }

}
