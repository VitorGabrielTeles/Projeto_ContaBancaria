<<<<<<< HEAD
package conta;

import java.io.IOException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaCorente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class menu {
	public static void main(String[] args) {
		
		ContaController contas = new ContaController();

		Scanner leia = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario = 0;
		String titular;
		float saldo, limite;
		
		System.out.println("\nCriar Contas\n");

		ContaCorente cc1 = new ContaCorente(contas.gerarNumero(), 123, 1, "João da Silva", 1000f, 100.0f);
		contas.cadastrar(cc1);

		ContaCorente cc2 = new ContaCorente(contas.gerarNumero(), 124, 1, "Maria da Silva", 2000f, 100.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Mariana dos Santos", 4000f, 12);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumero(), 125, 2, "Juliana Ramos", 8000f, 15);
		contas.cadastrar(cp2);

		contas.listarTodas();


		while (true) {
			
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_WHITE_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               BANCO DO TELES COM UM L               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco Teles com um L - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_CYAN +"Criar Conta\n\n");
					
					System.out.println("Digite o numero da Agencia: ");
					agencia = leia.nextInt();
					System.out.println("Digite o nome do Titular: ");
					agencia = leia.nextInt();
					leia.skip("\\R?");
					titular = leia.nextLine();
					
					do {
						System.out.println("Digite o tipo da conta (1- CC ou 2- CP): ");
						tipo = leia.nextInt();
						
					} while (tipo < 1 && tipo > 2);
					
					System.out.println("Digite o saldo da conta (R$): ");
					saldo = leia.nextFloat();
					
					switch (tipo) {
					    case 1 -> {
					    	System.out.println("Digite o limite de credito (R$): ");
					    	limite = leia.nextFloat();
					    	contas.cadastrar(new ContaCorente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					    }
					    case 2 -> {
					    	System.out.println("Digite o dia do aniversario da conta: ");
					    	limite = leia.nextFloat();
					    	contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
					    }
					}

					
					break;
				case 2:
					System.out.println(Cores.TEXT_CYAN +"Listar todas as Contas\n\n");
					contas.listarTodas();
					keyPress();
					break;
				case 3:
					System.out.println(Cores.TEXT_CYAN +"Consultar dados da Conta - por número\n\n");
					keyPress();

					break;
				case 4:
					System.out.println(Cores.TEXT_CYAN +"Atualizar dados da Conta\n\n");
					keyPress();

					break;
				case 5:
					System.out.println(Cores.TEXT_CYAN +"Apagar a Conta\n\n");
					keyPress();

					break;
				case 6:
					System.out.println(Cores.TEXT_CYAN +"Saque\n\n");
					keyPress();

					break;
				case 7:
					System.out.println(Cores.TEXT_CYAN +"Depósito\n\n");
					keyPress();

					break;
				case 8:
					System.out.println(Cores.TEXT_CYAN +"Transferência entre Contas\n\n");
					keyPress();

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vitor Teles ");
		System.out.println("Vitor Teles - vitorl@genstudents.org");
		System.out.println("https://github.com/VitorGabrielTeles");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		
	}	
=======
package conta;

import java.util.Scanner;
import conta.util.Cores;
public class menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_WHITE_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("               BANCO DO TELES COM UM L               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco Teles com um L - O seu Futuro começa aqui!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(Cores.TEXT_CYAN +"Criar Conta\n\n");

					break;
				case 2:
					System.out.println(Cores.TEXT_CYAN +"Listar todas as Contas\n\n");

					break;
				case 3:
					System.out.println(Cores.TEXT_CYAN +"Consultar dados da Conta - por número\n\n");

					break;
				case 4:
					System.out.println(Cores.TEXT_CYAN +"Atualizar dados da Conta\n\n");

					break;
				case 5:
					System.out.println(Cores.TEXT_CYAN +"Apagar a Conta\n\n");

					break;
				case 6:
					System.out.println(Cores.TEXT_CYAN +"Saque\n\n");

					break;
				case 7:
					System.out.println(Cores.TEXT_CYAN +"Depósito\n\n");

					break;
				case 8:
					System.out.println(Cores.TEXT_CYAN +"Transferência entre Contas\n\n");

					break;
				default:
					System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Vitor Teles ");
		System.out.println("Vitor Teles - vitorl@genstudents.org");
		System.out.println("https://github.com/VitorGabrielTeles");
		System.out.println("*********************************************************");
	}
>>>>>>> 812baaef3ae0ae083189b109adf26ad349f0c810
}