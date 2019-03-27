package A3_p1;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle()
    {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    public double getArea()
    {
        return this.height*this.width;
    }

    public double getPerimeter()
    {
        return (this.height+this.width)*2;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getHeight()
    {
        return this.height;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
