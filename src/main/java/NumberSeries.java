public class NumberSeries {

    //if starting no. is 'a' and last no. is 'target';
    // find the sum of all the multiples of 3 and 5 in between;

    public static int sum(int a, int target){


        int result= 0;
        if (target > a) {
            for ( int counter = a; counter <= target; counter = counter + 1) {
                if (counter % 3 == 0 || counter % 5 == 0) {
                    result = result + counter;

                }
            }
        }
        else {
            for ( int counter = a; counter >= target; counter = counter - 1) {
                if (counter % 3 == 0 || counter % 5 == 0) {
                    result = result + counter;

                }
            }
        }
//       if (a <=0 && target < a ){
//            for (int counter = a; counter >= target; counter = counter - 1) {
//                if (counter % 3 == 0 || counter % 5 == 0) {
//                    result = result + counter;
//
//                }
//            }
//        }
//        if (a <=0 && target > a ){
//            for (int counter = a; counter <= target; counter = counter + 1) {
//                if (counter % 3 == 0 || counter % 5 == 0) {
//                    result = result + counter;
//
//                }
//            }
//        }
        return (result);
    }


    public static void main(String[]args){
        int result = sum(1, -2);
        System.out.println(result);
    }
}
