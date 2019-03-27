package A3_p1;

public class A3_p1 {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(40);
        rectangle1.setWidth(4);

        System.out.println("Rectangle1 :: Height : "+rectangle1.getHeight()+" Width : "+rectangle1.getWidth()+" Area : "+rectangle1.getArea()+" Perimeter : "+rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Rectangle2 :: Height : "+rectangle2.getHeight()+" Width : "+rectangle2.getWidth()+" Area : "+rectangle2.getArea()+" Perimeter : "+rectangle2.getPerimeter());
        }
}
