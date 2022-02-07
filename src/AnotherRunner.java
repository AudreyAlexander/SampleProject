import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 3);
        Car car2 = new Car("Toyota", 4);
        Car car3 = new Car("Toyota", 5);


        Car[] carsArray = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.print(carList);
    }

}
