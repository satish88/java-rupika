public class Interest {
    public float calculateSimpleInterest(float principle, float rate, String rateName,  float time, String timeName ){
       // Rate is annual basis;
        if (rateName == "annually" && timeName == "year") {
            float simpleInterest = (principle * rate * time) / 100.0f;
            return (simpleInterest);
        }

        if (rateName == "annually" && timeName == "month") {
            float simpleInterest = (principle * rate * time) / 1200.0f;
            return (simpleInterest);
        }

        if (rateName == "annually" && timeName == "day") {
            float simpleInterest = (principle * rate * time) / 36500.0f;
            return (simpleInterest);
        }

        // Rate is half yearly basis;
        if (rateName == "halfYearly" && timeName == "year") {
            float simpleInterest = (principle * 2 * rate * time) / 100.0f;
            return (simpleInterest);
        }

        if (rateName == "halfYearly" && timeName == "month") {
            float simpleInterest = (principle * 2 * rate * time) / 1200.0f;
            return (simpleInterest);
        }

        if (rateName == "halfYearly" && timeName == "day") {
            float simpleInterest = (principle * 2 * rate * time) / 36500.0f;
            return (simpleInterest);
        }

        // Rate is quaterly basis;
        if (rateName == "quaterly" && timeName == "year") {
            float simpleInterest = (principle * 4 * rate * time) / 100.0f;
            return (simpleInterest);
        }

        if (rateName == "quaterly" && timeName == "month") {
            float simpleInterest = (principle * 4 * rate * time) / 1200.0f;
            return (simpleInterest);
        }

        if (rateName == "quaterly" && timeName == "day") {
            float simpleInterest = (principle * 4 * rate * time) / 36500.0f;
            return (simpleInterest);
        }
        else{
            System.out.println("Information not available");
            return(0);

        }
    }
}
