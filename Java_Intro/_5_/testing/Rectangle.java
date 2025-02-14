package Java_Intro._5_.testing;


public class Rectangle {
    private int height;
    private int width;

    public void setSize(int heightVal, int widthVal) {
        height = heightVal;
        width = widthVal;
    }

    public int getArea() {
        return width * width;
    }

    public int getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
