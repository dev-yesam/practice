import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        
        // Array
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks1 = {"Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun"};

        // Set length of Array
        String[] weeks2 = new String[7];
        weeks2[0] = "Mon";

        System.out.println(weeks2[0]);
        System.out.println(weeks2);

        for (int i = 0; i < weeks1.length; i++) {
            System.out.println(weeks1[i]);
        }

        // ArrayIndexOutOfBoundsException
        System.out.println(weeks2[6]);
        // System.out.println(weeks2[7]);


        // List - ArrayList
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches.get(1));

        System.out.println(pitches.size());
        System.out.println(pitches.contains("141"));
        System.out.println(pitches.indexOf("129"));
        System.out.println(pitches.remove(0));
        System.out.println(pitches.indexOf("129"));


        


    }
}