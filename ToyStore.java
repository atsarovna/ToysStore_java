import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    // Выбор призовой игрушки
    public Toy choosePrizeToy() {
        double totalWeight = 0.0;
        for (Toy toy : availableToys) {
            totalWeight += toy.getToyWeight();
        }

        if (totalWeight == 0.0) {
            System.out.println("Все игрушки разыграны.");
            return null;
        }

        double randomNum = new Random().nextDouble() * totalWeight;
        double cumulativeWeight = 0.0;

        for (Toy toy : availableToys) {
            cumulativeWeight += toy.getToyWeight();
            if (randomNum <= cumulativeWeight) {
                updateToyWeight(toy.getToyId(), toy.getToyQuantity() - 1);
                return toy;
            }
        }
        return null;
    }

    // Обновление количества игрушек
    public void updateToyQuantity(int toyId, int newQuantity) {
        for (Toy toy : availableToys) {
            if (toy.getToyId() == toyId) {
                toy.setToyWeight(newQuantity);
                break;
            }
        }
    }

    // Получение призовой игрушки и запись в файл
    public void getPrizeToy() {
        Toy prizeToy = choosePrizeToy();
        if (prizeToy != null) {
            availableToys.remove(prizeToy);
            FileUtil.writeToFile("prizes.txt", "Приз: " + prizeToy.getToyName() + "\n");
            System.out.println("Поздравляем! Вы выиграли: " + prizeToy.getToyName());
        } else {
            System.out.println("Извините, больше призов нет.");
        }
    }    
}
