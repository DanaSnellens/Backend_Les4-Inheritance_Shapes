public class Circle extends Shape {
    int radius;

    public Circle(int posx, int posy, String color, int radius) {
        super(posx, posy, color);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing Circle with color " + this.color);
    }
}
