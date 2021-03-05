public class NumberSeries {

    // Find the sum of 1 to n numbers.
  public static int seriesSum (int n){
      int result = 0;
      if (n > 1){
          for (int counter = 1; counter <= n;  counter++){
              result = result + counter;
          }
      }
      else if (n < 1) {
          for (int counter = 1; counter >= n;  counter-- ) {
              result = result + counter;
          }
      }
      return result;
  }





    //if starting no. is 'a' and last no. is 'target';
    // find the sum of all the multiples of 3 and 5 in between;

    public static int sum(int a, int target) {

        int result = 0;
        if (target > a) {
            for (int counter = a; counter <= target; counter = counter + 1) {
                if (counter % 3 == 0 || counter % 5 == 0) {
                    result = result + counter;

                }
            }
        }
        else {
            for (int counter = a; counter >= target; counter = counter - 1) {
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
        return result;
    }


    // sum or product of 1 to n numbers.
    public static int calculateForSeries(int n, String operation){
      int result = 0;
      if (operation == "sum"){
          result = 0;
          if (n>0){
              for(int counter = 1; counter<= n; counter++){
                  result = result + counter;
              }
          }
          else{
              for(int counter = 1; counter >=n; counter--){
                  result = result + counter ;
              }
          }
      }
      else if (operation == "multiply") {
           result = 1;
          if(n>0){
              for(int counter = 1; counter <= n; counter++ ){
                  result = result * counter;
              }
          }
          else{
              for(int counter = -1; counter >= n; counter--){
                  result = result * counter;
              }
          }
      }
      return result;
    }



    public static void main(String[]args){
        int result = sum(1, -5);
        System.out.println(result);

        result = seriesSum(-3);
        System.out.println(result);

        result = calculateForSeries(-5, "sum");
        System.out.println(result);
    }
}
