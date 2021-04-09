package Ke_Thua;

public class Cylinder extends Circle{
    private double height;
    public static void main(String[] args) {
        Cylinder circle = new Cylinder(10,"red",10);
        System.out.println(circle.volumeCylinder());
    }
    public Cylinder(double radius,String color,double height){
        super(radius,color);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volumeCylinder(){
        return getArea()*height;
    }
}
