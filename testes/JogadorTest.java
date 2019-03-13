package testes;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
>>>>>>> entrega2

import org.junit.Before;
import org.junit.Test;

import main.Jogador;
import main.Posicoes;
import main.Propriedade;

public class JogadorTest {
	Jogador jogador;
	Jogador jogador1;
	Jogador jogador2;
	Posicoes propriedade;
	Posicoes propriedade1;
	Posicoes propriedade2;
	
	@Before
	public void setUp() throws Exception{
		jogador = new Jogador("Lucas");
		jogador1 = new Jogador("José");
		jogador2 = new Jogador("Vagner");
		propriedade = new Propriedade("Casa Branca",50);
		propriedade1 = new Propriedade("Casa Verde",200);
		propriedade2 = new Propriedade("Casa azul",100);
		jogador.compra(propriedade);
		jogador1.compra(propriedade1);
		jogador2.compra(propriedade2);
	}

	@Test
	public void testCompra() {
		Double valorEsperado = 1450.0;
		Double saldoJogador = jogador.getSaldo();
		assertEquals(valorEsperado,saldoJogador);
	}
	
	@Test
	public void testCompra2() {
		Double valorEsperado = 1300.0;
		Double saldoJogador = jogador1.getSaldo();
		assertEquals(valorEsperado,saldoJogador);
	}
	
	@Test
	public void testCompra3() {
		Double valorEsperado = 1400.0;
		Double saldoJogador = jogador2.getSaldo();
		System.out.println(valorEsperado);
		System.out.println(saldoJogador);
		assertEquals(saldoJogador, valorEsperado);
		assertFalse(valorEsperado == saldoJogador);
	}
	
	@Test
	public void TestrecebeDeCada() {
		LinkedList<Jogador> jogadores = new LinkedList<Jogador>();
		jogadores.add(jogador);
		jogadores.add(jogador1);
		jogadores.add(jogador2);
		double saldoJogador = jogador1.getSaldo();
		jogador.recebeDeCada(jogadores, jogador);
		assertFalse(jogador.getSaldo() ==  saldoJogador);
	}

}
