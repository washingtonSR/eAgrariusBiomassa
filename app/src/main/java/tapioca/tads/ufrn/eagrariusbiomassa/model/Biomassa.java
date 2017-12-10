package tapioca.tads.ufrn.eagrariusbiomassa.model;

/**
 * Created by Aluno on 23/10/2017.
 */

public class Biomassa {
    private float biomassa;
    private int q01=0, q02=0, q03=0, q04=0, q05=0;
    public Biomassa(){
    }

    public Biomassa(int q01, int q02, int q03, int q04, int q05) {
        this.q01 = q01;
        this.q02 = q02;
        this.q03 = q03;
        this.q04 = q04;
        this.q05 = q05;
    }

    public void calcular(){
    }

    public float getBiomassa() {
        return biomassa;
    }

    public void setBiomassa(float biomassa) {
        this.biomassa = biomassa;
    }

    public int getQ01() {
        return q01;
    }

    public void setQ01(int q01) {
        this.q01 = q01;
    }

    public int getQ02() {
        return q02;
    }

    public void setQ02(int q02) {
        this.q02 = q02;
    }

    public int getQ03() {
        return q03;
    }

    public void setQ03(int q03) {
        this.q03 = q03;
    }

    public int getQ04() {
        return q04;
    }

    public void setQ04(int q04) {
        this.q04 = q04;
    }

    public int getQ05() {
        return q05;
    }

    public void setQ05(int q05) {
        this.q05 = q05;
    }

    public String toString(){
        String resultado = "Experiência: ";
        if (q01==1){
          resultado = resultado+"sim. ";
        }else {
            resultado = resultado+"não. ";
        }

        resultado = resultado+"Qual. ração: ";
        if (q02==1){
            resultado = resultado+"Boa. ";
        }else if(q02==2){
            resultado = resultado+"Comum. ";
        }else {
            resultado = resultado+"Ruim. ";
        }

        resultado = resultado+"Temperatura: ";
        if (q03==1){
            resultado = resultado+"29. ";
        }else if(q03==2){
            resultado = resultado+"26. ";
        }else {
            resultado = resultado+"23. ";
        }

        resultado = resultado+"Caract. física: ";
        if (q04==1){
            resultado = resultado+"Sim. ";
        }else{
            resultado = resultado + "Não. ";
        }

        resultado = resultado+"Caract. química: ";
        if (q05==1){
            resultado = resultado+"Sim. ";
        }else{
            resultado = resultado + "Não. ";
        }

        return resultado;
    }
}
