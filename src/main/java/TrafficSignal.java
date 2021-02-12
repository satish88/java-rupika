public class TrafficSignal {
    public String direction(String signalColour){

        if(signalColour == "red"){
            return("Red says Stop!");
        }
        if(signalColour == "yellow"){
            return("Yellow says Stop & Wait!");
        }
        if(signalColour == "green"){
            return("Green says Go!");
        }
        else{
            return("Invalid Input");
        }
    }
}
