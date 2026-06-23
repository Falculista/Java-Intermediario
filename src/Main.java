
// Interfaces (ver depois) Java Collections
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // JAVA COLLECTIONS:

        // List => permite duplicatas [1,2,2,3,4,4]

        List<String> garagem = new ArrayList<>();

        // definimos uma ArrayList com List na esquerda para que, se no futuro precisarmos mudar...
        // ...nós pudermos fazer isso facilmente, pois stringList é uma lista, mas não necessariamente...
        // ...um ArrayList.

        garagem.add("Gol");
        garagem.add("BMW");
        garagem.add("Audi");
        garagem.add("Gol");

        garagem.get(0);
        garagem.get(1);
        garagem.get(2);
        garagem.get(3);

        // Set => não permite duplicatas [1,2,3,4,5]

        Set<String> placasCarros = new HashSet<>();

        // Map => Estrutura de chave valor



        // Queue => filas, usada normalmente para processamento de dados


    }
}