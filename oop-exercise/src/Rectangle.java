import java.util.HashMap;
import java.util.Scanner;

class Rectangle extends Shape {
    private double area;
    private double perimeter;
    private double length;
    private double breadth;

    Rectangle() {
        Scanner reader = new Scanner(System.in);
        try{
            System.out.print("Enter length of rectangle\n");
            double length = Double.parseDouble(reader.nextLine());
            System.out.print("Enter breadth of rectangle\n");
            double breadth = Double.parseDouble(reader.nextLine());
            setLength(length);
            setBreadth(breadth);
            calculateArea();
            calculatePerimeter();
            this.name="Rectangle";
            HashMap<String,Double> properties=new HashMap<>();
            properties.put("Length",length);
            properties.put("Breadth",breadth);
            new printer(name,properties,perimeter,area);
        }
        catch (Exception e){
            System.out.println("Enter valid values for Rectangle");
        }
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    @Override
    protected void calculateArea() {
        this.area =  Math.round(this.length * this.breadth);
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = Math.round((2 * this.length)+(2*this.breadth));
    }
}