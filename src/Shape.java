public abstract class Shape {
    static int numShapes = 0;
    int posx;
    int posy;
    String color;

    public Shape(int posx, int posy, String color) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        numShapes ++;
    }

    abstract void draw();
}
