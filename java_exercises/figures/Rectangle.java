package figures;

public class Rectangle extends Figure {
    private int short_side, long_side;

    public Rectangle(String name, int short_side, int long_side) {
        super(name);
        this.short_side = short_side;
        this.long_side = long_side;
    }

    @Override
    void computeArea() {
        System.out.println("The area of " + getFigureName() + " is " + (long_side * short_side));
    }

    @Override
    void computePerimeter() {
        System.out.println("The perimeter of " + getFigureName() + " is " + (2 * long_side + 2 * short_side));
    }

    public int getLong_side() {
        return long_side;
    }

    public void setLong_side(int long_side) {
        this.long_side = long_side;
    }

    public int getShort_side() {
        return short_side;
    }

    public void setShort_side(int short_side) {
        this.short_side = short_side;
    }
}