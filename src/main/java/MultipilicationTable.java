import java.util.ArrayList;
import java.util.List;

public class MultipilicationTable {
    //write multiplication table for number n up to 12 multiple.
    public static List<Integer> table(int n) {
        int value = 0;
        List<Integer>number = new ArrayList();

        if (n != 0) {
            for (int counter = 1; counter <= 12; counter++) {
                value = n * counter;
                //System.out.println(n + " *" + counter + " =" + value);
                number.add(value);
            }

        }
        else{
             value = 0;
            System.out.println("All values will be zero");
        }
        return number;
    }


    public static void main(String[] args) {

        List<Integer> value = table(-8);
        for (int i = 0; i < value.size(); i++) {
            System.out.println(value.get(i));
        }
    }
}
