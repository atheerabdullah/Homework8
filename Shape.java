public class Shape {
    private String color;
    private boolean filled;


    //constructor
    public Shape(String color, boolean filled) {
    }

    public Shape() {
        this.color="green";
        this.filled=true;

    }
    // getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // methods
    public String toString() {
        return String.format("A Shape with color of ", color, filled ? "filled" : "not filled");
    }

    public int raisedSalary(int percent) {
        return percent;
    }
}

