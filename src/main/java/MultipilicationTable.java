public class MultipilicationTable {
    //write multiplication table for number n up to 12 multiple.
    public static int table(int n) {
        int value = 0;
        if (n != 0) {
            for (int counter = 1; counter <= 12; counter++) {
                value = n * counter;
                System.out.println(n + " *" + counter + " =" + value);
            }

        }
        else{
             value = 0;
            System.out.println("All values will be zero");
        }
        return value;
    }


    public static void main(String[] args){
        int value = table(8);
    }
}
