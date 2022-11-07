package questions.questionOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Qn1Solution {
    /*
    There are 100 doors in a row that are all initially closed. You make 100 passes by the doors.
The first time through, visit every door and 'toggle' the door (if the door is closed, open
it; if it is open, close it). The second time, only visit every 2nd door (i.e., door #2, #4, #6, ...)
and toggle it. The third time, visit every 3rd door (i.e., door #3, #6, #9, ...), etc., until you
only visit the 100th door.
     */

    public static void main(String[] args) {

        /*
        All doors are closed initially,so lets close them
         */
        //traverseDoors();
        /*
        Traverse all second doors #2 #4 #6
         */
        Door door = new Door();
        // traverseEachSecondDoor(door);

        /*
        Traverse every third doors i.e #3 #6 #9
         */
        // traverseEachSecondDoor(door);

    }

    static void traverseDoors() {
        //Doors closed initially
        List<String> doors = new ArrayList<>();

        //close all doors
        for (int i = 0; i <= 100; i++) {
            doors.add("Closed ");
        }

        System.out.print(doors);
        /*
        BIG - O Notation
        Time Complexity: - 0(n)
        Space Complexity: - 0(1)
         */
    }

    static void toggleDoors(Door door) {
        //check the door status.. if opened close and vice versa
        if (Objects.equals(door.status, "Closed")) {
            door.setStatus("Open");
        } else {
            door.setStatus("Closed");
        }
    }

    static void traverseEachSecondDoor(Door door) {
        for (int i = 0; i <= 100; i += 2) {
            if (i != 0) {
                toggleDoors(door);
                System.out.println(i);
            }
        }
        /*
        BIG - O Notation
        Time Complexity: - 0(n)
        Space Complexity: - 0(1)
         */
    }

    static void traverseEachThirdDoor(Door door) {
        for (int i = 0; i <= 100; i += 3) {
            if (i != 0) {
                toggleDoors(door);
                System.out.println(i);
            }
        }
        /*
        BIG - O Notation
        Time Complexity: - 0(n)
        Space Complexity: - 0(1)
         */
    }


}
