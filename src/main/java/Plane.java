public enum Plane {

    B737("B737", 150, 6000),
    ATR72("ATR72", 72, 2900),
    A320("A320", 150, 6000);

    private final String planeType;
    private final int capacity;
    private final int weight;

    Plane(String planeType, int capacity, int weight){
        this.planeType = planeType;
        this.capacity = capacity;
        this.weight = weight;
    }


}
