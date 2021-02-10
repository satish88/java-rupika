public class Marriage {
    public String maleEligibility(int age){

        if (age > 21 || age == 21){
            return ("Male eligible for marriage.");
        }
        else{
            return("Male not eligible for marriage.");
        }
    }
    public String femaleEligibility(int age){

        if (age > 18 || age == 18){
            return ("Female eligible for marriage.");
        }
        else{
            return("Female not eligible for marriage.");
        }
    }
}
