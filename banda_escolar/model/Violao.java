package model;

/**
 * Violao: instrumento de 6 cordas, feito de madeira, que solta um som
 * de cordas dedilhadas quando tocado.
 */
public class Violao extends InstrumentoMusical {

    private int cordas;

    public Violao(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    @Override
    public String tocar() {
        return nome + " tocou um som de cordas dedilhadas ("
                + cordas + " cordas).";
    }

    public int getCordas() {
        return cordas;
    }
}
