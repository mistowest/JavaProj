/**
 * Exemplo de polimorfismo dinâmico com Impressoras diferentes.
 */
package br.com.misto;

// Classe base
class Impressora {
    public void imprimir(String texto) {
        System.out.println("Impressora padrão: " + texto);
    }
}

// Impressora colorida
class ImpressoraColorida extends Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("Impressora colorida imprimindo: " + texto);
    }
}

// Impressora laser
class ImpressoraLaser extends Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("Impressora a laser imprimindo em alta qualidade: " + texto);
    }
}

// Impressora matricial
class ImpressoraMatricial extends Impressora {
    @Override
    public void imprimir(String texto) {
        System.out.println("Impressora matricial imprimindo lentamente: " + texto);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Programa iniciado.\n");

        // Tipo de referência é a classe base, mas o objeto pode ser de qualquer subclasse
        Impressora impressora;

        impressora = new ImpressoraColorida();
        impressora.imprimir("Relatório de vendas");

        impressora = new ImpressoraLaser();
        impressora.imprimir("Documento confidencial");

        impressora = new ImpressoraMatricial();
        impressora.imprimir("Nota fiscal");

        System.out.println("\nPolimorfismo dinâmico em ação!");
    }
}

