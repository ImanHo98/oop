package Khodro;

import static java.lang.System.out;

public class Mashin { //DRY : Don't Repeat Yourself
    boolean ayaRoshanAst; // false
    boolean ayaDarBazAst;// false
    String mark;
    Ranande ranande ;

    //Constructor
    public Mashin() {
        out.println("Yek mashin bedone parameter");
    }

    public Mashin(String mark) {
        this.mark = mark;
        out.println("Yek mashin "+ this.mark+" sakhte shod");
    }

    public void roshan(){
        ayaRoshanAst = true;
    }

    void khamoush(){
        ayaRoshanAst = false;
    }
    public void bazKardanDar(){
        ayaDarBazAst = true;
    }

        void bastanDar(){
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst(){
        if (!ayaDarBazAst && ayaRoshanAst){
        return true;
        }else {
        return false;
        }
    }
}
