public class Marriage {

    public String eligibility(String gender, int age){

        if (gender == "Male" && age > 21 || gender == "Male" && age == 21){
            return ("Male eligible for marriage.");
        }

        if (gender == "Female" && age > 18 || gender == "Female" && age == 18){
            return ("Female eligible for marriage.");
        }
        else{
            return("Not eligible for marriage.");
        }
    }
}
