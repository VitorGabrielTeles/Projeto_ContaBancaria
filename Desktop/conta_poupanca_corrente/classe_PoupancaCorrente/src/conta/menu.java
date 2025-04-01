package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.model.ContaCorente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class menu {
	public static void main(String[] args) {
		
		Conta c1 = new Conta(1, 123, 1, "Adriana", 10000.0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(5000.0f);
		c1.visualizar();
		
		ContaCorente cc1 = new ContaCorente(2, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();	

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
}