public class Motorbike implements Convert, iMove, iStart  {

    private String model;
    private String colour;

    public Motorbike(String model, String colour){
        this.model = model;
        this.colour = colour;

    }

    public String convert(){
        return "Converted motorbike data here";
    }

    public String move(int distance) {
        return "travel " + distance + " miles";
    }

    public String start() {
        return "Put helmet and hopped on, turned key";
    }

    public String stop() {
        return "release the handle!";
    }
}
