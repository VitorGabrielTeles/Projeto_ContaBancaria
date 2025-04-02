package conta.controller;

import java.util.ArrayList;
import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA conta numero: " + conta.getNumero() + "foi criada com sucesso!");
	}

	@Override
	public void atualizar(Conta conta) {
	}

	@Override
	public void deletar(int numero) {
	}

	@Override
	public void sacar(int numero, float valor) {
	}

	@Override
	public void depositar(int numero, float valor) {
	}
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {	
	}

	@Override
	public void listarTodas() {
	    if (listaContas.isEmpty()) {
	        System.out.println("Não há contas cadastradas.");
	        return;
	    }
	    for (Conta conta : listaContas) {
	        conta.visualizar();
	    }
	}
	
	public int gerarNumero() {
		return ++ numero;
	}




	
}
