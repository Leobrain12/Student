public class Ball
{
    private String color;
    private double diameter;

    public Ball(String c, double d) {
        this.color = c;
        this.diameter = d;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double d) {
        this.diameter = d;
    }

    public String toString() {
        return "Мяч цвета " + color + " с диаметром " + diameter + " см";
    }
}
