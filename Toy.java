class Toy {
    private int toyId;
    private String name;
    private int quantity;
    private double weight;

    // Конструктор класса Toy
    public Toy(int toyId, String name, int quantity, double weight) {
        this.toyId = toyId;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    // Геттеры и сеттеры для свойств игрушки
    public int getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
