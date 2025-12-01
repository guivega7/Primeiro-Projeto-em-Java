import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarRepository repository = new CarRepository();
        Car fordka = new Car("Ford Ka","White",2013,35.990);
        repository.save(fordka);
        System.out.println(repository.findAll());
    }
}
