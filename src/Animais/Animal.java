package Animais;

public abstract class Animal {

    // abstract class: não pode gerar objetos, somente ser implementada por subclasses
        // exemplo: porco implementa animal (não se cria um animal sem saber a espécie)

    // abstract method: define uma função que não possui retorno
    // é implementado pela subclasse para então possuir retorno definido
    public abstract void emitirSom();

    public void dormir() {
        System.out.println("ZzZzZz...");
    }

}
