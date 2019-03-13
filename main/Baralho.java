package main;

import java.util.Collections;
import java.util.Stack;
/**
 * 
 * @author Pedro H
 *
 */
public class Baralho {
	private Stack<Carta> baralho;
	
	/**
	 * Este método inicia uma pilha de 31 elementos e os embaralha no final;
	 * @return Stack
	 */
	public Stack<Carta> CriaBaralho() {
		Stack<Carta> baralhoT = new Stack<Carta>();
		Carta num1 = new Carta("Sua empresa foi multada por poluir demais. \nPague 200.", 200, 0, "PAGUE");
		baralhoT.push(num1);
		Carta num2 = new Carta("O dia do seu casamento chegou, receba os presentes. \nReceba 50 de cada jogador.", 0, 50, "RECEBADECADA");
		baralhoT.push(num2);
		Carta num3 = new Carta("Reformou sua casa \nPague 50.", 50, 0, "PAGUE");
		baralhoT.push(num3);
		Carta num4 = new Carta("Seu livro será publicado por uma grande editora. \nReceba 50.", 0, 50, "RECEBA");
		baralhoT.push(num4);
		Carta num5 = new Carta("Utilize este cartão para se livrar da prisão.", 0, 0, "SAIADAPRISAO");
		baralhoT.push(num5);
		Carta num6 = new Carta("Vá para a prisão.", 0, 0, "PRESO");
		baralhoT.push(num6);
		Carta num7 = new Carta("Vá até o início.", 0, 200, "INICIO");
		baralhoT.push(num7);
		Carta num8 = new Carta("Suas ações na bolsa de valores estão em alta. \nReceba 100.", 0, 100, "RECEBA");
		baralhoT.push(num8);
		Carta num9 = new Carta("Você vai começar um curso de MBA e ganhou um bom desconto para pagamento a vista. \nPague 20.", 20, 0, "PAGUE");
		baralhoT.push(num9);
		Carta num10 = new Carta("Férias com a familia. \nPague 20.", 20, 0, "PAGUE");
		baralhoT.push(num10);
		Carta num11 = new Carta("Recebeu o prêmio de profissional do ano e ganhou um carro. \nReceba 10.", 0, 10, "RECEBA");
		baralhoT.push(num11);
		Carta num12 = new Carta("Jogue os dados novamente", 0, 0, "JOGANOVAMENTE");
		baralhoT.push(num12);
		Carta num13 = new Carta("Sua empresa irá patrocinar uma expedição a Antártida. \nPague 50.", 50, 0, "PAGUE");
		baralhoT.push(num13);
		Carta num14 = new Carta("Vendeu a parte de sua empresa para um investidor. \nReceba 75", 0, 75, "RECEBA");
		baralhoT.push(num14);
		Carta num15 = new Carta("Apostou no cavalo azarão e ganhou. \nReceba 100.", 0, 100, "RECEBA");
		baralhoT.push(num15);
		Carta num16 = new Carta("A falta de chuva prejudicou a colheita. \nPague 45", 45, 0, "PAGUE");
		baralhoT.push(num16);
		Carta num17 = new Carta("Recebeu uma herança inesperada. \nReceba 75", 0, 75, "RECEBA");
		baralhoT.push(num17);
		Carta num18 = new Carta("Seu filho decidiu fazer intercâmbio. \nPague 20.", 20, 0, "PAGUE");
		baralhoT.push(num18);
		Carta num19 = new Carta("Sua casa será desapropriada para a construção de um metro e ganhará uma gorda indenização. \nReceba 60.", 0, 60, "RECEBA");
		baralhoT.push(num19);
		Carta num20 = new Carta("Venceu licitação para grande obra. \nReceba 150.", 0, 150, "RECEBA");
		baralhoT.push(num20);
		Carta num21 = new Carta("Seu iate afundou, mas você tinha seguro! \nReceba 25.", 0 , 25, "RECEBA");
		baralhoT.push(num21);
		Carta num22 = new Carta("Seus funcionários entraram em greve. \nPague 30.", 30, 0, "PAGUE");
		baralhoT.push(num22);
		Carta num23 = new Carta("Comprou obra de arte falsificada. \nPague 22.", 22, 0, "PAGUE");
		baralhoT.push(num23);
		Carta num24 = new Carta("Sorte se tirou o número par da soma dos dados e revés caso contrário. \nPague 100 ou Receba 100.",100,100,"PAGUEOURECEBA");
		baralhoT.push(num24);
		Carta num25 = new Carta("Seu jatinho precisa de manutenção. \nPague 9.", 9, 0, "PAGUE");
		baralhoT.push(num25);
		Carta num26 = new Carta("Renovou a frota de carros da sua empresa. \nPague 100.", 100, 0, "PAGUE");
		baralhoT.push(num26);
		Carta num27 = new Carta("Ganhou sozinho na loteria. \nReceba 80.", 0, 80, "RECEBA");
		baralhoT.push(num27);
		Carta num28 = new Carta("Atualizou os computadores da sua empresa. \nPague 30.", 30, 0, "PAGUE");
		baralhoT.push(num28);
		Carta num29 = new Carta("Um navio afundou com suas mercadorias (não tinha seguro). \nPague 40.", 40, 0, "PAGUE");
		baralhoT.push(num29);
		Carta num30 = new Carta("Produção de leite de suas fazendas ficou abaixo da expectativa. \nPague 60.", 60, 0, "PAGUE");
		baralhoT.push(num30);
		Carta num31 = new Carta("Tirou primeiro lugar no torneio de golfe. \nReceba 100.", 0, 100, "RECEBA");
		baralhoT.push(num31);
		
		Collections.shuffle(baralhoT);
		return baralhoT;
	}
	
	/**
	 * Este método recebe uma carta e adiciona ela no final da pilha;
	 * @param c
	 */
	public void EmbaralhaCarta(Carta c) {
		int tamanhoLista = this.baralho.size();
		this.baralho.add(tamanhoLista, c);	
	}
	
	/**
	 * Este método retorna a primeira carta da pilha, printa a descrição inteira dela e depois coloca ela no final; 
	 * @return Carta
	 */
	public Carta puchaCarta() {
		Carta c = this.baralho.firstElement();
		System.out.println(c.toString());
		if(this.baralho.contains(c)) {
			this.baralho.remove(c);
		}
		this.EmbaralhaCarta(c);
		return c;
	}
	
	/**
	 * O baralho recebe o Stack com as cartas misturadas do método CriaBaralho();
	 */
	public Baralho() {
		this.baralho = this.CriaBaralho();
	}

	public Stack<Carta> getBaralho() {
		return baralho;
	}
}
