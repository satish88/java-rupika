public class TrafficSignal {
    public String direction(String signalColour){

        if(signalColour == "Red"){
            return("Red says Stop!");
        }
        if(signalColour == "Yellow"){
            return("Yellow says Stop & Wait!");
        }
        if(signalColour == "Green"){
            return("Green says Go!");
        }
        else{
            return("Invalid Input");
        }
    }
}
