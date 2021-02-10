public class NationalSymbol {
    public String indianSymbol(String type){
        if (type == "Flag" ) {
            return("Tiranga");
        }
        if (type == "Anthem" ) {
            return("Jana gana mana");
        }
        if (type == "Song") {
            return("Vande Matram");
        }
        if (type == "Currency") {
            return("Indian Rupee");
        }
        if (type =="River" ) {
            return("Ganga");
        }
        if (type == "Flower") {
            return("Indian Lotus");
        }
        if (type == "Fruit" ) {
            return("Mango");
        }
        if (type == "Tree") {
            return("Indian Banyan");
        }
        if (type == "Animal") {
            return("Bengal Tiger");
        }
        if (type == "Bird") {
            return("Indian Peacock");
        }
        if (type == "Aquatic animal" ) {
            return("Ganges river Dolphin");
        }
        if (type == "Reptile") {
            return("King Cobra");
        }
        if (type == "Game") {
            return("Hockey");
        }
        if (type == "Book") {
            return("Gita");
        }
        else{
            return("Information not available ");
        }



    }
}
