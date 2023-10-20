import java.util.ArrayList;
import java.util.List;

public class ToyStore {
    private List<Toy> availableToys = new ArrayList<>();

    //добавление новой игрушки в магазин
    public void addNewToy(int toyId, String toyName, int toyQuantity, double toyWeight) {
        Toy newToy = new Toy(toyId, toyName, toyQuantity, toyWeight);
        availableToys.add(newToy);
    }

    // Обновление веса (частоты выпадения) игрушки
    public void updateToyWeight(int toyId, double newToyWeight) {
        for (Toy toy : availableToys) {
            if (toy.getToyId() == toyId) {
                toy.setToyWeight(newToyWeight);
                break;
            }
        }
    }
}
