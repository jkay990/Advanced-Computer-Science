public class Rectangle {
    private int length;
    private int width;
    private int area;
    private int perimeter;
    private double diagonal;

    public Rectangle() {
        width = 10;
        length = 20;
    }

    public Rectangle(int newLength, int newWidth) {
        length = newLength;
        width = newWidth;
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.length && this.width == other.width){
            return true;
        }
        else {
            return false;
        }

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String toString() {
        return "I am a rectangle, my length is" + length + "and my width is" + width; 
    }

    public int calculateArea() {
        area = length * width;
        return area;
    }

    public int getArea() {
        calculateArea();
        return area;
    }

    public int calculatePerimeter() {
        perimeter = length * 2 + width * 2; 
        return perimeter;
    }

    public int getPerimeter() {
        calculatePerimeter();
        return perimeter;
    }

    public double calculateDiagonal() {
        diagonal = Math.sqrt(width * width + length * length);
        return diagonal; 
    }

    public double getDiagonal() {
        calculateDiagonal();
        return diagonal;
    }

}
