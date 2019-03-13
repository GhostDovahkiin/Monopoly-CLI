package main;

/**
 * Apenas chama o menu que está na classe jogo.
 */
public class Start {
	public static void main(String[] args) {

		try {
			Jogo j1 = new Jogo();
			j1.menu();
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
