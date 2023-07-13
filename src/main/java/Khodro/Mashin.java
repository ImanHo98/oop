package Khodro;

import Khodro.Khodro;
import Khodro.Ranande;

import static java.lang.System.out;

// Mashin Yek Khodro ast : car is a vehicle // Liskov substitution principle

public class Mashin extends Khodro implements SandoghDar, GearBox { //DRY : Don't Repeat Yourself
    private boolean ayaDarBazAst;// false
    private String mark;
    private int gonjayeshSandogh;
    private String noeDande;

    private Ranande ranande ;

    //Constructor
    public Mashin() {

    }

    public Mashin(String mark) {
        this.mark = mark;
    }
    public Mashin(String mark, int gonjayeshSandogh, String noeDande) {

        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.noeDande = noeDande;

    }

     void bazKardanDar(){
        ayaDarBazAst = true;
    }

        void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst(){
        protectedMethod();
        if (!ayaDarBazAst && ayaRoshanAst){
        return true;

        } else {
        return false;

        }
    }

    @Override
    public String getMark() {
        return mark;
    }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
}
