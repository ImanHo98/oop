package Khodro;

public class NamKhodroChapKon { // open close principle // Dependency Injection
    Khodro[] khodroha;

    //constructor
    public NamKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;

    }
    public String execute() {

        String nameKhodroha = "";

        for (int neshanegar = 0; neshanegar < khodroha.length; neshanegar++) {

            Khodro khodro = khodroha[neshanegar];

            if (neshanegar != khodroha.length -1){
                nameKhodroha = nameKhodroha + khodro.getMark() +"-";
            } else {
                nameKhodroha = nameKhodroha + khodro.getMark();
            }
        }
        return nameKhodroha;
    }
}
