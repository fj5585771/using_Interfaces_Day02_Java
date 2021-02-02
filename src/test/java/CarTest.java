import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    @Test
    public void canConvertCar(){
//        Given we have a car
        Car car = new Car("SAAB", 2);
//        When we pas it to the convertor
       String convertedMessage1 = Converter.process(car);  // 'Converter' is now a second Type of car object.  This class contains a method 'process()', which has a parameter that takes in our 'convert interface' specified method/action of 'convert'.  This is implemented in our Car object, and automatically signals of the method needed to override sourced library capabilities (Converter.process() library method, insisting it takes the parent Vehicle class returned method value instead of sub Car class value that we importantly need).  When testing we have the correct return value from the sub class method, the Converter class method arguement (discussed above^^) contains the convert interface string action method that can be utilised by MORE than one class.

//        Then we should see some converted string
        assertEquals("Car data", convertedMessage1);
    }

    @Test
    public void canConvertMotorbike(){
        Motorbike motorbike = new Motorbike("Honda", "red");
        String convertedMessage = Converter.process(motorbike);
    }

    @Test
    public void canMovecar(){
        Car car = new Car("Ford", 5);
        String returned = car.move(20);
        assertEquals("move 20 miles", returned);
    }

    @Test
    public void canMoveBike(){
        Motorbike motorbike = new Motorbike("Honda", "Camo");
        String returned = motorbike.move(30);
        assertEquals("travel 30 miles", returned);
    }

//    would  u say that i fu want to do polymorphism through mrthods then use interfaces, if u want it through inhereitence then through properties _ OSH QUOTE!!

}
