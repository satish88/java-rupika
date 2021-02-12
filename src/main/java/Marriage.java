public class Marriage {

    public String eligibility(String gender, int age){

        if (gender == "male" && age > 21 || gender == "male" && age == 21){
            return ("Male eligible for marriage.");
        }

        if (gender == "female" && age > 18 || gender == "female" && age == 18){
            return ("Female eligible for marriage.");
        }
        else{
            return("Not eligible for marriage.");
        }
    }
}
