import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> toys = new ArrayList<>();

    //добавление новой игрушки в магазин
    public void addToy(int toyID, String name, int quantity, double weight) {
        Toy toy = new Toy(toyID, name, quantity, weight);
        toys.add(toy);
    }
}
