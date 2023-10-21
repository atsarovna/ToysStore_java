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

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                if (choice == 1) {
                    toyShop.getPrizeToy();
                } else if (choice == 2) {
                    break;
                } else {
                    System.out.println("Пожалуйста, введите 1 или 2.");
                }
            } else {
                System.out.println("Пожалуйста, введите цифру 1 или 2.");
                scanner.next(); // Считываем некорректный ввод, чтобы избежать зацикливания
            }
        }
        
        scanner.close();
    }
}
