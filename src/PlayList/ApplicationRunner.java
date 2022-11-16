
package PlayList;

import PlayList.business.Coordinator;
import PlayList.presentation.View;
import java.util.*;

public class ApplicationRunner {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

Coordinator coord = new Coordinator();
View v = new View(coord);
v.startUI();

    }
}
