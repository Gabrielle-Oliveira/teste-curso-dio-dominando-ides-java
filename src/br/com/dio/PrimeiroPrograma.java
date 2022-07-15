package br.com.dio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
        Livros livros = new Livros ();
        
        System.out.println(gato);
	    System.out.println(livros);
	/*int a = 2;
		int b = 3;
		System.out.println("Hello word!" + (a+b));*/
	}
}
class Livros {
	private String nome;
	private String npag;
}