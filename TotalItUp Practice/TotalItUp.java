public class TotalItUp {
    private int numOne, answer;
    private int numTwo;
    public void setNums(int n1, int n2) {
        this.numOne = n1;
        this.numTwo = n2;
    }

    public void add(){
         answer = this.numOne + this.numTwo;
    }



    public void print(){
        System.out.println(numOne + "+" + numTwo + "=" + answer);
    }
}
