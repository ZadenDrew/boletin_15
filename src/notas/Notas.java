package notas;

/**
 *
 * @author andrea
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Avaliacion av1 = new Avaliacion(8, 6, 9, 8);
        av1.escrita();
        av1.practica();
        av1.boletins();
        av1.calculaNota();
        System.out.println(av1.toString());
    }

}
