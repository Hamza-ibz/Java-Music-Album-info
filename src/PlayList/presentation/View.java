
package PlayList.presentation;

import static PlayList.ApplicationRunner.scanner;
import PlayList.business.Coordinator;

public class View {
    
    private Coordinator coord;

    public View(Coordinator c) {
        coord = c;
    }
    
    public void startUI(){
        coord.getAlbum();
                while (true) {
                System.out.println("-----------------------------------------");
                System.out.println("    WELCOME TO YOUR PLAYLIST");
                System.out.println("-----------------------------------------");
                System.out.println("");

                System.out.println("List Albums   ..................... 1");
                System.out.println("Select Albums ......................2");
                System.out.println("Search Titles ..................... 3");
                System.out.println("Exit .............................. 0");
//                System.out.println("");
                System.out.println("select from above >");
                String nq = scanner.next();
                if (nq.equals("0")) {
                    System.out.println("Exitting....");
                    break;
                } else if (nq.equals("1")) {

                    System.out.println("-----------------------------------------------------------------------------------------------------");
                    System.out.printf("| %-4s |%-50s| %-25s | %1s | %4s\n", "Rank", "Title", "Artist", "Year", "Sales" + "|");
                    System.out.println("-----------------------------------------------------------------------------------------------------");

                    for (int i = 0; i < coord.getStore().size(); i++) {
//                        System.out.println(coord.getStore().size());
                        System.out.printf("| %-4s|%-50s| %-25s | %1s | %4s\n", coord.getAlbum().get(i).getRank(), coord.getAlbum().get(i).getTitle(), coord.getAlbum().get(i).getArtist(), coord.getAlbum().get(i).getYear(), coord.getAlbum().get(i).getSales());
                    }
                    System.out.println("-----------------------------------------------------------------------------------------------------");

                } else if (nq.equals("2")) {
                    while (true) {
                        System.out.println("Enter album rank from list [1 - 20] :>");
                        String choice = scanner.next();

                        switch (choice) {

                            case "1":
                                System.out.println(coord.getAlbum().get(0));
                                break;
                            case "2":
                                System.out.println(coord.getAlbum().get(1));
                                break;
                            case "3":
                                System.out.println(coord.getAlbum().get(2));
                                break;
                            case "4":
                                System.out.println(coord.getAlbum().get(3));
                                break;
                            case "5":
                                System.out.println(coord.getAlbum().get(4));
                                break;
                            case "6":
                                System.out.println(coord.getAlbum().get(5));
                                break;
                            case "7":
                                System.out.println(coord.getAlbum().get(6));
                                break;
                            case "8":
                                System.out.println(coord.getAlbum().get(7));
                                break;
                            case "9":
                                System.out.println(coord.getAlbum().get(8));
                                break;
                            case "10":
                                System.out.println(coord.getAlbum().get(9));
                                break;
                            case "11":
                                System.out.println(coord.getAlbum().get(10));
                                break;
                            case "12":
                                System.out.println(coord.getAlbum().get(11));
                                break;
                            case "13":
                                System.out.println(coord.getAlbum().get(12));
                                break;
                            case "14":
                                System.out.println(coord.getAlbum().get(13));
                                break;
                            case "15":
                                System.out.println(coord.getAlbum().get(14));
                                break;
                            case "16":
                                System.out.println(coord.getAlbum().get(15));
                                break;
                            case "17":
                                System.out.println(coord.getAlbum().get(16));
                                break;
                            case "18":
                                System.out.println(coord.getAlbum().get(17));
                                break;
                            case "19":
                                System.out.println(coord.getAlbum().get(18));
                                break;
                            case "20":
                                System.out.println(coord.getAlbum().get(19));
                                break;
                            default:
                                System.out.println("--------------------------------------");
                                System.out.println("Please enter input from [1 - 20]");
                                System.out.println("");
                                continue;
                        }
                        break;
                    }
                } else if (nq.equals("3")) {
                    System.out.println("Enter search words or phrase >");
                    String wrd = scanner.next();
                    String ms = wrd.toLowerCase();
                    for (int i = 0; i < coord.getAlbum().size(); i++) {
                        if (hard(coord.getTraks().get(i)).toLowerCase().contains(ms)) {
                            System.out.println("------\n" + "Artist (" + coord.getAlbum().get(i).getArtist() + ") " + "Album (" + coord.getAlbum().get(i).getTitle() + ") \n" + "Matching song title(s):"
                                    + "\n------\n" + coord.getAlbum().get(i).getTrack(ms));
                        }
                    }

                } else {
                    System.out.println("Invalid Character...");
                    continue;
                }
                continue;
            }
    }
    
            public static String hard(String s) {
        String[] strak = s.split("\\(|\\)\\r?\\n|\\)");
        String st = "";

        for (int i = 0; i < strak.length; i = i + 2) {
            st = st + strak[i];
        }
        return st;
    }
        
}
