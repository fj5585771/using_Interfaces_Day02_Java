public class Car implements Convert, iMove, iStart { // Forces us to implement over rider

    private String name;
    private int age;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override (previously was with inheritence ... now it is not needed, because of Interface implementation)
    public String convert(){
        return "Car data";
    }

    public String move(int distance) {  // This is polymoprhic with Imove and Vehhicle
        return "move " + distance + " miles";
    }

    public String start(){
        return "Hotwired!";
    }

    public String stop() {
        return "Foot on the break!";
    }
}
