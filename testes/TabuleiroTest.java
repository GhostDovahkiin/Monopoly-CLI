package testes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import main.Jogador;
import main.Posicoes;
import main.Propriedade;
import main.Tabuleiro;

public class TabuleiroTest {
	Tabuleiro tabuleiro;
	Posicoes propriedade;
	Jogador jogador1;
	Jogador jogador2;
	Jogador jogador3;

	@Before
	public void setUp() throws Exception {
		tabuleiro = new Tabuleiro();
		propriedade = new Propriedade("Casa nova",100);
		tabuleiro.adicionaPosicao(propriedade);
		
		jogador1 = new Jogador("Lucas");
		jogador2 = new Jogador("Maicon");
		tabuleiro.pesquisaJogador("Maicon");
		
		
		
	}
	

	@Test
	public void testAdicionaPosicao() {
		ArrayList<Posicoes>tab = tabuleiro.getPosicoes();
		for (int i=0;i<tab.size();i++) {
			assertEquals(propriedade,tab.get(i));
		}
	}

	@Test
	public void testAdicionaJogador() {
		for(int i=0;i<tabuleiro.getJogadores().size();i++) {
			assertEquals("Lucas",tabuleiro.getJogadores().get(i).getNome());
		}
		
	}

	@Test
	public void testPesquisaJogador() {

		
		assertNotNull(jogador2.getNome().equals("Lucas"));
		
		
	}

}
