package figures;

public class Square extends Figure {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    @Override
    void computeArea() {
        System.out.println("The area of " + getFigureName() + " is " + (Math.pow(side, 2)));
    }

    @Override
    void computePerimeter() {
        System.out.println("The perimeter of " + getFigureName() + " is " + (4 * side));
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}