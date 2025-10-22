/**
 * Classe principal do programa que demonstra polimorfismo com a classe Impressora.
 */

package br.com.misto;

class Impressora {
    /**
     * Imprime apenas o texto informado.
     * @param texto Texto a ser impresso
     */
    public void imprimir(String texto) {
        System.out.println("Imprimindo: " + texto);
    }

    /**
     * Imprime o texto informado com o número de cópias especificado.
     * @param texto Texto a ser impresso
     * @param copias Número de cópias
     */
    public void imprimir(String texto, int copias) {
        for (int i = 1; i <= copias; i++) {
            System.out.println("Cópia " + i + ": " + texto);
        }
    }

    /**
     * Imprime o texto informado com o número de cópias e opção de cor.
     * @param texto Texto a ser impresso
     * @param copias Número de cópias
     * @param colorida Se true, imprime colorido; se false, preto e branco
     */
    public void imprimir(String texto, int copias, boolean colorida) {
        String tipo = colorida ? "Colorida" : "Preto e Branco";
        for (int i = 1; i <= copias; i++) {
            System.out.println("Cópia " + i + " (" + tipo + "): " + texto);
        }
    }
}


public class Main {
	public static void main(String[] args) {


		System.out.println("Programa iniciado.");

		Impressora impressora = new Impressora();

		// Imprimir apenas texto
		impressora.imprimir("Olá, mundo!");

		// Imprimir texto com número de cópias
		impressora.imprimir("Relatório", 3);

		// Imprimir texto com número de cópias e cor
		impressora.imprimir("Foto", 2, true);
	}
}
