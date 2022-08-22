import java.util.HashMap;
import java.util.Scanner;

class Square extends Shape {
    private double area;
    private double perimeter;
    private double length;

    Square() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter integer length of square\n");
        try{
            double length = Double.parseDouble(reader.nextLine());
            setLength(length);
            calculateArea();
            calculatePerimeter();
            this.name="Square";
            HashMap<String,Double> properties=new HashMap<>();
            properties.put("Length",length);
            new printer(name,properties,perimeter,area);
        }catch (Exception e){
            System.out.println("Enter Valid length");
        }
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    protected void calculateArea() {
        this.area = Math.round( this.length * this.length);
    }

    @Override
    protected void calculatePerimeter() {
        this.perimeter = Math.round(4 * this.length);
    }
}
