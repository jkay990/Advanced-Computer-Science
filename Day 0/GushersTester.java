public class GushersTester{
    

    public static void main (String[] args){
        System.out.println("Yo whats up!");

        Gummies CafeteriaSnack = new Gummies();
        CafeteriaSnack.ThrowAway();
        CafeteriaSnack.eat();
        CafeteriaSnack.open();
        CafeteriaSnack.EatAPiece();

        Gummies CafeteriaSnack2 = new Gummies();
        System.out.println (CafeteriaSnack.equals(CafeteriaSnack2));
    }
    

 
    // public int multiply(int a, int b) {


    // }
}