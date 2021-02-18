public class Satish2 {
    public static void main1(String[] args) {
        int x = 0;
        int target = 15;

        while (x < target) {
            System.out.println("My number is =" + x);
            x = x + 5;
        }
    }

    public static void main2(String[] args) {
        // initialize
        int x = 13;
        int counter = 1;

        // condition
        while (counter <= 20) {
            System.out.println("My number is =" + x*counter);
            // update
            counter = counter + 1;
        }
        System.out.println("End");
    }

    public static void main3(String[] args) {

        int x = 13;

        for (int counter = 1; counter <= 10; counter = counter + 1) {
            System.out.println("My number is =" + x*counter);
        }

        System.out.println("End");
    }

    // factorial value -- loop
    // 2^3 = 2 * 2 * 2
    public static void main4(String[] args) {

        int limit = 10;
        int start = 1;

        for (int number = start; number <= limit; number = number + 1) {
            if (number % 2 == 0) {
                System.out.println("My even number is =" + number);
            } else {
                System.out.println("My odd number is = " + number);
            }
        }

        System.out.println("End");
    }

    public static void main(String[] args) {

         String name = "Satish";
         int length = 25;

        for (int number = name.length(); number <= length; number = number + 1) {
            name = name + number;
            System.out.println(name);
        }

        System.out.println("End");

        float x = 5.0f;
        float y = 4.999f;
        Assert.assertEquals(x, y, "same size");
        Assert.assertTrue(x-y < 0.01, "same size");
    }


}
