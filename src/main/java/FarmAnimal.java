public class FarmAnimal {

    public String Sounds(String name){
        if (name == "dog"){
            String s = ("bark or woof");
            return(name + " sounds " + s);
        }

        if (name == "cat") {
            String s = ("meow");
            return(name + " sounds " + s);
        }

        if (name == "pig") {
            String s = ("oink");
            return(name + " sounds " + s);
        }

        if (name == "sheep") {
            String s = ("baa");
            return(name + " sounds " + s);
        }

        if (name == "cow") {
            String s = ("moo");
            return(name + " sounds " + s);
        }

        if (name == "horse") {
            String s = ("neigh");
            return(name + " sounds " + s);
        }

        if (name == "duck") {
            String s = ("quack");
            return(name + " sounds " + s);
        }

        if (name == "chicken") {
            String s = ("cluck");
            return(name + " sounds " + s);
        }

        else{
            System.out.println("Invalid Input");
            return ("Sorry, information is not available.");
        }






    }
}
