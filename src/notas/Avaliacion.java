package notas;

/**
 *
 * @author andrea
 */
public class Avaliacion {

    private float probaEscrita;
    private float probaEscrita_1;
    private float probaEscrita_2;
    private float probaPractica;
    private float boletins, bol;
    private float notaFinal;

    public Avaliacion() {
    }

    public Avaliacion(float probaEscrita_1, float probaEscrita_2, float probaPractica, float boletins) {
        this.probaEscrita_1 = probaEscrita_1;
        this.probaEscrita_2 = probaEscrita_2;
        this.probaPractica = probaPractica;
        this.boletins = boletins;
    }

    public float escrita() {
        probaEscrita = (float) (((probaEscrita_1 + probaEscrita_2) / 2) * 0.40);
        return probaEscrita;
    }

    public float practica() {
        probaPractica = (float) (probaPractica * 0.20);
        return (probaPractica);
    }

    public float boletins() {
        if (boletins > 9) {
            bol = 2;
        }
        if (boletins >= 7 && boletins <= 9) {
            bol = 1;
        }
        if (boletins < 7) {
            bol = 0;
        }
        return bol;
    }

    public void calculaNota() {
        notaFinal = (probaEscrita + probaPractica + boletins);
    }

    @Override
    public String toString() {
        return "Avaliacion \n" + "\nPROBAS TEÓRICAS =" + probaEscrita + "\nPROBAS PRÁCTICAS =" + probaPractica + "\nBOLETÍNS =" + bol + "\nNOTA TOTAL =" + notaFinal ;
    }
}
