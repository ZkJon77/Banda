package model;

/**
 * Classe abstrata que representa qualquer instrumento da banda escolar.
 *
 * Atributos comuns identificados no texto (pergunta 2):
 *   - nome
 *   - material
 *   - afinado (todo instrumento comeca desafinado)
 *
 * Nao pode ser instanciada diretamente (pergunta 5): o modificador
 * "abstract" na declaracao da classe impede o uso de "new InstrumentoMusical(...)".
 */
public abstract class InstrumentoMusical {

    protected String nome;
    protected String material;
    protected boolean afinado;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
        this.afinado = false; // todo instrumento comeca desafinado
    }

    /**
     * Comportamento que cada instrumento faz de um jeito DIFERENTE
     * (pergunta 4) -> metodo abstrato, implementado por cada subclasse.
     */
    public abstract String tocar();

    /**
     * Comportamento IGUAL para todos os instrumentos (pergunta 4)
     * -> metodo concreto na classe mae, nao reescrito nas filhas.
     */
    public void afinar() {
        this.afinado = true;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome
                + " | Material: " + material
                + " | Afinado: " + (afinado ? "sim" : "nao"));
    }

    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isAfinado() {
        return afinado;
    }
}
