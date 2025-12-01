import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> garage = new ArrayList<>();

    public void save(Car car){
        garage.add(car);
    }

    public List<Car> findAll(){
        return garage;
    }
}
