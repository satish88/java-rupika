public class NationalSymbol {
    public String indianSymbol(String type){
        if (type == "flag" ) {
            return("Tiranga");
        }
        if (type == "anthem" ) {
            return("Jana gana mana");
        }
        if (type == "song") {
            return("Vande Matram");
        }
        if (type == "currency") {
            return("Indian Rupee");
        }
        if (type =="river" ) {
            return("Ganga");
        }
        if (type == "flower") {
            return("Indian Lotus");
        }
        if (type == "fruit" ) {
            return("Mango");
        }
        if (type == "tree") {
            return("Indian Banyan");
        }
        if (type == "animal") {
            return("Bengal Tiger");
        }
        if (type == "bird") {
            return("Indian Peacock");
        }
        if (type == "aquatic animal" ) {
            return("Ganges river Dolphin");
        }
        if (type == "reptile") {
            return("King Cobra");
        }
        if (type == "game") {
            return("Hockey");
        }
        if (type == "book") {
            return("Gita");
        }
        else{
            return("Information not available ");
        }



    }
}
