public class Unit0Exercises {
    
    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();


        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true


        // testing diff21() method
        System.out.println(obj.diff21(19)); // ouput: 2
       
        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
    
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation; 
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    
    public double flooringCalculator(double squareFeet, double pricePerSquareFoot) {
        if (squareFeet <= 0 || pricePerSquareFoot <= 0) {
            return 0.0;
        }
        return squareFeet * pricePerSquareFoot;
    }
}