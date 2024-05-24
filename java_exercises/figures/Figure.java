package figures;

public abstract class Figure {
    private String figureName;

    // methods
    abstract void computeArea();
    abstract void computePerimeter();

    // constructor
    public Figure(String name) {
        figureName = name;
    }

    // getters and setters
    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }
}