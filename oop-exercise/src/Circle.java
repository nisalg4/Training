import java.util.HashMap;
import java.util.Scanner;

class Circle extends Shape {
    private double area;
    private double perimeter;
    private double radius;

    Circle() {
        Scanner reader = new Scanner(System.in);

        try {
            System.out.print("Enter radius of circle\n");
            double radius = Double.parseDouble(reader.nextLine());
            setRadius(radius);
            calculateArea();
            calculatePerimeter();
            this.name="Circle";
            HashMap<String,Double> properties=new HashMap<>();
            properties.put("Radius",radius);
            new printer(name,properties,perimeter,area);

        }catch (Exception e){
            System.out.println("Enter valid radius");
        }
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    protected void calculateArea() {
        this.area =Math.round(Math.PI * this.radius*this.radius) ;
    }

    @Override
    protected void calculatePerimeter() { this.perimeter = Math.round(2 * Math.PI * this.radius);
    }
}