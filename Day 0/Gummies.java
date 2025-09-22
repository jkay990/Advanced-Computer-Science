public class Gummies {
    
private String color; // = "red"
private String shape; // = "octagon"
private String flavor; // = "juicy"
private int pieces; // 6 
private double weight; //5.5 grams
private String kind; //Gushers

public Gummies(){
    color = "red";
    shape = "octagon";
    flavor = "juicy";
    pieces = 6;
    weight = 5.5;
    kind = "Gushers";
}


//open
public void open() {
    System.out.println("Bag is open");
}
//throw away
public void ThrowAway() {
    System.out.println("Gushers are gone");
}
//eat
public void eat() {
    weight = 0;
}
//take one piece
public void EatAPiece() {
    pieces = pieces - 1;
    System.out.println("There are " + pieces + " pieces left");

    if(pieces < 1) {
        System.out.println("The bag is empty");
    }
}
public String toString(){
return "this is also a valid string" + color;
}
}
