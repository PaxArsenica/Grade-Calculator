import java.util.ArrayList;
public class Calculator {

    public static void main(String[] args) {
        Course math = new Course(4, "Math 2550");
        System.out.println("This course is: " + math.getName());
        System.out.println("This course is " + math.getWeight()  + " credits");
    }

}