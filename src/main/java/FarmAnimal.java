public class FarmAnimal {

    public String Sounds(String name){
        System.out.println("Make sure you provide first letter capital in Animal name!");
        if (name == "Dog"){
            String s = ("bark or woof");
            return(name + " sounds " + s);
        }

        if (name == "Cat") {
            String s = ("meow");
            return(name + " sounds " + s);
        }

        if (name == "Pig") {
            String s = ("oink");
            return(name + " sounds " + s);
        }

        if (name == "Sheep") {
            String s = ("baa");
            return(name + " sounds " + s);
        }

        if (name == "Cow") {
            String s = ("moo");
            return(name + " sounds " + s);
        }

        if (name == "Horse") {
            String s = ("neigh");
            return(name + " sounds " + s);
        }

        if (name == "Duck") {
            String s = ("quack");
            return(name + " sounds " + s);
        }

        if (name == "Chicken") {
            String s = ("cluck");
            return(name + " sounds " + s);
        }

        else{
            System.out.println("Invalid Input");
            return ("Sorry, information is not available.");
        }






    }
}
