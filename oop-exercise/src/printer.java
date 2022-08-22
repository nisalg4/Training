import java.util.Map;

public class printer {
    printer(String name,Map<String,Double> properties, double perimeter, double area) {
        System.out.println("Shape: "+name);
        System.out.println("Properties: ");
        for (Map.Entry<String,Double> property:properties.entrySet()){
            System.out.println(property.getKey()+"="+property.getValue());
        }
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}
