package model;

/**
 * Bateria: instrumento de 5 tambores, feita de metal, que faz um som
 * grave de batidas quando tocada.
 */
public class Bateria extends InstrumentoMusical {

    private int tambores;

    public Bateria(String nome, String material, int tambores) {
        super(nome, material);
        this.tambores = tambores;
    }

    @Override
    public String tocar() {
        return nome + " fez um som grave de batidas ("
                + tambores + " tambores).";
    }

    public int getTambores() {
        return tambores;
    }
}
