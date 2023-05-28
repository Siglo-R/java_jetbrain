package IntAbstract;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    /* car1,car2,car3, ..... car10000
    c1--->car1
    c2--->car2
    c3--->car3
    c4--->car4
    c5--->car5
    ...
    c10000--->car10000
    0(1)
     */
    public static void main(String[] args) {
        Map<String, String> cars = new HashMap<>();
        cars.put("c1", "Innova");
        cars.put("c2", "FJ Cruiser");
        cars.put("c3", "Expander");
        cars.put("c4", "Vios");
        cars.put("c5", "Honda");
        cars.put("c6", "Tesla");

        System.out.println(cars.size());
        System.out.println(cars.keySet());
        System.out.println(cars.containsKey("c7"));
        System.out.println(cars.get("c2"));
        System.out.println(cars.containsValue("FJ Cruiser"));

        System.out.println("++=++=++");
        Scanner scanner = new Scanner(System.in);
        String nextDouble= scanner.next();
        System.out.println(Double.valueOf(nextDouble));
    }
}
