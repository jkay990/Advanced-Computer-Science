public class RectangleTester {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle other = new Rectangle();
        System.out.println(rect.equals(other));
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());
        System.out.println(rect.calculateDiagonal());
    }

}
