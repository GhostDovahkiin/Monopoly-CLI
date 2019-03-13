package main;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Essa classe é onde será executado todas as coisas, e também setado todos os
 * blocos no tabuleiro e suas respectivas caracteristicas.
 * 
 * @author lucas
 *
 */
public class Jogo {
	Scanner scan = new Scanner(System.in);
	private Tabuleiro tabuleiro;
	private ArrayList<String> cores = new ArrayList<String>();
	ArrayList<String> tiposJogada = new ArrayList<String>();
	/**
	 * Adiciona todas as cores disponiveis dentro de um arrayList de cores. Adiciona
	 * todos os comandos possíveis dentro de um arrayList de tiposJogada.
	 **/
	public Jogo() {
		this.tabuleiro = new Tabuleiro();
		this.cores.add("preto");
		this.cores.add("branco");
		this.cores.add("vermelho");
		this.cores.add("verde");
		this.cores.add("azul");
		this.cores.add("amarelo");
		this.cores.add("laranja");
		this.cores.add("rosa");
		this.tiposJogada.add("jogar");
		this.tiposJogada.add("status");
		this.tiposJogada.add("sair");
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	/**
	 * Nesse método é onde são setadas todas as casas do tabuleiro, sendo elas
	 * propriedades, sorte ou reves, prisão, entre outras. Depois, seta-se o
	 * tabuleiro da classe pra receber o tabuleiro temporário " this.tabuleiro =
	 * tab;".
	 */
	public void iniciaTabuleiro() {

		Tabuleiro tab = new Tabuleiro();

		Posicoes pontoPartida = new PontoDePartida("Ponto de Partida", 0);
		tab.adicionaPosicao(pontoPartida); // INDEX 0

		Posicoes leblon = new Propriedade("Leblon", 100);
		tab.adicionaPosicao(leblon); // 1

		Posicoes sorteReves1 = new SorteOuReves("Sorte ou Revés", 0);// INDEX 2
		tab.adicionaPosicao(sorteReves1);

		Posicoes presidenteVargas = new Propriedade("Av. Presidente Vargas", 60.0);// INDEX 3
		tab.adicionaPosicao(presidenteVargas);

		Posicoes avCopacabana = new Propriedade("Av. Nossa Senhora de Copacabana", 60.0); // INDEX 4
		tab.adicionaPosicao(avCopacabana);

		Companhia ciaFerroviaria = new Companhia("Companhia de Ferroviária", 200.0, 50); // INDEX 5
		tab.adicionaPosicao(ciaFerroviaria);

		Posicoes brigadeiroFaria = new Propriedade("Av. Brigadeiro Faria de Lima", 240.0);// INDEX 6
		tab.adicionaPosicao(brigadeiroFaria);

		Companhia ciaAviacao = new Companhia("Companhia de Viação", 200.0, 50); // INDEX 7
		tab.adicionaPosicao(ciaAviacao);

		Posicoes avReboucas = new Propriedade("Av. Rebouças", 220.0); // INDEX 8
		tab.adicionaPosicao(avReboucas);

		Posicoes avNoveJulho = new Propriedade("AV. 9 de Julho", 220.0); // INDEX 9
		tab.adicionaPosicao(avNoveJulho);

		Posicoes prisaoVisitante = new Prisao("Prisão(visitante)", 0); // INDEX 10
		tab.adicionaPosicao(prisaoVisitante);

		Posicoes avEuropa = new Propriedade("Av. Europa", 200.0); // INDEX 11
		tab.adicionaPosicao(avEuropa);

		Posicoes sorteReves2 = new SorteOuReves("Sorte ou Revés", 0); // INDEX 12
		tab.adicionaPosicao(sorteReves2);

		Posicoes ruaAugusta = new Propriedade("Rua Augusta", 180.0); // INDEX 13
		tab.adicionaPosicao(ruaAugusta);

		Posicoes avPacaembu = new Propriedade("Av. Pacaembu", 180.0); // INDEX 14
		tab.adicionaPosicao(avPacaembu);

		Companhia ciaTaxi = new Companhia("Companhia de taxi", 150.0, 40);// INDEX 15
		tab.adicionaPosicao(ciaTaxi);

		Posicoes sorteReves3 = new SorteOuReves("Sorte ou Revés", 0); // INDEX 16
		tab.adicionaPosicao(sorteReves3);

		Posicoes interlagos = new Propriedade("Interlagos", 350.0); // INDEX 17
		tab.adicionaPosicao(interlagos);

		Posicoes lucrosOuDividendo = new LucrosOuDividendo("Lucros ou Dividendo", 0); // INDEX 18
		tab.adicionaPosicao(lucrosOuDividendo);

		Posicoes morumbi = new Propriedade("Morumbi", 400.0); // INDEX 19
		tab.adicionaPosicao(morumbi);

		Posicoes paradaLivre1 = new ParadaLivre("Parada Livre", 0); // INDEX 20
		tab.adicionaPosicao(paradaLivre1);

		Posicoes flamengo = new Propriedade("Flamengo", 120.0); // INDEX 21
		tab.adicionaPosicao(flamengo);

		Posicoes sorteReves4 = new SorteOuReves("Sorte ou Revés", 0); // INDEX 22
		tab.adicionaPosicao(sorteReves4);

		Posicoes botafogo = new Propriedade("Botafogo", 100); // INDEX 23
		tab.adicionaPosicao(botafogo);

		Posicoes impostoRenda = new ImpostoDeRenda("Imposto de Renda", 0); // INDEX 24
		tab.adicionaPosicao(impostoRenda);

		Companhia ciaNavegacao = new Companhia("Companhia de navegação", 150.0, 40); // INDEX 25
		tab.adicionaPosicao(ciaNavegacao);

		Posicoes avBrasil = new Propriedade("Av. Brasil", 160.0); // INDEX 26
		tab.adicionaPosicao(avBrasil);

		Posicoes sorteReves5 = new SorteOuReves("Sorte ou Revés", 0); // INDEX 27
		tab.adicionaPosicao(sorteReves5);

		Posicoes avPaulista = new Propriedade("Av. Paulista", 140.0); // INDEX 28
		tab.adicionaPosicao(avPaulista);

		Posicoes jardimEuropa = new Propriedade("Jardim Europa", 140.0); // INDEX 29
		tab.adicionaPosicao(jardimEuropa);

		Posicoes prisaoPreso = new PrisaoSerPreso("Prisão (vá para prisão)", 0); // INDEX 30
		tab.adicionaPosicao(prisaoPreso);

		Posicoes copacabana = new Propriedade("Copacabana", 260.0); // INDEX 31
		tab.adicionaPosicao(copacabana);

		Companhia ciaAviacao2 = new Companhia("Companhia de Aviação", 200.0, 50); // INDEX 32
		tab.adicionaPosicao(ciaAviacao2);

		Posicoes avVieira = new Propriedade("Av. Vieira Souto", 320.0); // INDEX 33
		tab.adicionaPosicao(avVieira);

		Posicoes avAtlantica = new Propriedade("Av. Atlântica", 300.0); // INDEX 34
		tab.adicionaPosicao(avAtlantica);

		Companhia ciaTaxiAereo = new Companhia("Companhia de Táxi Aéreo", 200.0, 50); // INDEX 35
		tab.adicionaPosicao(ciaTaxiAereo);

		Posicoes ipanema = new Propriedade("Ipanema", 300.0); // INDEX 36
		tab.adicionaPosicao(ipanema);

		Posicoes sorteReves6 = new SorteOuReves("Sorte ou Revés", 0); // INDES 37
		tab.adicionaPosicao(sorteReves6);

		Posicoes jardimPaulista = new Propriedade("Jardim Paulista", 280.0); // INDEX 38
		tab.adicionaPosicao(jardimPaulista);

		Posicoes brooklin = new Propriedade("Brooklin", 260.0); // INDEX 39
		tab.adicionaPosicao(brooklin);
		tab.montarTabuleiro();

		this.tabuleiro = tab;
	}

	/**
	 * Pede-se a quantidade de jogadores. Pede o nome dos jogadores de acordo com a
	 * quantidade. Pede as cores que cada jogador quer, cada cor em seu respectivo
	 * jogadoro
	 * 
	 * @throws Exception
	 *             Se o jogador entrar com uma cor que não está contida no array de
	 *             cores, lança-se a exceção.
	 */
	public void adicionaJogadores() throws Exception {
		System.out.println("Digite o número de jogadores [2-8]: ");
		int numJogadores = Integer.parseInt(scan.next());

		for (int i = 0; i < numJogadores; i++) {
			boolean termino = false;
			do {
				System.out.println("Digite o nome do jogador " + (i + 1) + ": ");
				String nomeJogador = scan.next().toLowerCase();
				Jogador j2 = new Jogador(nomeJogador);
				try {
					this.tabuleiro.adicionaJogador(j2);
					System.out.println(
							"Escolha a cor do peão do jogador " + (i + 1) + " entre as opções seguintes:" + this.cores);
					j2.setCor(scan.next().toLowerCase());
					if (this.cores.contains(j2.getCor())) {
						this.cores.remove(j2.getCor());
					} else {
						throw new Exception("Cor escolhida não existe.");
					}
					termino = true;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} while (!termino);

		}
	}

	/**
	 * Nesse método, são repassados os comandos disponiveis ao jogador,(jogar,
	 * status, sair). O jogador pode escolher entre as opções. Se apertar em jogar,
	 * a posição é setada de acordo com o que tirou-se nos dados. Se o jogador cair
	 * em uma propriedade e o titulo da mesma estiver a venda, pergunta-se se o
	 * jogador quer comprar.Se comprar, a propriedade vai ser adicionada ao array de
	 * prpopriedades do usuário.
	 * 
	 */
	public void jogadaDaVez() {
		
		
		for (int i = 0; i < this.tabuleiro.getJogadores().size(); i++) {
			int dado1 = this.tabuleiro.getDado1().jogada();
			int dado2 = this.tabuleiro.getDado2().jogada();
			int somaDados = dado1 + dado2;
			System.out.println("----------------------------------------------------------------------------------------------\n");
			System.out.println("A jogada de : " + this.tabuleiro.getJogadores().get(i).getNome() + "("
					+ this.tabuleiro.getJogadores().get(i).getCor() + ") começou!");
			
			int posicaoFinal = this.getTabuleiro().getJogadores().get(i).getPosicao() + somaDados;
			if (posicaoFinal >= 40) {
				posicaoFinal -= 40;
			}
			if (this.tabuleiro.getJogadores().get(i).isPreso() == false) {
				System.out.println("Comandos disponiveis: [jogar][status][sair]");
				String jogada = scan.next().toLowerCase();
				if (jogada.equals("jogar")) {

					System.out.println("\nJogador " + this.tabuleiro.getJogadores().get(i).getNome() + " tirou " + dado1
							+ ", " + dado2 + " e avançou para: " + posicaoFinal + " "
							+ this.tabuleiro.getTabuleiro().get(posicaoFinal).getNome());
					this.getTabuleiro().getJogadores().get(i).setPosicao(posicaoFinal);
					if(this.tabuleiro.getTabuleiro().get(posicaoFinal).tipo().equals("Companhia")){
						
						if (this.tabuleiro.getTabuleiro().get(posicaoFinal).isDisponivel() == true) {

							if (this.tabuleiro.getJogadores().get(i).getSaldo() >= this.tabuleiro.getTabuleiro()
									.get(this.getTabuleiro().getJogadores().get(i).getPosicao()).getValor()) {
								System.out
										.println(
												"O titulo "
														+ this.tabuleiro.getTabuleiro()
																.get(this.getTabuleiro().getJogadores().get(i)
																		.getPosicao())
																.getNome()
														+ " está disponivel por "
														+ this.tabuleiro.getTabuleiro().get(
																this.getTabuleiro().getJogadores().get(i).getPosicao())
																.getValor()
														+ "$");
								System.out.println(
										"Você possui " + this.tabuleiro.getJogadores().get(i).getSaldo() + "$"+"\nVocê deseja comprar (Sim/Não)? ");
								String resposta = scan.next().toLowerCase().substring(0);
								boolean passou = false;
								if(resposta.equals("n") || resposta.equals("s") || resposta.equals("sim") || resposta.equals("nao") || resposta.equals("não")) {
									passou = true;
								}else {
									do {
										System.out.print("Você deseja comprar (Sim/Não)? ");
										resposta = scan.next().toLowerCase().substring(0);
										if(resposta.equals("n") || resposta.equals("s") || resposta.equals("sim") || resposta.equals("nao") || resposta.equals("não")) {
											passou = true;
										}
									
									}while(passou == false);
								}
							
								//System.out.println(resposta);
								if (resposta.equals("s") || resposta.equals("sim")) {
									this.getTabuleiro().getJogadores().get(i).compra(this.tabuleiro.getTabuleiro()
											.get(posicaoFinal));
									this.getTabuleiro().getJogadores().get(i).getCompanhiasProprias().add((Companhia)this.tabuleiro.getTabuleiro().get(posicaoFinal));
									((Companhia)this.tabuleiro.getTabuleiro().get(posicaoFinal)).setDono(this.tabuleiro.getJogadores().get(i));
									this.tabuleiro.getTabuleiro().get(posicaoFinal).setDisponivel(false);
									System.out.println("Você comprou esta propriedade: " + this.tabuleiro.getTabuleiro()
											.get(this.getTabuleiro().getJogadores().get(i).getPosicao()).getNome()
											+ "\nParabéns!\n");
									

								} else if(resposta.equals("nao") || resposta.equals("não") || resposta.equals("n")){
									System.out.println("Você não comprou");
									
								}else {
									i--;
								}
							}

						} else if(this.tabuleiro.getTabuleiro().get(posicaoFinal).isDisponivel() == false 
								&& this.tabuleiro.getTabuleiro().get(posicaoFinal).tipo().equals("Companhia")){
							Companhia companhiaReves = (Companhia) this.tabuleiro.getTabuleiro().get(posicaoFinal);
							String dono = companhiaReves.getDono().getNome();
							double valorAPagar = somaDados * companhiaReves.getMultiplicador();
							this.tabuleiro.getJogadores().get(i).recebaReves(valorAPagar);
							System.out.println("Você caiu na propriedade de "+dono+" e irá pagar "+valorAPagar+"$");
							
						}else {
							System.out.println("Propriedade não está disponível\n");
						}

					} else if ((this.getTabuleiro().getTabuleiro().get(posicaoFinal).tipo().equals("Sorte ou Revés"))) {
						Carta c = this.tabuleiro.getBaralho().puchaCarta();
						System.out.println();

						if (c.tipo().equals("PAGUE")) {
							this.tabuleiro.getJogadores().get(i).pagueReves(c.getPague());

						} else if (c.tipo().equals("RECEBA")) {
							this.tabuleiro.getJogadores().get(i).recebaReves(c.getReceba());

						} else if (c.tipo().equals("RECEBADECADA")) {
							this.tabuleiro.getJogadores().get(i).recebeDeCada(this.tabuleiro.getJogadores(), this.tabuleiro.getJogadores().get(i));
						
						} else if (c.tipo().equals("INICIO")) {
							this.tabuleiro.getJogadores().get(i).setPosicao(0);

						} else if (c.tipo().equals("SAIDADAPRISAO")) {
							this.tabuleiro.getJogadores().get(i).setTemCarta(true);

						} else if (c.tipo().equals("PRESO")) {
							System.out.println("Você está na prisão");
							for (int k = posicaoFinal; k < this.tabuleiro.getTabuleiro().size(); k++) {
								if (this.tabuleiro.getPosicoes().get(k).tipo().equals("Prisão (vá para prisão)")) {
									this.tabuleiro.getJogadores().get(i).setPosicao(k); 
								}
							}
						
						} else if (c.tipo().equals("JOGANOVAMENTE")) {
							i--;

						} else {
							if ((dado1 + dado2) % 2 == 0) {
								this.tabuleiro.getJogadores().get(i).recebaReves(c.getReceba()); // SORTE
							} else {
								this.tabuleiro.getJogadores().get(i).pagueReves(c.getPague()); // REVÉS
							}

						}
					} else if (this.getTabuleiro().getTabuleiro().get(posicaoFinal).tipo()
							.equals("Prisão (vá para prisão)")) {
						System.out.println("Jogador " + " " + this.tabuleiro.getJogadores().get(i).getNome()
								+ " Foi preso\n" + "Você possui algumas formas de sair: " + "Pagar uma taxa de $50.00, "
								+ "Utilizar carta de soltura já adquirida ou "
								+ "Jogar os dados e tentar a sorte, se cairem dois números iguais, estará solto");
						this.tabuleiro.getJogadores().get(i).setPreso(true);

					} else if(this.getTabuleiro().getTabuleiro().get(posicaoFinal).tipo().equals("Propriedade")) {
						if (this.tabuleiro.getTabuleiro().get(posicaoFinal).isDisponivel() == true) {

							if (this.tabuleiro.getJogadores().get(i).getSaldo() >= this.tabuleiro.getTabuleiro()
									.get(this.getTabuleiro().getJogadores().get(i).getPosicao()).getValor()) {
									System.out
											.println(
													"O titulo "
															+ this.tabuleiro.getTabuleiro()
																	.get(this.getTabuleiro().getJogadores().get(i)
																			.getPosicao())
																	.getNome()
															+ " está disponivel por "
															+ this.tabuleiro.getTabuleiro().get(
																	this.getTabuleiro().getJogadores().get(i).getPosicao())
																	.getValor()
															+ "$");
									System.out.println(
											"Você possui " + this.tabuleiro.getJogadores().get(i).getSaldo() + "$"+"\nDeseja comprar? (Sim/Não)");
									String resposta = scan.next().toLowerCase().substring(0);
									boolean passou = false;
									if(resposta.equals("n") || resposta.equals("s") || resposta.equals("sim") || resposta.equals("nao") || resposta.equals("não")) {
										passou = true;
									}else {
										do {
											System.out.print("Você deseja comprar (Sim/Não)? ");
											resposta = scan.next().toLowerCase().substring(0);
											if(resposta.equals("n") || resposta.equals("s") || resposta.equals("sim") || resposta.equals("nao") || resposta.equals("não")) {
												passou = true;
											}
										
										}while(passou == false);
									}
									if (resposta.equals("s") || resposta.equals("sim")) {
										this.getTabuleiro().getJogadores().get(i).compra(this.tabuleiro.getTabuleiro()
												.get(this.getTabuleiro().getJogadores().get(i).getPosicao()));
										this.getTabuleiro().getJogadores().get(i).getPropriedadesProprias().add((Propriedade)this.tabuleiro.getTabuleiro().get(posicaoFinal));
										this.tabuleiro.getTabuleiro().get(posicaoFinal).setDisponivel(false);
										System.out.println("Você comprou esta propriedade: " + this.tabuleiro.getTabuleiro()
												.get(this.getTabuleiro().getJogadores().get(i).getPosicao()).getNome()
												+ "\nParabéns!\n");
										
	
									} else if(resposta.equals("nao") || resposta.equals("não") || resposta.equals("n")){
										System.out.println("Você não comprou");
										
									}else {
										System.out.println("Opção incorreta, digite novamente.");
									}
							}
						}
					
					}else {
						System.out.println("Nada aconteceu");
					}

				} else if (jogada.equals("status")) {
					System.out.println(this.tabuleiro.getJogadores().get(i).toString());
					i--;

				} else if (jogada.equals("sair")) {
					this.tabuleiro.getJogadores().remove(i);
					this.tabuleiro.getJogadores().get(i).mudaDisponivel(true);
					System.out.println("Jogada encerrada");

				} else {
					System.out.println("Comando errado, tente novamente");
					i--;
				}
			} else {
				System.out.println("Você ainda esta preso");
				System.out.print("Saldo atual: " + this.tabuleiro.getJogadores().get(i).getSaldo() + "\n");
				System.out.println("Comandos: [pagar][carta][jogar][status][sair]");
				String opcao2 = scan.next();
				if (opcao2.toLowerCase().equals("pagar")) {
					if (this.tabuleiro.getJogadores().get(i).getSaldo() >= 50.00) {
						double saldoTotal = ((this.tabuleiro.getJogadores().get(i).getSaldo()) - 50.00);
						this.tabuleiro.getJogadores().get(i).setSaldo(saldoTotal);
						this.tabuleiro.getJogadores().get(i).setPreso(false);
						System.out.println("Você pagou $50.00 por sua soltura, seu saldo atual agora é de: "
								+ this.tabuleiro.getJogadores().get(i).getSaldo());
					} else {
						System.out.println("Você não possui saldo suficiente");
					}

				} else if (opcao2.toLowerCase().equals("carta")) {
					if (this.tabuleiro.getJogadores().get(i).isTemCarta() == true) {// se carta for adquirida
						this.tabuleiro.getJogadores().get(i).setPreso(false);
						this.tabuleiro.getJogadores().get(i).setTemCarta(false);
					} else {
						System.out.println("Você não possui a carta, escolha outra opção");
						i--;
					}

				} else if (opcao2.toLowerCase().equals("jogar")) {
					int dado3 = this.tabuleiro.getDado1().jogada();
					int dado4 = this.tabuleiro.getDado2().jogada();
					if (dado3 == dado4) {
						this.tabuleiro.getJogadores().get(i).setPreso(false);
						System.out.println("Parabéns, você conseguiu! Seus dados foram: " + dado3 + dado4);
					} else {
						System.out.println("Não foi dessa vez, você tirou os dados: " + dado3 + ", " + dado4);
					}
				} else if (opcao2.toLowerCase().equals("status")) {
					this.tabuleiro.getJogadores().get(i).toString();
					i--;
				} else if (opcao2.toLowerCase().equals("sair")) {
					System.out.println("Jogada encerrada");
				} else {
					System.out.println("Jogada não encontrada, por favor, escolha novamente uma opção");
					i--;
				}
			}
		}
	}

	/**
	 * Aqui é onde é repassado o menu, ou seja, as opções que o usuário terá para
	 * escolher.(Jogar, instruções, créditos,encerrar jogo).
	 */
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int ganhador = 0;
		while (ganhador == 0) {
			System.out.println(
					"\n		Bem-Vindo ao banco imobiliario!!\n" + "                   =========================\n"
							+ "                  |     1 - Jogar           |\n"
							+ "                  |     2 - Instruções      |\n"
							+ "                  |     3 - Créditos        |\n"
							+ "                  |     0 - Encerrar Jogo   |\n"
							+ "                   =========================\n");
			int opcao = scan.nextInt();

			if (opcao == 1) {
				this.iniciaTabuleiro();
				try {
					this.adicionaJogadores(); // Adiciona os jogadores //
					System.out.println("  -------------------------------------------\n"
							+ " | O Banco Imobiliário vai começar. Aproveite! |\n"
							+ "   -------------------------------------------");
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
				// this.jogadaDaVez();
				do {
					this.jogadaDaVez();
				} while (ganhador == 0);

				break;
			} else if (opcao == 2) {
				System.out.println(
						"	Objetivo: Tornar-se o jogador mais rico, através de compra, aluguel ou venda de propriedades.\n"
								+ "\n"
								+ "	JOGADORES: Podem jogar de 2 a 6 pessoas, as quais escolhem a cor de seus piões, colocando-os no ponto de partida. Em seguida embaralham-se as cartas de Sorte e Revés. Cada jogador deve receber $1500.\r\n"
								+ "\n"
								+ "	COMEÇO DO JOGO: O primeiro jogador lança os dados e, conforme o número de pontos que tirar, avança o seu pião em sentido horário para o espaço atingido. Num só espaço podem parar vários piões ao mesmo tempo. Se cair num terreno ou empresa poderá comprá-las ao banco, pagando o preço indicado no tabuleiro.\r\n"
								+ "	De acordo com as indicações constantes dos lugares alcançados, pagam-se impostos, recebem-se lucros, tira-se um cartão de SORTE ou REVÉS e executa-se a ordem respectiva (definida na nessa tabela), devolvendo o cartão, colocando-o por baixo do baralho do qual foi tirado.\r\n"
								+ "	Tirando uma dupla (2 e 2, 3 e 3, etc.) o jogador tem direito a novo lançamento; uma segunda dupla dá direito igual, mas se tirar uma terceira dupla vai para a prisão.\n"
								+ "\n"
								+ "	PRISÃO: Se o jogador cair no campo “Vá para a prisão�? ou se tirar 3 duplas seguidas, irá com o seu pião para a prisão. Se porém alcançar a prisão em lances regulares será considerado visitante e poderá continuar normalmente o jogo quando chegar a sua vez.\r\n"
								+ "	Da prisão o jogador poderá sair tirar uma dupla, andando o número de pontos conseguidos nos dados, ou pagar $50 ao banco e jogar em seguida. Também poderá sair da prisão se possuir o cartão “Saída livre da prisão�?.\r\n"
								+ "\n"
								+ "	HONORÁRIOS: Cada vez que o jogador alcançar o Ponto de Partida ou por ele passar receberá do banco $200 como honorários.\r\n"
								+ "\n"
								+ "	TERRENO OU EMPRESA COM DONO: Se o jogador alcançar um terreno ou empresa que já tenha sido adquirido, pagará aluguel ou taxa correspondente, ao respectivo proprietário, conforme os dados constantes do título.\r\n"
								+ "\n"
								+ "	CONSTRUÇÕES: Logo que o jogador possua todo um grupo de propriedades da mesma cor, ele poderá construir casas pagando ao banco os preços indicados nos títulos.\r\n"
								+ "	Em cada terreno pode-se construir 4 casas e tendo construído 4 casas, no mesmo terreno, pode-se construir nele um hotel.\r\n"
								+ "	O jogador não pode colocar 3 casas em uma propriedade e nenhuma em outra, do mesmo grupo de cor. Ele deve colocar uma em cada propriedade do mesmo grupo de cor, antes de colocar a segunda e assim sucessivamente até a compra do hotel.\r\n"
								+ "\n"
								+ "	HIPOTECAS: Terrenos sem construção (caso haja casas ou hotel é necessário antes vendê-las ao banco pela metade do preço) e empresas podem ser hipotecadas pelos valores determinados nos títulos por qualquer período de tempo.\r\n"
								+ "\n"
								+ "	VENDA DE CASAS E HOTÉIS: O jogador pode optar pela venda de casas ou hotéis para o banco, em qualquer período de tempo, pela metade do preço pago.\r\n"
								+ "\n"
								+ "	FALÊNCIA: Se mesmo após vender suas casas e hotéis, hipotecar ou vender suas propriedades o jogador não conseguir pagar suas dívidas ele irá à falência, e se sairá do jogo. Caso haja propriedades hipotecadas o banco deverá resgatá-las.\r\n"
								+ " \n"
								+ "	TÉRMINO DO JOGO: O jogo termina quando ficar somente um jogador (os outros foram à falência ou desistiram).");
				System.out.println("                  =========================");
				System.out.println("                  |     1 - Voltar         |");
				System.out.println("                  |     0 - Encerrar Jogo  |");
				System.out.println("                  =========================");
				int opcao1 = scan.nextInt();
				if (opcao1 == 1) {
					continue;
				} else if (opcao1 == 0) {
					System.out.println("O jogo está¡ sendo encerrado!");
					break;
				}
			} else if (opcao == 3) {
				System.out.println("Um jogo fantástico!\n"
						+ "Conhecido no mundo inteiro como um dos jogos mais fascinantes para a família toda!\n"
						+ "Você pode fazer fortuna com seus imóveis ou acabar indo à falência.\n"
						+ "Com iniciativa, coragem e um pouco de sorte você se torna milionário e monopoliza o mercado imobiliário.\n"
						+ "		\nPREPARE-SE PARA ESSA EMOÇÃO!\n\n" + "Made by: Pedro Henrique and Lucas Antonio \n"
						+ "Disciplina: Programação Orientada a Objetos. \n" + "Professor: Fábio  \n"
						+ "Curso: Sistemas de Informacão(Bacharel) 3º Periodo");
				System.out.println("\n\n                   =========================");
				System.out.println("                  |     1 - Voltar         |");
				System.out.println("                  |     0 - Encerrar Jogo  |");
				System.out.println("                   =========================");
				int opcao2 = scan.nextInt();
				if (opcao2 == 1) {
					continue;
				} else if (opcao2 == 0) {
					System.out.println("Jogo encerrado!");
					break;

				}
			} else if (opcao == 0) {
				System.out.println("Jogo encerrado");
				break;
			} else {
				System.out.println("Você digitou um número inválido, digite novamente. \n");
				continue;
			}
		}
		scan.close();
	}
}
