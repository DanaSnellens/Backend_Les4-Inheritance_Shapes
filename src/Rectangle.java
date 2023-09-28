public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int posx, int posy, String color, int length, int width) {
        super(posx, posy, color);
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
