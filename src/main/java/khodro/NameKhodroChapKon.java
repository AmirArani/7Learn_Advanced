package khodro;

public class NameKhodroChapKon {

    Khodro[] khodroha;

    public NameKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }

    public String execute() {

        StringBuilder nameKhodroha = new StringBuilder();

        for (int i=0; i< khodroha.length; i++){
            if (i != khodroha.length-1){
                nameKhodroha.append(khodroha[i].getMark()).append("-");
            }else {
                nameKhodroha.append(khodroha[i].getMark());
            }
        }
        return nameKhodroha.toString();
    }

}
