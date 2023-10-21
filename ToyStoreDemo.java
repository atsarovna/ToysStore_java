import java.util.Scanner;

public class ToyStoreDemo {
    public static void main(String[] args) {
        ToyStore toyShop = new ToyStore();

        // Пример добавления игрушек
        toyShop.addNewToy(1, "Barbie", 10, 20);
        toyShop.addNewToy(2, "Машинка BMW", 8, 30);
        toyShop.addNewToy(3, "Баскетбольный мяч", 15, 50);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Розыгрыш призовой игрушки");
            System.out.println("2. Выйти из программы");
            System.out.print("Выберите действие: ");

            String choice = scanner.next();

            if ("1".equals(choice)) {
                toyShop.getPrizeToy();
            } else if ("2".equals(choice)) {
                break;
            }
        }
        
        scanner.close();
    }
}
