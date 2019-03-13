package testes;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import main.Baralho;
import main.Carta;

public class BaralhoTest {
	private Baralho baralho;
	
	@Before
	public void setUp(){
		this.baralho = new Baralho();
	}

	@Test
	public void testGetBaralho() {
		Stack<Carta> baralhoTeste = new Stack<Carta>();
		baralhoTeste = this.baralho.getBaralho();
		assertTrue(baralhoTeste == this.baralho.getBaralho());
	}
	
	@Test
	public void testCriaBaralho() {
		int tamanhoStack = 31;
		assertTrue(tamanhoStack == this.baralho.getBaralho().size());
	}

	@Test
	public void testEmbaralhaCarta() {
		Carta c = this.baralho.getBaralho().peek();
		this.baralho.puchaCarta();
		assertTrue(c != this.baralho.getBaralho().lastElement());
	}

	@Test
	public void testPuchaCarta() {
		Carta c = this.baralho.puchaCarta();
		assertTrue(c == this.baralho.getBaralho().lastElement());
	}

}
