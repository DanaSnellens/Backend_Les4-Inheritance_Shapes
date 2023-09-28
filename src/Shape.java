public abstract class Shape {
    int posx;
    int posy;
    String color;

    public Shape(int posx, int posy, String color) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
    }

    abstract void draw();
}
