class Toy {
    private int toyId;
    private String toyName;
    private int toyQuantity;
    private double toyWeight;

    // Конструктор класса Toy
    public Toy(int toyId, String toyName, int toyQuantity, double toyWeight) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyQuantity = toyQuantity;
        this.toyWeight = toyWeight;
    }

    // Геттеры и сеттеры для свойств игрушки
    public int getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public int getToyQuantity() {
        return toyQuantity;
    }

    public double getToyWeight() {
        return toyWeight;
    }

    public void setToyWeight(double toyWeight) {
        this.toyWeight = toyWeight;
    }
}
