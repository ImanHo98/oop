package Khodro;

// Motor yek khodro ast : Motorcycle is a vehicle
public class Motor extends Khodro {

    public boolean ayaDarHaleHarekatAst() {
        return ayaRoshanAst;
    }

    @Override
    public String getMark() {
        return "Motor";
    }
}
