public class Sample {
    public static void main(String[]args){
        int a = 4;
        int target = 24;
        while (a< target){
            System.out.println("number is " + a);
            a= a+4;

        }


        int b = 20;
        int counter = 1;
        while(counter<= 10){
            System.out.println(b* counter);
            counter = counter+1;
        }

        String name= "SSC EXAM";
        int length = 14;
        for(int number = name.length(); number<= length; number = number+1){
            name = name +number;
            System.out.println(name);
        }




    }
}
