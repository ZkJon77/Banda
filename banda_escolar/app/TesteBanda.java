package app;

import model.Bateria;
import model.InstrumentoMusical;
import model.Violao;

import java.util.ArrayList;
import java.util.List;

public class TesteBanda {

    public static void main(String[] args) {

        // 1. Cria o violao (6 cordas) e a bateria (5 tambores).
        Violao violao = new Violao("Violao da banda", "madeira", 6);
        Bateria bateria = new Bateria("Bateria da banda", "metal", 5);

        // 2. Monta uma List<InstrumentoMusical> com os dois.
        List<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(violao);
        instrumentos.add(bateria);

        // 3. Em UM unico laco, para cada instrumento: afina e depois
        //    imprime o retorno de tocar(). Nenhum instanceof, nenhum cast.
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            System.out.println(instrumento.tocar());
        }

        // 4. Depois do laco, conta e imprime quantos instrumentos estao afinados.
        int totalAfinados = 0;
        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento.isAfinado()) {
                totalAfinados++;
            }
        }
        System.out.println("Instrumentos afinados: " + totalAfinados + " de " + instrumentos.size());

        // 5. new InstrumentoMusical("x", "y") nao compila porque
        //    InstrumentoMusical e uma classe abstrata (declarada com o
        //    modificador "abstract"). Classes abstratas podem ter
        //    metodos sem implementacao (como tocar()), entao o Java
        //    proibe a criacao de objetos diretamente dela: nao faria
        //    sentido existir um "instrumento generico" sem saber como
        //    ele toca. So e possivel instanciar as subclasses concretas
        //    (Violao, Bateria), que implementam todos os metodos abstratos.
    }
}
